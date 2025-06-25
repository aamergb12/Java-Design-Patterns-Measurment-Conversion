package edu.utdallas.cs2336;

public class ConcreteMath extends AbstractMath {

    public ConcreteMath() {
        super(0); 
    }

    public ConcreteMath(int value) {
        super(value); 
    }

    @Override
    public int decrementBy(int value) {
        runningTotal -= value;
        return runningTotal;
    }

    @Override
    public int multiplyBy(int value) {
        runningTotal *= value;
        return runningTotal;
    }

    @Override
    public int toThisPower(int value) {
        runningTotal = (int) Math.pow(runningTotal, value);
        return runningTotal;
    }

    @Override
    public boolean greaterThan(AbstractMath other) {
        return this.runningTotal > other.runningTotal;
    }

    @Override
    public boolean lessThan(AbstractMath other) {
        return this.runningTotal < other.runningTotal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractMath other = (AbstractMath) obj;
        return this.runningTotal == other.runningTotal;
    }
}
