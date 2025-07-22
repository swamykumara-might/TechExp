package Collections;

public class Product {
    private Long pid;
    private String prodName;
    private String MFD;
    private String EPD;

    public Product(Long pid, String prodName, String MFD, String EPD) {
        this.pid = pid;
        this.prodName = prodName;
        this.MFD = MFD;
        this.EPD = EPD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "EPD='" + EPD + '\'' +
                ", MFD='" + MFD + '\'' +
                ", prodName='" + prodName + '\'' +
                ", pid=" + pid +
                '}';
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getMFD() {
        return MFD;
    }

    public void setMFD(String MFD) {
        this.MFD = MFD;
    }

    public String getEPD() {
        return EPD;
    }

    public void setEPD(String EPD) {
        this.EPD = EPD;
    }
}
