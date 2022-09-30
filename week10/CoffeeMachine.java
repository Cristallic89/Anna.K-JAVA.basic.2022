package week10;


import java.util.Scanner;
class CoffeeMachine{
    static Scanner scan = new Scanner(System.in);
    private double kohvi_puru, piim, vesi;
    private int Coffee_Count = 0;
    public CoffeeMachine(){ //loome komponentide valiku...
        this.kohvi_puru=0;
        this.piim=0;
        this.vesi=0;
    }
    private void SetIngredient(){   //kutsume esile täitmise ja palju 1 korra sees täidetakse...
        System.out.println("\nTäidan...");
        this.kohvi_puru = 700.0;
        this.piim = 1;
        this.vesi= 2;
        System.out.println("Täitmine valmis.");
    }
    private void GetIngredient(){   //Et saada teada staatust...
        System.out.println("Kohvipuru on veel(Grammi) "+String.format("%.1f",this.kohvi_puru));
        System.out.println("Piima on veel(Liitrit) "+String.format("%.1f", this.piim));
        System.out.println("Vett on veel(Liitrit) "+String.format("%.1f", this.vesi));
    }
    private void CleanMachine(){    //Nullime kõik ära(masin on pärast seda tühi)
        System.out.println("\nPuhastan masinat...");
        this.kohvi_puru = 0;
        this.piim = 0;
        this.vesi= 0;
        System.out.println("Puhastus valmis.");
    }
    private void makecoffee(){  //Coffee Selection Menu
        System.out.println("\n ------------------ ");
        System.out.println("|   Vali millist kohvi soovid:   |\n ------------------ \n| 1:  Musta kohvi |\n| 2:  Piimaga kohvi  |\n| 3: Espressot |\n|  0   Ei tahagi   |");
        System.out.println(" ------------------ \n");
        char t = scan.next().charAt(0);
        switch(t){
            case '1':
                this.BlackCoffee();     //Kutsub musta kohvi meetodi
                break;
            case '2':
                this.MilkCoffee();      //Kutsub piimakohvi meetodi
                break;
            case '3':
                this.Espresso();      //Kutsub espresso meetodi
                break;
            case '0':
                break;
        }
    }
    private void BlackCoffee(){
        if(this.kohvi_puru >= 10 && this.vesi >= 0.2){
            System.out.println("\nTeen musta kohvi...");
            System.out.println("\nVõtan 10gm kohvipuru.");
            this.kohvi_puru = this.kohvi_puru - 10;
            System.out.println("Võtan 0.2 liitrit vett.");
            this.vesi = this.vesi - 0.2;
            System.out.println("\nSinu must kohv on valmis.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nKohvipuru on veel(grammi) "+String.format("%.1f",this.kohvi_puru));
            System.out.println("Vett on veel(Liitrid) "+String.format("%.1f", this.vesi));
            System.out.println("\nMõned komponendid on otsas, Palun täida enne kui kohvi teed.");
        }
    }


    private void Espresso(){
        if(this.kohvi_puru >= 10 && this.vesi >= 0.2){
            System.out.println("\nTeen espressot...");
            System.out.println("\nVõtan 40gm kohvipuru.");
            this.kohvi_puru = this.kohvi_puru - 10;
            System.out.println("Võtan 0.2 liitrit vett.");
            this.vesi = this.vesi - 0.2;
            System.out.println("\nSinu espresso.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nKohvipuru on veel(grammi) "+String.format("%.1f",this.kohvi_puru));
            System.out.println("Vett on veel(Liitrid) "+String.format("%.1f", this.vesi));
            System.out.println("\nMõned komponendid on otsas, Palun täida enne kui kohvi teed.");
        }
    }

    private void MilkCoffee(){
        if(this.kohvi_puru >= 10 && this.piim >= 0.4 && this.vesi >= 0.2){
            System.out.println("\nTeen piimakohvi...");
            System.out.println("\nVõtan 10gm kohvipuru.");
            this.kohvi_puru = this.kohvi_puru - 10;
            System.out.println("Lisan 0.4 liitrit piima.");
            this.piim = this.piim - 0.4;
            System.out.println("Lisan 0.2 liitrit vett.");
            this.vesi = this.vesi - 0.2;
            System.out.println("\nSinu piimakohv on valmis.");
            this.Coffee_Count++;
        }
        else{
            System.out.println("\nKohvipuru on veel(grammi) "+String.format("%.1f",this.kohvi_puru));
            System.out.println("Piima on veel(Liitrid) "+String.format("%.1f", this.piim));
            System.out.println("Vett on veel(Liitrid) "+String.format("%.1f", this.vesi));
            System.out.println("\nMõned komponendid on otsas, Palun täida enne kui kohvi teed.");
        }
    }
    public void start(){    //public Start to accese all private method of this class
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("|                   Kristi kohvimasin               |");
        System.out.println(" ----------------------------------------------------------------");
        //System.out.println("Currently We Have Following Operations, Select as your Need:- ");
        System.out.println("\nHetkene staatus: ");
        this.GetIngredient();
        boolean t = true;
        while(t){
            System.out.println("\n -------------------------------- ");
            System.out.println("|1:     Komponentide staatus     |\n -------------------------------- \n|2:      Täida kohvimasinat         |\n -------------------------------- \n|3:       Masinahooldus          |\n -------------------------------- \n|4:        Tee kohvi          |\n -------------------------------- \n|5: Mitu kohvi on tehtud?|\n -------------------------------- \n|6:        Lülita välja                  |");
            System.out.println(" -------------------------------- \n\n");
            char c = CoffeeMachine.scan.next().charAt(0);
            switch(c){
                case '1':
                    System.out.println("------------- Staatus ------------");
                    this.GetIngredient();
                    System.out.println("---------------------------------");
                    break;
                case '2':
                    this.SetIngredient();
                    break;
                case '3':
                    this.CleanMachine();
                    break;
                case '4':
                    this.makecoffee();
                    break;
                case '5':
                    System.out.println("\nOlen teinud "+this.Coffee_Count+" kohvit.");
                    break;
                case '6':
                    System.out.println("\nTa-daa, lähen tuttu...\n");
                    t = false;
                    break;
            }
        }
    }
}

