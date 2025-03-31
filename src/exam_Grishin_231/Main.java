package exam_Grishin_231;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {
        zakaz db = new zakaz();
        db.isConnection();
        db.createTable("supa8");
//        db.addTable("supa8",1,"KIEY",2643, "free" );
//        db.addTable("supa8",2,"MOSKOW",682, "busy" );
//        db.addTable("supa8",3,"SPB",1542, "free" );
//        db.addTable("supa8",4,"EKB",1432, "busy" );
//        db.addTable("supa8",5,"SARATOV",134, "busy" );
//        db.addTable("supa8",6,"NOVGOROD",21342, "free" );
//        db.addTable("supa8",7,"MINSK",4532, "free" );
//        db.addTable("supa8",8,"KIROV",46132, "busy" );
//        db.addTable("supa8",9,"VORONEZH",54362, "free" );
//        db.addTable("supa8",10,"TULA",165, "busy" );
        db.selectTable("supa8");
        db.selectFree("status", "supa8");
    }
}
