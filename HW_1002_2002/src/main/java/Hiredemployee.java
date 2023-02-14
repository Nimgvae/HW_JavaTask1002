public class Hiredemployee extends Employees {
    public int getTerm() {
        return term;
    }

    public void setTerm(byte term) {
        this.term = term;
    }

    private byte term;   //Это опциональность, но думаю в реальности такое поле есть.

    public Hiredemployee(String nameofEmpl, String familyName, String surnameofEmpl, String position, int salary, String placeofWork, boolean hiredstatus, byte term) {
        super(nameofEmpl, familyName, surnameofEmpl, position, salary, placeofWork, hiredstatus);
        this.term = term;


    }




}
