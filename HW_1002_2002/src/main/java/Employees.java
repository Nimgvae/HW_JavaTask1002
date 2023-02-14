public class Employees{

    private String nameofEmpl;
    private String familyName;
    private String surnameofEmpl;
    private String position;
    private int salary;      //Знаю, что так небывает,  но допустим что на наших фирмах бывает.%)

    private boolean hiredstatus;   //Поидее в форме заполнения данных сотрудника будет подсказка Если статус YES(true) то это наемный и наоборот.
   private String placeofWork;
    public Employees(String nameofEmpl, String familyName, String surnameofEmpl, String position, int salary, String placeofWork, boolean hiredstatus) {
        this.nameofEmpl = nameofEmpl;
        this.familyName = familyName;
        this.surnameofEmpl = surnameofEmpl;
        this.position = position;
        this.salary = salary;
        this.placeofWork = placeofWork;
        this.hiredstatus = hiredstatus;
    }

    public String getNameofEmpl() {
        return nameofEmpl;
    }

    public void setNameofEmpl(String nameofEmpl) {
        this.nameofEmpl = nameofEmpl;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSurnameofEmpl() {
        return surnameofEmpl;
    }

    public void setSurnameofEmpl(String surnameofEmpl) {
        this.surnameofEmpl = surnameofEmpl;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPlaceofWork() {
        return placeofWork;
    }

    public void setPlaceofWork(String placeofWork) {
        this.placeofWork = placeofWork;
    }

    public boolean isHiredstatus() {
        return hiredstatus;
    }

    public void setHiredstatus(boolean hiredstatus) {
        this.hiredstatus = hiredstatus;
    }
}
