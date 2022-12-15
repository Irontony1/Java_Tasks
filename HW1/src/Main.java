//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String out_task1 = mergeAlternately("pineapple", "juice");
        System.out.println(out_task1);
        int[] nums = new int[]{3, 2, 2, 3};
        int out_task2 = removeElement(nums, 3);
        System.out.println(out_task2);
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
        String out_task4 = reverseWords("my brain is totally damaged");
        System.out.println(out_task4);
        boolean out_task5 = isPalindrome("green neerg");
        System.out.println(out_task5);
    }

    public static String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();

        while(i + j < w1 + w2) {
            if (i < w1) {
                sb.append(word1.charAt(i++));
            }

            if (j < w2) {
                sb.append(word2.charAt(j++));
            }
        }

        return sb.toString();
    }

    public static int removeElement(int[] nums, int val) {
        int counter = 0;

        int i;
        for(i = 0; i < nums.length; ++i) {
            if (val != nums[i]) {
                nums[counter++] = nums[i];
            }
        }

        for(i = counter; i < nums.length; ++i) {
            nums[i] = val;
        }

        System.out.println(Arrays.toString(nums));
        return counter;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        for(int k = m + n - 1; i >= 0 && j >= 0; nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--]) {
        }

        while(i == -1 && j >= 0) {
            nums1[j] = nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;

        while(true) {
            while(end >= 0) {
                if (s.charAt(end) == ' ') {
                    --end;
                } else {
                    int start;
                    for(start = end - 1; start >= 0 && s.charAt(start) != ' '; --start) {
                    }

                    sb.append(" ");
                    ++start;
                    ++end;
                    sb.append(s.substring(start, end));
                    end = start - 1;
                }
            }

            if (sb.length() > 0) {
                sb.deleteCharAt(0);
            }

            return sb.toString();
        }
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(true) {
            while(l < r) {
                char left = s.charAt(l);
                char right = s.charAt(r);
                if (Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)) {
                    if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                        return false;
                    }

                    ++l;
                    --r;
                } else if (!Character.isLetterOrDigit(left)) {
                    ++l;
                } else if (!Character.isLetterOrDigit(right)) {
                    --r;
                }
            }

            return true;
        }
    }
}
