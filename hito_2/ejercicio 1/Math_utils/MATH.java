package Math_utils;

public class MATH
{

        private String nameAPP;
        private String version;
        private int year;


        public MATH(String nameAPP, String version, int year)
        {
            this.nameAPP = nameAPP;
            this.version = version;
            this.year = year;
        }
        public void printApp()
        {
            System.out.println(nameAPP+" "+version+" "+year);
        }
        public void generateNaturalNumber(int limit)
        {
            for (int i = 1; i <= limit; i++)
            {
                System.out.print(i + " ; ");
            }
        }
        public void generatePairNumber(int limit)
        {
            for (int i = 1; i <= limit; i++)
            {
                if(i%2==0)
                {
                    System.out.print(i + " ; ");
                }

            }
        }
        public void getExtensionFromCI(String CI)
        {
            System.out.println(CI);
        }
}
