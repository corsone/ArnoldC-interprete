public class NatValue extends Value {
    private final Integer value;

    public NatValue(Integer value) {
        this.value = value;
    }

    public Integer getInteger() {
        return this.value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        NatValue self = (NatValue) this;
        NatValue other = (NatValue) o;
        return self.getInteger().equals(other.getInteger());
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
