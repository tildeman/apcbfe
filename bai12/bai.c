#include <stdio.h>
#include <stdlib.h>

struct SinhVien{
	char ten[20];
	char sdt[10];
	char diachi[20];	
};

// void menu(){
// }

int main(){
	struct SinhVien dssinhvien[50];
	fflush(stdin);
	scanf("%d",&chon);
	fflush(stdin);
	switch(chon){
		case 1:
			printf("\nNhập thông tin sinh viên");
			for (i=0;i<3;i++){
				printf("\nHọ và tên: ");
				gets(sinhvien[i].ten);
				printf("\nSố điện thoại: ");
				gets(sinhvien[i].sdt);
				printf("\nĐịa chỉ: ");
				gets(sinhvien[i].diachi);
			}
			printf("Bạn muốn tiếp tục không?\nTiếp tục [1]")
	}
}