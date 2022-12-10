import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

        public class CompareFiles {
        public static void main(String[] args) throws IOException {
            CompareFiles diference = new CompareFiles();
            diference.diference();
        }
        void diference( ) throws IOException {
            BufferedReader file1Reader = new BufferedReader(new FileReader("file1.txt"));

            BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");

            if (file1.length() > file2.length() ) {
                System.out.println("The difernce of two files' sizes is: " + (file1.length() - file2.length()));
            }else {
                System.out.println("The difernce of two files' sizes is: " + (file2.length() - file1.length()));
            }


            String line1 = file1Reader.readLine();

            String line2 = reader2.readLine();

            boolean areEqual = true;

            int lineNum = 1;

            while (line1 != null || line2 != null)
            {
                if(line1 == null || line2 == null)
                {
                    areEqual = false;

                    break;
                }
                else if(! line1.equalsIgnoreCase(line2))
                {
                    areEqual = false;

                    break;
                }

                line1 = file1Reader.readLine();

                line2 = reader2.readLine();

                lineNum++;
            }

            if(areEqual)
            {
                System.out.println("Two files have same content.");
            }
            else
            {
                System.out.println("Two files have different content. They differ at line "+lineNum);

                System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);


            }

            file1Reader.close();

            reader2.close();
        }


    }

