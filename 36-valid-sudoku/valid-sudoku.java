class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> seenRow = new HashMap<>();
        HashMap<Integer, Set<Character>> seenColumn = new HashMap<>();
        HashMap<String, Set<Character>> seenSquares = new HashMap<>();

        int n = board.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                char piece = board[i][j];
                if (piece == '.') continue; 
                
                if(!seenRow.containsKey(i)) seenRow.put(i, new HashSet<>());
                if (seenRow.get(i).contains(piece)) return false;

                if(!seenColumn.containsKey(j)) seenColumn.put(j, new HashSet<>());
                if (seenColumn.get(j).contains(piece)) return false;

                String box_index = (i / 3) + "," + (j / 3);
                if (!seenSquares.containsKey(box_index)) seenSquares.put(box_index, new HashSet<>());
                if (seenSquares.get(box_index).contains(piece)) return false;

                seenRow.get(i).add(piece);
                seenColumn.get(j).add(piece);
                seenSquares.get(box_index).add(piece);
            }
        }

        return true;
    }
}