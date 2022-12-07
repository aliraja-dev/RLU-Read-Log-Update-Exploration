package rlu.benchmarks.jmh_generated;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.runner.InfraControl;
import org.openjdk.jmh.infra.ThreadParams;
import org.openjdk.jmh.results.BenchmarkTaskResult;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.ThroughputResult;
import org.openjdk.jmh.results.AverageTimeResult;
import org.openjdk.jmh.results.SampleTimeResult;
import org.openjdk.jmh.results.SingleShotResult;
import org.openjdk.jmh.util.SampleBuffer;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.results.RawResults;
import org.openjdk.jmh.results.ResultRole;
import java.lang.reflect.Field;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.infra.IterationParams;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.infra.Control;
import org.openjdk.jmh.results.ScalarResult;
import org.openjdk.jmh.results.AggregationPolicy;
import org.openjdk.jmh.runner.FailureAssistException;

import rlu.benchmarks.jmh_generated.RluFineBSTBenchmark_GlobalState_jmhType;
import rlu.benchmarks.jmh_generated.RluFineBSTBenchmark_jmhType;
import rlu.benchmarks.jmh_generated.RluFineBSTBenchmark_ThreadState_jmhType;
import rlu.benchmarks.jmh_generated.RluFineBSTBenchmark_ThreadState_jmhType;
public final class RluFineBSTBenchmark_g8for80_jmhTest {

    byte p000, p001, p002, p003, p004, p005, p006, p007, p008, p009, p010, p011, p012, p013, p014, p015;
    byte p016, p017, p018, p019, p020, p021, p022, p023, p024, p025, p026, p027, p028, p029, p030, p031;
    byte p032, p033, p034, p035, p036, p037, p038, p039, p040, p041, p042, p043, p044, p045, p046, p047;
    byte p048, p049, p050, p051, p052, p053, p054, p055, p056, p057, p058, p059, p060, p061, p062, p063;
    byte p064, p065, p066, p067, p068, p069, p070, p071, p072, p073, p074, p075, p076, p077, p078, p079;
    byte p080, p081, p082, p083, p084, p085, p086, p087, p088, p089, p090, p091, p092, p093, p094, p095;
    byte p096, p097, p098, p099, p100, p101, p102, p103, p104, p105, p106, p107, p108, p109, p110, p111;
    byte p112, p113, p114, p115, p116, p117, p118, p119, p120, p121, p122, p123, p124, p125, p126, p127;
    byte p128, p129, p130, p131, p132, p133, p134, p135, p136, p137, p138, p139, p140, p141, p142, p143;
    byte p144, p145, p146, p147, p148, p149, p150, p151, p152, p153, p154, p155, p156, p157, p158, p159;
    byte p160, p161, p162, p163, p164, p165, p166, p167, p168, p169, p170, p171, p172, p173, p174, p175;
    byte p176, p177, p178, p179, p180, p181, p182, p183, p184, p185, p186, p187, p188, p189, p190, p191;
    byte p192, p193, p194, p195, p196, p197, p198, p199, p200, p201, p202, p203, p204, p205, p206, p207;
    byte p208, p209, p210, p211, p212, p213, p214, p215, p216, p217, p218, p219, p220, p221, p222, p223;
    byte p224, p225, p226, p227, p228, p229, p230, p231, p232, p233, p234, p235, p236, p237, p238, p239;
    byte p240, p241, p242, p243, p244, p245, p246, p247, p248, p249, p250, p251, p252, p253, p254, p255;
    int startRndMask;
    BenchmarkParams benchmarkParams;
    IterationParams iterationParams;
    ThreadParams threadParams;
    Blackhole blackhole;
    Control notifyControl;

    public BenchmarkTaskResult g8for80_Throughput(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0 = _jmh_tryInit_f_threadstate2_0(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_0.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate2_0.forEveryInvocation();
                if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (!l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.generateItem();
                            l_globalstate1_G.readyInvocation = true;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
                if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.readyInvocation = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            read8With80PercentContains_thrpt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_globalstate1_G, l_threadstate2_0, l_rlufinebstbenchmark0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate2_0.forEveryInvocation();
                    if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (!l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.generateItem();
                                l_globalstate1_G.readyInvocation = true;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
                    if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.readyInvocation = false;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    res.allOps++;
                }
            } catch (Throwable e) {
                if (!(e instanceof InterruptedException)) throw e;
            }
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_0.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_0 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult((long)res.allOps, (long)res.measuredOps);
            results.add(new ThroughputResult(ResultRole.PRIMARY, "g8for80", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new ThroughputResult(ResultRole.SECONDARY, "read8With80PercentContains", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1 = _jmh_tryInit_f_threadstate2_1(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_1.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate2_1.forEveryInvocation();
                if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (!l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.generateItem();
                            l_globalstate1_G.readyInvocation = true;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
                if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.readyInvocation = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            write8With80PercentContains_thrpt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_globalstate1_G, l_threadstate2_1, l_rlufinebstbenchmark0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate2_1.forEveryInvocation();
                    if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (!l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.generateItem();
                                l_globalstate1_G.readyInvocation = true;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
                    if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.readyInvocation = false;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    res.allOps++;
                }
            } catch (Throwable e) {
                if (!(e instanceof InterruptedException)) throw e;
            }
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_1.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_1 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult((long)res.allOps, (long)res.measuredOps);
            results.add(new ThroughputResult(ResultRole.PRIMARY, "g8for80", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new ThroughputResult(ResultRole.SECONDARY, "write8With80PercentContains", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void read8With80PercentContains_thrpt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_threadstate2_0.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public static void write8With80PercentContains_thrpt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_threadstate2_1.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult g8for80_AverageTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0 = _jmh_tryInit_f_threadstate2_0(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_0.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate2_0.forEveryInvocation();
                if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (!l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.generateItem();
                            l_globalstate1_G.readyInvocation = true;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
                if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.readyInvocation = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            read8With80PercentContains_avgt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_globalstate1_G, l_threadstate2_0, l_rlufinebstbenchmark0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate2_0.forEveryInvocation();
                    if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (!l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.generateItem();
                                l_globalstate1_G.readyInvocation = true;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
                    if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.readyInvocation = false;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    res.allOps++;
                }
            } catch (Throwable e) {
                if (!(e instanceof InterruptedException)) throw e;
            }
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_0.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_0 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult((long)res.allOps, (long)res.measuredOps);
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "g8for80", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new AverageTimeResult(ResultRole.SECONDARY, "read8With80PercentContains", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1 = _jmh_tryInit_f_threadstate2_1(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_1.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate2_1.forEveryInvocation();
                if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (!l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.generateItem();
                            l_globalstate1_G.readyInvocation = true;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
                if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.readyInvocation = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            write8With80PercentContains_avgt_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, l_globalstate1_G, l_threadstate2_1, l_rlufinebstbenchmark0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate2_1.forEveryInvocation();
                    if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (!l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.generateItem();
                                l_globalstate1_G.readyInvocation = true;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
                    if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.readyInvocation = false;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    res.allOps++;
                }
            } catch (Throwable e) {
                if (!(e instanceof InterruptedException)) throw e;
            }
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_1.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_1 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps;
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            res.measuredOps /= batchSize;
            BenchmarkTaskResult results = new BenchmarkTaskResult((long)res.allOps, (long)res.measuredOps);
            results.add(new AverageTimeResult(ResultRole.PRIMARY, "g8for80", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            results.add(new AverageTimeResult(ResultRole.SECONDARY, "write8With80PercentContains", res.measuredOps, res.getTime(), benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void read8With80PercentContains_avgt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_threadstate2_0.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public static void write8With80PercentContains_avgt_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long operations = 0;
        long realTime = 0;
        result.startTime = System.nanoTime();
        do {
            l_threadstate2_1.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            operations++;
        } while(!control.isDone);
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult g8for80_SampleTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RawResults res = new RawResults();
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0 = _jmh_tryInit_f_threadstate2_0(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_0.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate2_0.forEveryInvocation();
                if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (!l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.generateItem();
                            l_globalstate1_G.readyInvocation = true;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
                if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.readyInvocation = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            SampleBuffer buffer = new SampleBuffer();
            read8With80PercentContains_sample_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, buffer, targetSamples, opsPerInv, batchSize, l_globalstate1_G, l_threadstate2_0, l_rlufinebstbenchmark0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate2_0.forEveryInvocation();
                    if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (!l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.generateItem();
                                l_globalstate1_G.readyInvocation = true;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
                    if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.readyInvocation = false;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    res.allOps++;
                }
            } catch (Throwable e) {
                if (!(e instanceof InterruptedException)) throw e;
            }
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_0.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_0 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps * batchSize;
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult((long)res.allOps, (long)res.measuredOps);
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "g8for80", buffer, benchmarkParams.getTimeUnit()));
            results.add(new SampleTimeResult(ResultRole.SECONDARY, "read8With80PercentContains", buffer, benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RawResults res = new RawResults();
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1 = _jmh_tryInit_f_threadstate2_1(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_1.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            control.announceWarmupReady();
            while (control.warmupShouldWait) {
                l_threadstate2_1.forEveryInvocation();
                if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (!l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.generateItem();
                            l_globalstate1_G.readyInvocation = true;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
                if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                    try {
                        if (control.isFailing) throw new FailureAssistException();
                        if (l_globalstate1_G.readyInvocation) {
                            l_globalstate1_G.readyInvocation = false;
                        }
                    } catch (Throwable t) {
                        control.isFailing = true;
                        throw t;
                    } finally {
                        RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                    }
                } else {
                    while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                        if (control.isFailing) throw new FailureAssistException();
                        if (Thread.interrupted()) throw new InterruptedException();
                    }
                }
                res.allOps++;
            }

            notifyControl.startMeasurement = true;
            int targetSamples = (int) (control.getDuration(TimeUnit.MILLISECONDS) * 20); // at max, 20 timestamps per millisecond
            int batchSize = iterationParams.getBatchSize();
            int opsPerInv = benchmarkParams.getOpsPerInvocation();
            SampleBuffer buffer = new SampleBuffer();
            write8With80PercentContains_sample_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, buffer, targetSamples, opsPerInv, batchSize, l_globalstate1_G, l_threadstate2_1, l_rlufinebstbenchmark0_G);
            notifyControl.stopMeasurement = true;
            control.announceWarmdownReady();
            try {
                while (control.warmdownShouldWait) {
                    l_threadstate2_1.forEveryInvocation();
                    if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (!l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.generateItem();
                                l_globalstate1_G.readyInvocation = true;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
                    if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                        try {
                            if (control.isFailing) throw new FailureAssistException();
                            if (l_globalstate1_G.readyInvocation) {
                                l_globalstate1_G.readyInvocation = false;
                            }
                        } catch (Throwable t) {
                            control.isFailing = true;
                            throw t;
                        } finally {
                            RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                        }
                    } else {
                        while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                            if (control.isFailing) throw new FailureAssistException();
                            if (Thread.interrupted()) throw new InterruptedException();
                        }
                    }
                    res.allOps++;
                }
            } catch (Throwable e) {
                if (!(e instanceof InterruptedException)) throw e;
            }
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_1.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_1 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            res.allOps += res.measuredOps * batchSize;
            res.allOps *= opsPerInv;
            res.allOps /= batchSize;
            res.measuredOps *= opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult((long)res.allOps, (long)res.measuredOps);
            results.add(new SampleTimeResult(ResultRole.PRIMARY, "g8for80", buffer, benchmarkParams.getTimeUnit()));
            results.add(new SampleTimeResult(ResultRole.SECONDARY, "write8With80PercentContains", buffer, benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void read8With80PercentContains_sample_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long realTime = 0;
        long operations = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            l_threadstate2_0.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            operations++;
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
        result.realTime = realTime;
        result.measuredOps = operations;
    }

    public static void write8With80PercentContains_sample_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, SampleBuffer buffer, int targetSamples, long opsPerInv, int batchSize, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long realTime = 0;
        long operations = 0;
        int rnd = (int)System.nanoTime();
        int rndMask = startRndMask;
        long time = 0;
        int currentStride = 0;
        do {
            l_threadstate2_1.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            rnd = (rnd * 1664525 + 1013904223);
            boolean sample = (rnd & rndMask) == 0;
            if (sample) {
                time = System.nanoTime();
            }
            for (int b = 0; b < batchSize; b++) {
                if (control.volatileSpoiler) return;
                l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
            }
            if (sample) {
                buffer.add((System.nanoTime() - time) / opsPerInv);
                if (currentStride++ > targetSamples) {
                    buffer.half();
                    currentStride = 0;
                    rndMask = (rndMask << 1) + 1;
                }
            }
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            operations++;
        } while(!control.isDone);
        startRndMask = Math.max(startRndMask, rndMask);
        result.realTime = realTime;
        result.measuredOps = operations;
    }


    public BenchmarkTaskResult g8for80_SingleShotTime(InfraControl control, ThreadParams threadParams) throws Throwable {
        this.benchmarkParams = control.benchmarkParams;
        this.iterationParams = control.iterationParams;
        this.threadParams    = threadParams;
        this.notifyControl   = control.notifyControl;
        if (this.blackhole == null) {
            this.blackhole = new Blackhole("Today's password is swordfish. I understand instantiating Blackholes directly is dangerous.");
        }
        if (threadParams.getSubgroupIndex() == 0) {
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0 = _jmh_tryInit_f_threadstate2_0(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_0.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            notifyControl.startMeasurement = true;
            RawResults res = new RawResults();
            int batchSize = iterationParams.getBatchSize();
            read8With80PercentContains_ss_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, batchSize, l_globalstate1_G, l_threadstate2_0, l_rlufinebstbenchmark0_G);
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_0.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_0 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            long totalOps = opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(totalOps, totalOps);
            results.add(new SingleShotResult(ResultRole.PRIMARY, "g8for80", res.getTime(), totalOps, benchmarkParams.getTimeUnit()));
            results.add(new SingleShotResult(ResultRole.SECONDARY, "read8With80PercentContains", res.getTime(), totalOps, benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
        if (threadParams.getSubgroupIndex() == 1) {
            RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G = _jmh_tryInit_f_rlufinebstbenchmark0_G(control);
            RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1 = _jmh_tryInit_f_threadstate2_1(control);
            RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G = _jmh_tryInit_f_globalstate1_G(control);

            control.preSetup();
            l_threadstate2_1.doSetup();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doSetup();
                        l_globalstate1_G.readyIteration = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }


            notifyControl.startMeasurement = true;
            RawResults res = new RawResults();
            int batchSize = iterationParams.getBatchSize();
            write8With80PercentContains_ss_jmhStub(control, res, benchmarkParams, iterationParams, threadParams, blackhole, notifyControl, startRndMask, batchSize, l_globalstate1_G, l_threadstate2_1, l_rlufinebstbenchmark0_G);
            control.preTearDown();
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyIteration) {
                        l_globalstate1_G.doTearDown();
                        l_globalstate1_G.readyIteration = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearIterationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            l_threadstate2_1.doTearDown();

            if (control.isLastIteration()) {
                f_threadstate2_1 = null;
                synchronized(this.getClass()) {
                    f_globalstate1_G_map.remove(threadParams.getGroupIndex());
                }
                synchronized(this.getClass()) {
                    f_rlufinebstbenchmark0_G_map.remove(threadParams.getGroupIndex());
                }
            }
            int opsPerInv = control.benchmarkParams.getOpsPerInvocation();
            long totalOps = opsPerInv;
            BenchmarkTaskResult results = new BenchmarkTaskResult(totalOps, totalOps);
            results.add(new SingleShotResult(ResultRole.PRIMARY, "g8for80", res.getTime(), totalOps, benchmarkParams.getTimeUnit()));
            results.add(new SingleShotResult(ResultRole.SECONDARY, "write8With80PercentContains", res.getTime(), totalOps, benchmarkParams.getTimeUnit()));
            this.blackhole.evaporate("Yes, I am Stephen Hawking, and know a thing or two about black holes.");
            return results;
        } else
            throw new IllegalStateException("Harness failed to distribute threads among groups properly");
    }

    public static void read8With80PercentContains_ss_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, int batchSize, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_0, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_threadstate2_0.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            l_rlufinebstbenchmark0_G.read8With80PercentContains(l_globalstate1_G, l_threadstate2_0);
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    public static void write8With80PercentContains_ss_jmhStub(InfraControl control, RawResults result, BenchmarkParams benchmarkParams, IterationParams iterationParams, ThreadParams threadParams, Blackhole blackhole, Control notifyControl, int startRndMask, int batchSize, RluFineBSTBenchmark_GlobalState_jmhType l_globalstate1_G, RluFineBSTBenchmark_ThreadState_jmhType l_threadstate2_1, RluFineBSTBenchmark_jmhType l_rlufinebstbenchmark0_G) throws Throwable {
        long realTime = 0;
        result.startTime = System.nanoTime();
        for (int b = 0; b < batchSize; b++) {
            if (control.volatileSpoiler) return;
            l_threadstate2_1.forEveryInvocation();
            if (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (!l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.generateItem();
                        l_globalstate1_G.readyInvocation = true;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.setupInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
            long rt = System.nanoTime();
            l_rlufinebstbenchmark0_G.write8With80PercentContains(l_globalstate1_G, l_threadstate2_1);
            realTime += (System.nanoTime() - rt);
            if (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.compareAndSet(l_globalstate1_G, 0, 1)) {
                try {
                    if (control.isFailing) throw new FailureAssistException();
                    if (l_globalstate1_G.readyInvocation) {
                        l_globalstate1_G.readyInvocation = false;
                    }
                } catch (Throwable t) {
                    control.isFailing = true;
                    throw t;
                } finally {
                    RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.set(l_globalstate1_G, 0);
                }
            } else {
                while (RluFineBSTBenchmark_GlobalState_jmhType.tearInvocationMutexUpdater.get(l_globalstate1_G) == 1) {
                    if (control.isFailing) throw new FailureAssistException();
                    if (Thread.interrupted()) throw new InterruptedException();
                }
            }
        }
        result.stopTime = System.nanoTime();
        result.realTime = realTime;
    }

    
    RluFineBSTBenchmark_ThreadState_jmhType f_threadstate2_0;
    
    RluFineBSTBenchmark_ThreadState_jmhType _jmh_tryInit_f_threadstate2_0(InfraControl control) throws Throwable {
        if (control.isFailing) throw new FailureAssistException();
        RluFineBSTBenchmark_ThreadState_jmhType val = f_threadstate2_0;
        if (val == null) {
            val = new RluFineBSTBenchmark_ThreadState_jmhType();
            f_threadstate2_0 = val;
        }
        return val;
    }
    
    RluFineBSTBenchmark_ThreadState_jmhType f_threadstate2_1;
    
    RluFineBSTBenchmark_ThreadState_jmhType _jmh_tryInit_f_threadstate2_1(InfraControl control) throws Throwable {
        if (control.isFailing) throw new FailureAssistException();
        RluFineBSTBenchmark_ThreadState_jmhType val = f_threadstate2_1;
        if (val == null) {
            val = new RluFineBSTBenchmark_ThreadState_jmhType();
            f_threadstate2_1 = val;
        }
        return val;
    }
    
    static java.util.Map<Integer, RluFineBSTBenchmark_GlobalState_jmhType> f_globalstate1_G_map = java.util.Collections.synchronizedMap(new java.util.HashMap<Integer, RluFineBSTBenchmark_GlobalState_jmhType>());
    
    RluFineBSTBenchmark_GlobalState_jmhType _jmh_tryInit_f_globalstate1_G(InfraControl control) throws Throwable {
        int groupIdx = threadParams.getGroupIndex();
        RluFineBSTBenchmark_GlobalState_jmhType val = f_globalstate1_G_map.get(groupIdx);
        if (val != null) {
            return val;
        }
        synchronized(this.getClass()) {
            try {
            if (control.isFailing) throw new FailureAssistException();
            val = f_globalstate1_G_map.get(groupIdx);
            if (val != null) {
                return val;
            }
            val = new RluFineBSTBenchmark_GlobalState_jmhType();
            val.readyTrial = true;
            f_globalstate1_G_map.put(groupIdx, val);
            } catch (Throwable t) {
                control.isFailing = true;
                throw t;
            }
        }
        return val;
    }
    
    static java.util.Map<Integer, RluFineBSTBenchmark_jmhType> f_rlufinebstbenchmark0_G_map = java.util.Collections.synchronizedMap(new java.util.HashMap<Integer, RluFineBSTBenchmark_jmhType>());
    
    RluFineBSTBenchmark_jmhType _jmh_tryInit_f_rlufinebstbenchmark0_G(InfraControl control) throws Throwable {
        int groupIdx = threadParams.getGroupIndex();
        RluFineBSTBenchmark_jmhType val = f_rlufinebstbenchmark0_G_map.get(groupIdx);
        if (val != null) {
            return val;
        }
        synchronized(this.getClass()) {
            try {
            if (control.isFailing) throw new FailureAssistException();
            val = f_rlufinebstbenchmark0_G_map.get(groupIdx);
            if (val != null) {
                return val;
            }
            val = new RluFineBSTBenchmark_jmhType();
            val.readyTrial = true;
            f_rlufinebstbenchmark0_G_map.put(groupIdx, val);
            } catch (Throwable t) {
                control.isFailing = true;
                throw t;
            }
        }
        return val;
    }


}
