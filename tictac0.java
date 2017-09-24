import java.util.Scanner;
import java.util.*;
 
public class tictac {
	public static void main(String []args) {

		int  playerOne = 1;
		int	 playerTwo = 2;
		boolean GameOver=false;
		boolean ValidTurn;
		char PlayerOneMarker = 'X';
		char PlayerTwoMarker = 'O';
		char Square1 = '1';
		char Square2 ='2' ;
		char Square3= '3';
		char Square4='4';
		char Square5='5';
		char Square6='6';
		char Square7='7';
		char Square8='8';
		char Square9='9';
		char CurrentMove;
		char CurrentMoveTwo;
		char playAgain;
		Scanner sc=new Scanner(System.in);  
		do{


			do
					{
				System.out.printf( "       "  +Square1 +"    "       +Square2  +"    "      +Square3);
				System.out.println( "     " );
				System.out.printf( "       "  +Square4 +"    "       +Square5   +"    "     +Square6);
				System.out.println( "     " );
				System.out.printf( "       "  +Square7 +"    "        +Square8  +"    "      +Square9);
				System.out.println( "     " );


			do
					{

				System.out.printf("Player " +playerOne , "s turn, set move on what square:");
				 CurrentMove=sc.next().charAt(0);  
				ValidTurn = true;

				if (CurrentMove == '1' && Square1 == '1') {
					Square1 = PlayerOneMarker;


				}
				else if (CurrentMove == '2' && Square2 == '2') {
					Square2 = PlayerOneMarker;

				}
				else if (CurrentMove == '3' && Square3 == '3') {
					Square3 = PlayerOneMarker;

				}
				else if (CurrentMove == '4' && Square4 == '4') {
					Square4 = PlayerOneMarker;

				}
				else if (CurrentMove == '5' && Square5 == '5') {
					Square5 = PlayerOneMarker;

				}
				else if (CurrentMove == '6' && Square6 == '6') {
					Square6 = PlayerOneMarker;

				}
				else if (CurrentMove == '7' && Square7 == '7') {
					Square7 = PlayerOneMarker;

				}
				else if (CurrentMove == '8' && Square8 == '8') {
					Square8 = PlayerOneMarker;

				}
				else if (CurrentMove == '9' && Square9 == '9') {
					Square9 = PlayerOneMarker;

				}
				else {
					System.out.println(" Invalid Move, make another one: ");
					ValidTurn = false;
				}
				System.out.printf( "       "  +Square1 +"    "       +Square2  +"    "      +Square3);
				System.out.println( "     " );
				System.out.printf( "       "  +Square4 +"    "       +Square5   +"    "     +Square6);
				System.out.println( "     " );
				System.out.printf( "       "  +Square7 +"    "        +Square8  +"    "      +Square9);
				System.out.println( "     " );

				if ((Square1 == PlayerOneMarker && Square2 == PlayerOneMarker&& Square3 == PlayerOneMarker) || (Square1 == PlayerOneMarker && Square4 == PlayerOneMarker &&Square7 == PlayerOneMarker) ||
									(Square1 == PlayerOneMarker && Square5 == PlayerOneMarker && Square9 == PlayerOneMarker) || (Square2 == PlayerOneMarker && Square5 == PlayerOneMarker && Square8 == PlayerOneMarker) ||
									(Square3 == PlayerOneMarker && Square5 == PlayerOneMarker && Square7 == PlayerOneMarker) || (Square3 == PlayerOneMarker && Square6 == PlayerOneMarker && Square9 == PlayerOneMarker) ||
									(Square4 == PlayerOneMarker && Square5 == PlayerOneMarker && Square6 == PlayerOneMarker) || (Square7 == PlayerOneMarker && Square8 == PlayerOneMarker && Square9 == PlayerOneMarker))
								{
									GameOver = true;
									System.out.println( "Player 1 wins");
								}
								if ((Square1 == PlayerOneMarker || Square1 == PlayerTwoMarker) && (Square2 == PlayerOneMarker || Square2 == PlayerTwoMarker) && (Square3 == PlayerOneMarker || Square3 == PlayerTwoMarker) &&
									(Square4 == PlayerOneMarker || Square4 == PlayerTwoMarker) && (Square5 == PlayerOneMarker || Square5 == PlayerTwoMarker) && (Square6 == PlayerOneMarker || Square6 == PlayerTwoMarker) &&
									(Square7 == PlayerOneMarker || Square7 == PlayerTwoMarker) && (Square8 == PlayerOneMarker || Square8 == PlayerTwoMarker) && (Square9 == PlayerOneMarker || Square9 == PlayerTwoMarker))
								{
									System.out.println( "Draw! ");
									GameOver = true;
								}
			} while (!ValidTurn);

			if (GameOver == false)
						{

							do {

								System.out.printf( "Player" + playerTwo,  "s turn, set move on what square: ");
								CurrentMoveTwo=sc.next().charAt(0);
								while (CurrentMove == CurrentMoveTwo)
								{
									System.out.println( "Sorry that square is already filled, Please choose another square");
									CurrentMoveTwo=sc.next().charAt(0);;
								}
								ValidTurn = true;

								if (CurrentMoveTwo == '1' && Square1 == '1') {
									Square1 = PlayerTwoMarker;


								}
								else if (CurrentMoveTwo == '2' && Square2 == '2') {
									Square2 = PlayerTwoMarker;

								}
								else if (CurrentMoveTwo == '3' && Square3 == '3') {
									Square3 = PlayerTwoMarker;

								}
								else if (CurrentMoveTwo == '4' && Square4 == '4') {
									Square4 = PlayerTwoMarker;

								}
								else if (CurrentMoveTwo == '5' && Square5 == '5') {
									Square5 = PlayerTwoMarker;

								}
								else if (CurrentMoveTwo == '6' && Square6 == '6') {
									Square6 = PlayerTwoMarker;

								}
								else if (CurrentMoveTwo == '7' && Square7 == '7') {
									Square7 = PlayerTwoMarker;

								}
								else if (CurrentMoveTwo == '8' && Square8 == '8') {
									Square8 = PlayerTwoMarker;

								}
								else if (CurrentMoveTwo == '9' && Square9 == '9') {
									Square9 = PlayerTwoMarker;

								}
								else {
									System.out.println("Invalid Move, make another one:");
									ValidTurn = false;
								}
							} while (!ValidTurn);
							if ((Square1 == PlayerTwoMarker && Square2 == PlayerTwoMarker&& Square3 == PlayerTwoMarker) || (Square1 == PlayerTwoMarker && Square4 == PlayerTwoMarker &&Square7 == PlayerTwoMarker) ||
								(Square1 == PlayerTwoMarker && Square5 == PlayerTwoMarker && Square9 == PlayerTwoMarker) || (Square2 == PlayerTwoMarker && Square5 == PlayerTwoMarker && Square8 == PlayerTwoMarker) ||
								(Square3 == PlayerTwoMarker && Square5 == PlayerTwoMarker && Square7 == PlayerTwoMarker) || (Square3 == PlayerTwoMarker && Square6 == PlayerTwoMarker && Square9 == PlayerTwoMarker) ||
								(Square4 == PlayerTwoMarker && Square5 == PlayerTwoMarker && Square6 == PlayerTwoMarker) || (Square7 == PlayerTwoMarker && Square8 == PlayerTwoMarker && Square9 == PlayerTwoMarker))
							{
								GameOver = true;
								System.out.println ("Player 2 wins");
							}
						}
					} while (GameOver==false);

					System.out.println("PLAY AGAIN? Y for yes , N for no");
				 playAgain=sc.next().charAt(0);;

					if((playAgain == 'Y') || (playAgain == 'y'))
					{
						Square1 = '1';
						Square2 = '2';
						Square3 = '3';
						Square4 = '4';
						Square5 = '5';
						Square6 = '6';
						Square7 = '7';
						Square8 = '8';
						Square9 = '9';
						GameOver = false;
					}

				} while ((playAgain == 'Y') || (playAgain == 'y'));

				
			}
	   }
	   
	


