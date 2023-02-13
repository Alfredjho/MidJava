import java.util.Random;
public class Randomizer {
	Random random = new Random();
	
	char RandomChar1 = (char)('A' + random.nextInt(26));
	char RandomChar2 = (char)('A' + random.nextInt(26));
	int RandomInt1 = random.nextInt(10);
	int RandomInt2 = random.nextInt(10);
	int RandomInt3 = random.nextInt(10);
	int RandomInt4 = random.nextInt(10);
	
	String generateRandom() {
		String code = RandomChar1 + "" + RandomChar2 + "-" + RandomInt1 + RandomInt2 + RandomInt3 + RandomInt4;
		return code;
	}
}
