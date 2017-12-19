package D1;

/*
 * Gdy klub piłkarski A gra dwumecz z klubem piłkarskim B, oznacza to, że grają jeden mecz na boisku drużyny A i jeden na boisku drużyny B.

Wygrywa ta drużyna, która zdobędzie więcej goli w obu meczach.

W przypadku, gdy drużyny zdobyły tyle samo bramek, gole zdobyte na wyjeździe liczą się jako "trochę ważniejsze" 
i wygrywa ta drużyna, która zdobyła więcej bramek na wyjeździe.

Remis w dwumeczu wypada wtedy, gdy obie drużyny mają tyle samo bramek na wyjeździe.

Na przykład:

W Pucharze Polski grają dwa zespoły: Grom i Błyskawica. Zespoły rozegrały następujące mecze:

Gospodarz: Grom.

Grom 0:2 Błyskawica

Gospodarz: Błyskawica.

Błyskawica 1:3 Grom

Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyjeździe zdobył 3 bramki, a Błyskawica tylko 2. Zatem wygrywa Grom.

Napisz metodę, footballWin, która przyjmie następujące parametry:

    Gole zdobyte przez zespół A w pierwszym meczu (na boisku zepołu A),
    Gole zdobyte przez zespół B w pierwszym meczu (na boisku zepołu A),
    Gole zdobyte przez zespół A w drugim meczu (na boisku zespołu B),
    Gole zdobyte przez zespół B w drugim meczu (na boisku zespołu B),

po czym zwróci 1, jeśli dwumecz wygrał zespół A, 2 – jeśli B. W przypadku remisu, zwróć X. Wynik ma być łańcuchem tekstowym, nie liczbą!
 */
public class Methods10 {
	
	public static void main(String[] args) {
		int grom = 1;
		int blyskOut = 3;
		int gromOut = 3;
		int blysk = 1;
		comments(footballWin(grom, gromOut, blysk, blyskOut), "Grom", "Błyskawica");
	}
	
	static String footballWin(int grom, int gromOut, int blysk, int blyskOut) {
		int gromAll = grom + gromOut;
		int blyskAll = blysk + blyskOut;
		
		if(gromAll > blyskAll) {
			return "1";
		} else if(gromAll < blyskAll) {
			return "2";
		} else {
			if(gromOut > blyskOut) {
				return "1";
			} else if(gromOut < blyskOut) {
				return "2";
			} else {
				return "x";
			}
		}
	}
	
	static void comments(String result, String team1, String team2) {
		
		if(result.equals("1")) {
			System.out.println("Dwómecz wygrała drużyna " + team1);
		} else if(result.equals("2")) {
			System.out.println("Dwómecz wygrała drużyna " + team2);
		} else {
			System.out.println("Mamy remis!");
		}
	}
}


