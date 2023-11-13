import java.util.Scanner;

public class AlphabetWarGame {

    String word, left = "", right = "";
    int[] S = new int[4];
    int lcount, rcount;

    AlphabetWarGame() {
       int m=4;
        for(int i=0;i<3;i++)
        {
    this.S[i] =m;
    m--;
        }
        lcount = rcount = 0;
    }
        AlphabetWarGame(int[] A) 
        {
            for(int i=0;i<3;i++)
            {
    this.S[i] =A[i];
            }
        System.out.println("The values are updated!!");
        
}
    void game() {
        int i = 0;
        while (i < word.length()) {
            if (word.charAt(i) == 'w' || word.charAt(i) == 'p' || word.charAt(i) == 'b' || word.charAt(i) == 's') {
                left += word.charAt(i);
            } else if (word.charAt(i) == 'm' || word.charAt(i) == 'q' || word.charAt(i) == 'd' || word.charAt(i) == 'z') {
                right += word.charAt(i);
            } else {
                System.out.println("Invalid characters found");
                break;
            }
            i++;
        }
        game(left,right);
    }

    void game(String left,String right)
    {

        int i = 0;
        while (i < left.length()) {
            if (left.charAt(i) == 'w') lcount += S[0];
            else if (left.charAt(i) == 'p') lcount += S[1];
            else if (left.charAt(i) == 'b') lcount += S[2];
            else lcount += S[3];
            i++;
        }
        i = 0;
        while (i < right.length()) {
            if (right.charAt(i) == 'm') rcount += S[0];
            else if (right.charAt(i) == 'q') rcount += S[1];
            else if (right.charAt(i) == 'd') rcount += S[2];
            else rcount += S[3];
            i++;
        }
        if (lcount > rcount) System.out.println("Left side wins");
        else if (lcount < rcount) System.out.println("Right side wins");
        else System.out.println("Let's fight again");
    }
    public static void main(String args[]) {
        AlphabetWarGame obj1 = new AlphabetWarGame();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int[] v = new int[4];
        while(choice!=3) {
            System.out.println("1. Start Game");
            System.out.println("2. Change strength");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the word:");
                    obj1.word = scanner.next();
                    obj1.game();
                    break;
                case 2:
                    System.out.println("Please enter the strengths to change: w/m p/q b/d s/z");
                    for(int i=0;i<3;i++)
                    v[i] = scanner.nextInt();
                obj1 = new AlphabetWarGame(v);
                    break;
                case 3:
                    System.out.println("Exiting the Game!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } 
    }
}