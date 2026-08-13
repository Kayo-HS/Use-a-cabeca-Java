public class PhraseOMatic {
    public static void main (String[] args){
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "stronggly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloudnative", "service oriented", "containerized", "servercless", "microservices", "distributed ledger" };

        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "servicemesh", "architecture", "perspective", "design", "orientation"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Precisamos de " + phrase);
    }
    
}
