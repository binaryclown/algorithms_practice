public class QuickFind {
    private final int[] id;

    public QuickFind(int n)
    {
        this.id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q)
    {
        return id[p] == id[q];
    }

    public void union(int p, int q)
    {
        int p_id = id[p]; //7
        int q_id = id[q]; //1
        for (int i = 0; i < id.length; i++)
            if (id[i] == p_id) id[i] = q_id;
    }
}
