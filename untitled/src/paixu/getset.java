package paixu;

/**
 * Created by miss on 15/4/22.
 */
public class getset {

    public String str1;
    public String str2;
    public int in1;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public int getIn1() {
        return in1;
    }

    public void setIn1(int in1) {
        this.in1 = in1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        getset getset = (getset) o;

        if (in1 != getset.in1) return false;
        if (!str1.equals(getset.str1)) return false;
        if (!str2.equals(getset.str2)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = str1.hashCode();
        result = 31 * result + str2.hashCode();
        result = 31 * result + in1;
        return result;
    }

    @Override
    public String toString() {
        return "getset{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", in1=" + in1 +
                '}';
    }


}
