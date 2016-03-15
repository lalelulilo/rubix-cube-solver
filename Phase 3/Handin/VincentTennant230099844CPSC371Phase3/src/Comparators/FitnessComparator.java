package Comparators;

import GeneticAlgorithm.Genome;

import java.util.Comparator;

/**
 * Created by Vince on 4/4/2015.
 */
public class FitnessComparator implements Comparator<Genome> {

    /**
     * Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first
     * argument is less than, equal to, or greater than the second.
     *
     * This particular comparator will compare two genomes raw fitness.
     *
     * @param one The first genome to be compared.
     * @param two The second genome to be compared.
     * @return A negative integer if one is less than two, 0 if they're equal, or a positive integer if one is larger
     *         than two.
     */
    @Override
    public int compare(Genome one, Genome two) {
        int ans = 0;

        if(one.getRaw_fitness() < two.getRaw_fitness())
            ans = -1;
        else if(one.getRaw_fitness() > two.getRaw_fitness())
            ans = 1;

        return ans;
    }
}
