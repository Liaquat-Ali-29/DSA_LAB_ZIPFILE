/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_task01;

/**
 *
 * @author Mujtaba Abr
 */
public class Lab2_Task01 {
   class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for (int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n]=nums[i];
        }
            return ans;
        
        }
   }
    
}