# java_benchmark
```
System:
Processor	Intel(R) Xeon(R) CPU E5-2660 v3 @ 2.60GHz, 2597 Mhz, 4 Core(s), 4 Logical Processor(s)
BIOS Version/Date	Phoenix Technologies LTD 6.00, 05/04/2016
SMBIOS Version	2.7

Installed Physical Memory (RAM)	12.0 GB
Total Physical Memory	12.0 GB
Available Physical Memory	3.33 GB
Total Virtual Memory	27.6 GB
Available Virtual Memory	11.1 GB
Page File Space	15.6 GB


# JMH version: 1.19
# VM version: JDK 1.8.0_161, VM 25.161-b12
# VM invoker: C:\Program Files\Java\jdk1.8.0_161\jre\bin\java.exe
# Warmup: 20 iterations, 1 s each
# Measurement: 20 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op

# Run complete. Total time: 00:20:51

Benchmark                       Mode  Cnt   Score   Error  Units
StreamBenchMark.stream          avgt  200  11.409 ± 0.197  ns/op
StreamBenchMark.streamParallel  avgt  200   9.319 ± 0.119  ns/op
StreamBenchMark.iterator         avgt  200   8.207 ± 0.135  ns/op
```
