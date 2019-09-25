//https://jaxenter.com/java-performance-tutorial-how-fast-are-the-java-8-streams-118830.html
//http://openjdk.java.net/projects/code-tools/jmh/
//https://stackoverflow.com/questions/22658322/java-8-performance-of-streams-vs-collections
import org.openjdk.jmh.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@OperationsPerInvocation(StreamBenchMark.N)
public class StreamBenchMark {
	public static final int N = 10000;

	static List<Integer> sourceList = new ArrayList<>();
	static {
		for (int i = 0; i < N; i++) {
			sourceList.add(i);
		}
	}

	@Benchmark
	public List<Double> iterator() {
		List<Double> result = new ArrayList<>(sourceList.size() / 2 + 1);
		for (Integer i : sourceList) {
			if (i % 2 == 0){
				result.add(Math.sqrt(i));
			}
		}
		return result;
	}

	@Benchmark
	public List<Double> stream() {
		return sourceList.stream()
				.filter(i -> i % 2 == 0)
				.map(Math::sqrt)
				.collect(Collectors.toCollection(
						() -> new ArrayList<>(sourceList.size() / 2 + 1)));
	}
	@Benchmark
	public List<Double> streamParallel() {
		return sourceList.stream()
				.parallel()
				.filter(i -> i % 2 == 0)
				.map(Math::sqrt)
				.collect(Collectors.toCollection(
						() -> new ArrayList<>(sourceList.size() / 2 + 1)));
	}
}
