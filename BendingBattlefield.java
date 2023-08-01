import java.util.Random;

public class BendingBattlefield {

    public static void main(String[] args) {

        Random rand = new Random();

        int numHeroes = rand.nextInt(51) + 50;
        double boomerangBoost = Math.round(100.0 * (rand.nextDouble() * 4 + 3)) / 100.0;

        double averageFirePower = 0.00;
        double averageFireHealth = 0.00;
        double averageAlliancePower = 0.00;
        double averageAllianceHealth = 0.00;

        System.out.printf("Selecting %d heroes.", numHeroes);

        int numFire = 0;
        int numAlliance = 0;

        for (int i = 0; i < numHeroes; i++) {
            BendingType heroType = BendingType.values()[rand.nextInt(5)];

            double health = Math.random() * 100 + 50;
            health = Math.round(health * 100.0) / 100.0;

            double power = Math.random() * (0 - 80) + 120;
            power = Math.round(power * 100.0) / 100.0;

            switch (heroType) {

            case FIRE:
                averageFireHealth += health;
                averageFirePower += power;
                numFire++;
                break;

            case NON_BENDER:
                power *= boomerangBoost;

            default:
                averageAllianceHealth += health;
                averageAlliancePower += power;
                numAlliance++;
                break;
            }

            System.out.printf("\n%s hero has been summoned by his army, adding"
                + " %f power and %f health to the army.", heroType, power, health);
        }

        averageFirePower /= numFire;
        averageFireHealth /= numFire;
        averageAlliancePower /= numAlliance;
        averageAllianceHealth /= numAlliance;

        averageFirePower = Math.round(averageFirePower * 100.0) / 100.0;
        averageFireHealth = Math.round(averageFireHealth * 100.0) / 100.0;
        averageAlliancePower = Math.round(averageAlliancePower * 100.0) / 100.0;
        averageAllianceHealth = Math.round(averageAllianceHealth * 100.0) / 100.0;

        System.out.printf("\nThe Fire Nation has an average of %f power and"
            + " %f health.", averageFirePower, averageFireHealth);
        System.out.printf("\nThe Alliance has an average of %f power"
            + " and %f health.", averageAlliancePower, averageAllianceHealth);

        double sumF = averageFirePower * 2 + averageFireHealth * 3;
        double sumA = averageAlliancePower * 2 + averageAllianceHealth * 3;

        if (sumA >= sumF) {
            System.out.println("\nThe Alliance won!");
        } else {
            System.out.println("\nThe Fire Nation won!");
        }

    }
}
