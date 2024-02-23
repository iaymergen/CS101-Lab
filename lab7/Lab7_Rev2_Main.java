//package lab7_revised;

public class Lab7_Rev2_Main {
    public static void main(String[] args) {
        Player player = new Player("LeBron James", "SF", "LAL", 6);
        Trainer trainer = new Trainer("Mike Mancias", "Fitness Trainer", player);
        trainer.showTrainer();

        /*
        ************************************
        Trainer Name: Mike Mancias
        Trainer Specialty: Fitness Trainer
        Player Name: LeBron James
        Is COVID-19 positive?: false
        Last test date: null
        Injury status: Healthy
        ************************************
        */

        trainer.recordCovidTest(false, "2021-11-06");
        trainer.showTrainer();

        /*
        ************************************
        Trainer Name: Mike Mancias
        Trainer Specialty: Fitness Trainer
        Player Name: LeBron James
        Is COVID-19 positive?: false
        Last test date: 2021-11-06
        Injury status: Healthy
        ************************************
        */

        trainer.updateInjuryStatus("Knee sprain");
        trainer.showTrainer();

        /*
        ************************************
        Trainer Name: Mike Mancias
        Trainer Specialty: Fitness Trainer
        Player Name: LeBron James
        Is COVID-19 positive?: false
        Last test date: 2021-11-06
        Injury status: Knee sprain
        ************************************
        */

        trainer.updateInjuryStatus(null);
        trainer.showTrainer();
        /*
        ************************************
        Trainer Name: Mike Mancias
        Trainer Specialty: Fitness Trainer
        Player Name: LeBron James
        Is COVID-19 positive?: false
        Last test date: 2021-11-06
        Injury status: Healthy
        ************************************
        */        
    }
}
