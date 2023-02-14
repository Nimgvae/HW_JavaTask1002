public class Department{



    private String depName;
    private int numofEmpl;
    private String nameofFirm;

    public Department(String depName, int numofEmpl, String nameofFirm) {
        this.depName = depName;
        this.numofEmpl = numofEmpl;
        this.nameofFirm = nameofFirm;
    }
    public Department(String depName) {
        this.depName = depName;
    }

    public String getNameofFirm() {
        return nameofFirm;
    }
    public void setNameofFirm(String nameofFirm) {
        this.nameofFirm = nameofFirm;
    }
    public String getDepName() {
        return depName;
    }
    public void setDepName(String depName) {
        this.depName = depName;
    }
    public int getNumofEmpl() {
        return numofEmpl;
    }
    public void setNumofEmpl(int numofEmpl) {
        this.numofEmpl = numofEmpl;
    }

}
