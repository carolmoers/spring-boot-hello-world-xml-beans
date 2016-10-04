package hello;

import java.util.concurrent.atomic.AtomicLong;

public class Counter {
    private AtomicLong atomicLong;

    public Counter() {
        this.atomicLong = new AtomicLong();
    }

    public Long counter() {
        return atomicLong.incrementAndGet();
    }
}
