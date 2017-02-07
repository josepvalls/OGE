package util;

public class Pair<T1,T2> {
    public T1 m_a;
    public T2 m_b;

    public Pair(T1 a,T2 b) {
        m_a = a;
        m_b = b;
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) return false;
        if (m_a==null && ((Pair)o).m_a!=null) return false;
        if (m_b==null && ((Pair)o).m_b!=null) return false;
        if (!m_a.equals(((Pair)o).m_a)) return false;
        if (!m_b.equals(((Pair)o).m_b)) return false;
        return true;
    }
    
    public String toString() {
        return "<" + m_a + "," + m_b + ">";
    }

    public int hashCode() {
        return 31 * this.m_a.hashCode() + this.m_b.hashCode();
        // http://stackoverflow.com/questions/299304/why-does-javas-hashcode-in-string-use-31-as-a-multiplier
    }

    public static int ipow(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                result *= base;
            }
            exp >>= 1;
            base *= base;
        }
        return result;
    }
}
