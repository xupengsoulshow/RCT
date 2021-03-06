package org.nesc.ecbd.entity;

/**
 * @ClassName ReportData
 * @Description TODO
 * @Author kz37
 * @Date 2018/10/17
 */
public class ReportData {

    private String key;

    private long count;

    private double countGrowthRate;

    private long bytes;

    private double bytesGrowthRate;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public double getCountGrowthRate() {
        return countGrowthRate;
    }

    public void setCountGrowthRate(double countGrowthRate) {
        this.countGrowthRate = countGrowthRate;
    }

    public long getBytes() {
        return bytes;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public double getBytesGrowthRate() {
        return bytesGrowthRate;
    }

    public void setBytesGrowthRate(double bytesGrowthRate) {
        this.bytesGrowthRate = bytesGrowthRate;
    }

    @Override
    public String toString() {
        return "ReportData [prefix="+key+",count="+count+",countGrowthRate="+countGrowthRate+ ",bytes="
                + bytes + ",bytesGrowthRate="+bytesGrowthRate+"]";
    }
}
