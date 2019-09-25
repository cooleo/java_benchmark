# java_benchmark
```
# JMH version: 1.19
# VM version: JDK 1.8.0_161, VM 25.161-b12
# VM invoker: C:\Program Files\Java\jdk1.8.0_161\jre\bin\java.exe
# VM options: -javaagent:C:\Users\a647113\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\lib\idea_rt.jar=63697:C:\Users\a647113\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2019.1.1\bin -Dfile.encoding=UTF-8
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: hello.StreamBenchMark.stream


Result "StreamBenchMark.iterator":
  8.207 ±(99.9%) 0.135 ns/op [Average]
  (min, avg, max) = (7.498, 8.207, 12.762), stdev = 0.570
  CI (99.9%): [8.072, 8.341] (assumes normal distribution)


# Run complete. Total time: 00:20:51

Benchmark                       Mode  Cnt   Score   Error  Units
StreamBenchMark.stream          avgt  200  11.409 ± 0.197  ns/op
StreamBenchMark.streamParallel  avgt  200   9.319 ± 0.119  ns/op
StreamBenchMark.iterator         avgt  200   8.207 ± 0.135  ns/op
```
