import java.io.*;
class Main{
    String buf = "";
    //metoda de citire din fisier
    public void citeste(String fisier)
    {
        int c;
        FileReader f = null;  //specificatorul pentru fisier
        try {
            //se utilizeaza pentru a prinde exceptiile de eroare la deschiderea fisierului
            f = new FileReader("/app/text.txt");
            while ((c = f.read()) != -1)
            //cat timp se mai pot citi caractere din fisier
            {
                buf = buf + (char)c;
                //se citesc caracterele din fisier si se pun in buf
            }
            f.close();  // se inchide fisierul
        }
        catch (FileNotFoundException e) {   // exceptie : nu s-a gasit fisierul
            System.out.println("Fisierul nu a fost gasit");
        }
        catch (IOException e)    //eroare la citirea din fisier
        {
            System.out.println("Eroare la citire");
        }
    }

    public static void main(String argv[])
    {
        //docker build -t java-reader .
        //docker run java-reader

        Main c = new Main();  // c este un obiect de tip clasa Main
        c.citeste("d:\\PP\\L1\\pb2_git\\src\\text.txt");  //se apeleaza metoda de citire din fisier

        System.out.println(c.buf);

        Operatii op = new Operatii();
        String text="";

        text=op.StergeSemn(c.buf);
        System.out.println("textul fara semne este:\n"+text);

        text=op.StergeCifre(c.buf);
        System.out.println("textul fara cifre este:\n"+text);

        text=op.InversLitere(c.buf);
        System.out.println("textul cu cifrele inversate este:\n"+text);

        text=op.StergereSpatii(c.buf);
        System.out.println("textul cu spatiile sterse este:\n"+text);


        System.out.println();
        text=op.StergereSpatii(c.buf);
        text=op.StergeCifre(text);
        System.out.println("textul modif partial este:\n"+text);

        text=op.StergeSemn(text);
        text=op.InversLitere(text);
        System.out.println("textul modif total este:\n"+text);
    }
}