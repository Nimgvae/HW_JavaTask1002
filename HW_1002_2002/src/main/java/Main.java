public class Main {
    public static void main(String[] args) {
        Firma firm1 = new Firma("DB");
        Department dep1 = new Department("HR", 1000,"DB");
        Staffmember Eugen = new Staffmember("Pupkin", "Eugen","Viktorovitsch","Mgmt",300,"DB",false);
        Hiredemployee Marina = new Hiredemployee("Marina","Putina","Vladimirovna","Seo",10000,"DB",true, (byte) 2);

    }
}
