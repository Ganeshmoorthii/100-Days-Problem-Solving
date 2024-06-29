/*
Input: n = 8, edgeList = [[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]]
Output: [[],[],[],[0,1],[0,2],[0,1,3],[0,1,2,3,4],[0,1,2,3]]
Explanation:
The above diagram represents the input graph.
- Nodes 0, 1, and 2 do not have any ancestors.
- Node 3 has two ancestors 0 and 1.
- Node 4 has two ancestors 0 and 2.
- Node 5 has three ancestors 0, 1, and 3.
- Node 6 has five ancestors 0, 1, 2, 3, and 4.
- Node 7 has four ancestors 0, 1, 2, and 3.
*/

class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }

        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        for (int i = 0; i < n; i++) {
            dfs(graph, i, i, res, new boolean[n]);
        }

        for (int i = 0; i < n; i++) {
            res.get(i).sort(Integer::compareTo);
        }

        return res;
    }

    private void dfs(ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> res, boolean[] visit) {
        visit[curr] = true;
        for (int dest : graph[curr]) {
            if (!visit[dest]) {
                res.get(dest).add(parent);
                dfs(graph, parent, dest, res, visit);
            }
        }
    }
}
