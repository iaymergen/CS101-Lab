//import java.util.Arrays;

public class Project
{

    private static int INITIAL = 0;
    private static int MODIFIED = 1;
    private static int FINAL = 2;
    private double finalscore,nom, denom;
    private String ID, segment, credibility;
    private int[] modifiedScores = new int[5];
    private int[] rawScores = new int[5];
    private Hackathon hackathon;
    private int requiredMoney;
    private int paybackRate;

        Project(String ID, int[] rawScores)
        {
            this.ID = ID;
            this.rawScores[0] = rawScores[0];
            this.rawScores[1] = rawScores[1];
            this.rawScores[2] = rawScores[2];
            this.rawScores[3] = rawScores[3];
            this.rawScores[4] = rawScores[4];
        }
        //getter
        public Hackathon getHackathon()
        {
            return this.hackathon;
        }
        public double getFinalScore()
        {
            return this.finalscore;
        }
        public String getID()
        {
            return this.ID;
        }
        public String getSegment()
        {
            return this.segment;
        }
        public String getCredibility()
        {
            return this.credibility;
        }
        public int getModifiedScore(int index)
        {
            return modifiedScores[index];
        }
        public int getRawScores(int index)
        {
            return rawScores[index];
        }
        public int getRequiredMoney()
        {
            return rawScores[4];
        }
        public int getPaybackRate()
        {
            return this.rawScores[3];
        }
        //setter
        public void setHackathon(Hackathon hackathon)
        {
            this.hackathon = hackathon;
        }
        public void setPaybackRate(int paybackRate)
        {
            this.paybackRate = paybackRate;
        }
        public void setRequiredMoney(int requiredMoney)
        {
            this.requiredMoney = requiredMoney;
        }

        public void calcModifiedScores()
        {
            //indicator 1
            this.modifiedScores[0] = this.rawScores[0];
            //indicator 2
            if(this.rawScores[1]>0 && this.rawScores[1] <= 500)
            {
                this.modifiedScores[1] = 20;
            }
            if(this.rawScores[1] > 500 && this.rawScores[1] <= 1000)
            {
                this.modifiedScores[1] = 80;
            }
            if(this.rawScores[1] > 1000)
            {
                this.modifiedScores[1] = 100;
            }
            //indicator 3
            if(this.rawScores[2] > 0 && this.rawScores[2] <= 6)
            {
                this.modifiedScores[2] = 100;
            }
            if(this.rawScores[2] > 6 && this.rawScores[2] <= 12)
            {
                this.modifiedScores[2] = 80;
            }
            if(this.rawScores[2] > 12)
            {
                this.modifiedScores[2] = 20;
            }
            //indicator 4
            if(this.rawScores[3] >= 0 && this.rawScores[3] < 10)
            {
                this.modifiedScores[3] = 20;
            }
            if(this.rawScores[3] >= 10 && this.rawScores[3] < 15)
            {
                this.modifiedScores[3] = 80;
            }
            if(this.rawScores[3] >= 15)
            {
                this.modifiedScores[3] = 100;
            }
            //indicator 5
            if(this.rawScores[4] > 0 && this.rawScores[4] <= 1000000)
            {
                this.modifiedScores[4] = 100;
            }
            if(this.rawScores[4] > 1000000 && this.rawScores[4] <= 1500000)
            {
                this.modifiedScores[4] = 80;
            }            
            if(this.rawScores[4] >  1500000)
            {
                this.modifiedScores[4] = 20;
            }
        }
        public void calcWeightAvg()
        {
            calcModifiedScores();
            nom = nom + ((this.getModifiedScore(0) * 10) / 100);
            nom = nom + ((this.getModifiedScore(1) * 15) / 100);
            nom = nom + ((this.getModifiedScore(2) * 20) / 100);
            nom = nom + ((this.getModifiedScore(3) * 25) / 100);
            nom = nom + ((this.getModifiedScore(4) * 30) / 100);
            denom = 1;

            this.finalscore = nom / denom;
            
        }
        public void calcSegment()
        {
            if(this.finalscore == 100)
            {
                this.segment = "A+";
            }
            else if(this.finalscore >= 90)
            {
                this.segment = "A";
            }
            else if(this.finalscore >= 75)
            {
                this.segment = "B";
            }
            else if (this.finalscore >= 60)
            {
                this.segment = "C";
            }
            else if ( this.finalscore >= 40)
            {
                this.segment = "D";
            }
        }
        public void  calcCredibility()
        {
            calcSegment();
            if(this.segment.equals("A+")&& (this.modifiedScores[4] == 80 || this.modifiedScores[4] == 100 || this.modifiedScores[4] == 20))
            {
                this.credibility = "Invest";

            }
            else if(this.segment.equals("A")&& (this.modifiedScores[4] == 80 || this.modifiedScores[4] == 100 || this.modifiedScores[4] == 20))
            {
                this.credibility = "Invest";
            }
            else if(this.segment.equals("B")&& (this.modifiedScores[4] == 80 || this.modifiedScores[4] == 100))
            {
                this.credibility = "Invest";
            }
            else if(this.segment.equals("C")&& (this.modifiedScores[4] == 100))
            {
                this.credibility = "Invest";
            }
            else if(this.segment.equals("D"))
            {
                this.credibility = "Do Not Invest";
            }
        }
        public void disPlay(int i)
        {
            if(i == INITIAL)
            {
                String[][] table = new String[1][5];
                table[0][0] = this.getID();
                table[0][1] = Integer.toString(this.getRawScores(0));
                table[0][2] = Integer.toString(this.getRawScores(1));
                table[0][3] = Integer.toString(this.getRawScores(2));
                table[0][4] = Integer.toString(this.getRawScores(3));

                for(int t = 0; t<1; t++)
                {
                    for(int y = 0; y<5; y++)
                    {
                        System.out.print(String.format("%-12s",table[t][y]));
                    }
                    System.out.println();
                }
            }
            if(i == MODIFIED)
            {
                String[][] table = new String[1][5];
                table[0][0] = this.getID() ;
                table[0][1] = Integer.toString(this.getModifiedScore(0)) ;
                table[0][2] = Integer.toString(this.getModifiedScore(1));
                table[0][3] = Integer.toString(this.getModifiedScore(2));
                table[0][4] = Integer.toString(this.getModifiedScore(3));
                for(int t = 0; t<1; t++)
                {
                    for(int y = 0; y<5; y++)
                    {
                        System.out.print(String.format("%-12s",table[t][y]));
                    }
                    System.out.println();
                }
            }
            if(i == FINAL)
            {
                
                String[][] table = new String[1][8];
                table[0][0] = this.getID();
                table[0][1] = Integer.toString(this.getModifiedScore(0));
                table[0][2] = Integer.toString(this.getModifiedScore(1));
                table[0][3] = Integer.toString(this.getModifiedScore(2));
                table[0][4] = Integer.toString(this.getModifiedScore(3));
                table[0][5] = Double.toString(this.getFinalScore()) ;
                table[0][6] = this.getSegment() + "    ";
                table[0][7] = this.getCredibility();
                for(int t = 0; t<1; t++)
                {
                    for(int y = 0; y<8; y++)
                    {
                        System.out.print(String.format("%-12s",table[t][y]));
                    }
                    System.out.println();
                }
            }
        }
    }

 