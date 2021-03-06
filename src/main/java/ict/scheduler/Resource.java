package ict.scheduler;

/**
 * Created by Zongzan on 2016/11/9.
 */
public class Resource {
    // core num
    private int cores = 1;
    // memory in mb
    private int RAM = 350;
    // disk
    private int localDiskSpace = 0;
    // core seconds per second
    private double scps = 0;

    public Resource(int cores, int RAM, int localDiskSpace, double scps) {
        this.cores = cores;
        this.RAM = RAM;
        this.localDiskSpace = localDiskSpace;
        this.scps = scps;
    }

    public Resource(int cores, int RAM) {
        this.cores = cores;
        this.RAM = RAM;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getLocalDiskSpace() {
        return localDiskSpace;
    }

    public void setLocalDiskSpace(int localDiskSpace) {
        this.localDiskSpace = localDiskSpace;
    }

    public double getScps() {
        return scps;
    }

    public void setScps(double scps) {
        this.scps = scps;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "cores=" + cores +
                ", RAM=" + RAM +
                ", localDiskSpace=" + localDiskSpace +
                ", scps=" + scps +
                '}';
    }
}

