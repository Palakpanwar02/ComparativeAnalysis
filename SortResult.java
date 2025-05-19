package core;

public class SortResult {
    public String algorithmName;
    public long timeTakenNs;
    public int comparisons;
    public int swaps;
    public String timeComplexity;   // theoretical time complexity
    public String spaceComplexity;  // theoretical space complexity
    public boolean stable;
    public boolean inPlace;

    public SortResult(String algorithmName, long timeTakenNs, int comparisons, int swaps,
                      String timeComplexity, String spaceComplexity, boolean stable, boolean inPlace) {
        this.algorithmName = algorithmName;
        this.timeTakenNs = timeTakenNs;
        this.comparisons = comparisons;
        this.swaps = swaps;
        this.timeComplexity = timeComplexity;
        this.spaceComplexity = spaceComplexity;
        this.stable = stable;
        this.inPlace = inPlace;
    }
}
