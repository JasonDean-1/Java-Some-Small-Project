
public class SpiralSquare {

	public static void main(String[] args) {
		
		int n=8;                          //����
        int mat[][] = new int [n][n];
        int i,j,k=1;
        for (i=0;i<(n+1)/2;i++)           //i�������ɷ����Ȧ����һȦ����4����
        {                                 //j��������һ���ߵ�����
            for (j=i;j<n-i;j++)        //���ߣ������ң��в����б�
                mat[i][j] = k++;          //k��1������n*n
                
            for (j=i+1;j<n-i;j++)      //�ұߣ����ϵ��£��б��в���
                mat[j][n-i-1] = k++;
                
            for (j=n-i-2;j>=i;j--)        //�ױߣ����ҵ����в����б�
                mat[n-i-1][j] = k++;
               	
            for (j=n-i-2;j>=i+1;j--)      //��ߣ����µ��ϣ��б��в���
                mat[j][i] = k++;
        }
        
        for (i=0;i<mat.length;i++)        //�����ά���� 
        {
            for (j=0;j<mat[i].length;j++)
                System.out.print(mat[i][j]+"\t");
            System.out.println();
        }

	}

}
