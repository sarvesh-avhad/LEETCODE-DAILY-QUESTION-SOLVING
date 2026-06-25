class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder(binary);
        return Integer.parseUnsignedInt(sb.reverse().toString(), 2);
    }
}