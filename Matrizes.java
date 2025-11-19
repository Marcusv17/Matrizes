/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Matrizes {

    public static void main(String[] args) {
        int [][]matrizNum = {
            {1,2,3,4},
            {5,6,7,8}
        
};
        System.out.println("OS VALORES DA SUA MATRIZ");
        for(int i = 0;i< matrizNum.length; i++){
            for(int j = 0; j< matrizNum[i].length; j++){
                System.out.printf("| %-3d ", matrizNum[i][j]);
            }
            System.out.println("");
        }
        }
}