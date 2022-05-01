#pragma once
#include "STRUCT.H"

using namespace std;
// so luong dong trong bang chi tiet hoa don
#define NUMBER_LINES_CTHD 18
#define MAX_NGAY 2
#define MAX_NAM 4
#define MAX_TEN_VT 20
#define MAX_DVT 10
#define MAX_SLT 9
#define NHAP_SO_LUONG_TON 2
#define NHAP_NGAY 0
#define NHAP_THANG 1
#define NHAP_NAM 2
#define NHAP_LOAI 3
// DEFINE NHẬP CHI TIẾT HOÁ ĐƠN
#define NHAP_MAVT 0
#define NHAP_THUE 1
#define NHAP_SO_LUONG 5
#define NHAP_DON_GIA 3
#define NHAP_THUE_EDITED 10
#define NHAP_SO_LUONG_EDITED 11
#define NHAP_DON_GIA_EDITED 12
#define MAX_THUE 2
#define MAX_MA_VT 10


// Cac HotKey
// Quay con tro ve 1 don vi char
#define BACKSPACE 8
// OK
#define ENTER 13
// thoat truc tiep va ve Menu chinh
#define ESC 27
// Di len
#define KEY_UP 72
// Di xuong
#define KEY_DOWN 80
// Di qua trai
#define KEY_LEFT 75
// Di qua phai
#define KEY_RIGHT 77
// Luu
#define KEY_F2 60
// Xoa
#define KEY_F3 61
// Hieu chinh
#define KEY_F4 62
// tim kiem vat tu
#define KEY_F5 63
// thanh toan hoa don
#define KEY_F7 65
// Save
#define KEY_F10 68
// Cuon page xuong duoi
#define PAGE_DOWN 81
// Cuon page len tren
#define PAGE_UP 73
// Khoang trang
#define SPACE  32
//  Tim kiem
#define KEY_F9 67

// thay unsigned int thanh uint
typedef unsigned int uint;

// ma mau
#define BLUE 1
#define BLACK 0
#define WHITE 7
#define GREEN 2
#define AQUA 3

#define LIGHT_GREEN 10



// size man hinh
#define GWIDTH 1100
#define GHEIGHT 670






// vi tri dong chu chay
#define xChuChay 45
#define yChuChay 30

//toa do max
#define xMax 144
#define yMax 35

//goc toa do
#define xOrdinal 0
#define yOrdinal 0


// toa do y cua  bang hien thi
#define yDisplay 2


// toa do t cua cac hoat key F2, F3, F4, F10
#define yHotkey 35



// chieu dai dai nhat cua ten
#define MAX_TEN 7

// chieu dai dai nhat cua ho
#define MAX_HO 16



#define NHAP_PHAI 0

// vi tri dong chu thong bao
#define X_NOTIFY 74
#define Y_NOTIFY 19



// so luong dong xuat hien trong 1 bang thong tin
#define NUMBER_LINES  29


// vi tri menu chinh
#define xMainMenu 10
#define yMainMenu 13// toa do x cua menu chinh


// toa do x cua SubMainMenus
#define xSubMainMenus1 38
#define xSubMainMenus2 59
#define xSubMainMenus3 83
#define xSubMainMenus4 50

#define maukhung 8
#define yMainMenu_Vat_Tu 36// toa do x cua menu chinh
#define yMainMenu_Nhan_Vien 36// toa do x cua menu chinh
#define yMainMenu_Hoa_Don 38// toa do x cua menu chinh
#define yDisplay 2

int xMainMenus[6] = { 20,38,59,83,107 };
// toa do y cua subMainMenus
int ySubMainMenus1[3] = { 18,23};
int ySubMainMenus2[2] = { 18,23};
int ySubMainMenus3[3] = { 18,23,28 };
int ySubMainMenus4[2] = { 18,23};
// Ten cac danh muc trong Menu chinh
extern string keyMainMenu[5];
// Ten cac danh muc trong Menu conSA
extern string keySubMainMenu3[3];
extern string keySubMainMenu2[2];
extern string keySubMainMenu1[2];
extern string keySubMainMenu4[2];

char dongChuChay[] = " CS152 DATA STRUCTURE -STUDENT: SANG HUYNH";
string keymenu_vat_tu[5] = { "MENU MATERIAL","ADD MATERIAL |F2", "MODIFY MATERIAL|F3", "DEL MATERIAL|F4","ESC" };
int xMainMenus_Vat_Tu[6] = { 20,45,65,89,107 };
string keymenu_nhan_vien[5] = { "MENU STAFF","ADD STAFF |F2", "MODIFY STAFF|F3", "DEL STAFF|F4","ESC" };
int xMainMenus_Nhan_Vien[6] = { 20,45,65,89,107 };
string keymenu_hoa_don[7] = { "MENU BILL","ADD BILL |F2", "MODIFY BILL|F3", "DEL BILL|F4","FIND ID MATERIAL|F5","PAYMENT|F7","ESC" };
int xMainMenus_Hoa_Don[8] = {12,25,43,65,80,105,125 }; 


int locate  = 0;
int index   = 0;




int xDisplayDS[6] = { 3,14, 34,46,56,68 };
int xDisplay_IN_DS_HD[6] = { 3,13, 34,46,65,85 };
int yDisplay_CTHD[4] = {13, 16, 33, 36};
int xDisplayTop10[4] = { 3,13, 34,60 };
string keyDisplayNV[4] = { "ID_STAFF", "LAST NAME", "FIRST NAME", "GENDER " };
string keyDisplayVT[5] = { "ID MATERIAL", "STUFF NAME", " UNIT ", "AMOUNT", "IN BILL"};
string keyDisplayCTHD[5] = {"ID MATERIAL","STUFF NAME  ", "SL ", "TAX", "PRICE"};
string keyDisplayHD[5] = {"BILL ID"," CREATE DAY  ", " TYPE ", "STAFF", "COST BILL"};
string keyDisplayTop10[3]={"ID_MATERIAL"," STUFFNAME ","PROFIT"};
string keyGuideNV[5] = { "                       ~~~GUIDES~~~                     ",
						"-> ID_STAFF    : RANDOM NUMBER.      ",
						"-> LAST NAME   :        MAX 16 LETTER.    ",
						"-> FIRST NAME  :         MAX 7 LETTER.     ",
						"-> GENDER      : 0 =  MAN, 1 = WOMAN.  "};

string keyBangNhapNV[10] = {"               ~~~ UPDATE STAFF ~~~                  ",
							"                                                    ",
							" ID_STAFF   :",
							"                                                    ",
							" LAST NAME   :",
							"                                                     ",
							" FIRST NAME  :",
							"                                                ",
							"GENDER [0, 1]:",
							"                                                  "};

string keyBangNhapVT[10] = {"               ~~~ UPDATE  MATERIAL~~~            ",
							"                                                  ",
							" ID MATERIAL    :",
							"                                                  ",
							" STUFF NAME     :",
							"                                                  ",
							"      UNIT      :",
							"                                                   ",
							" REMAIN AMOUNT  :",
							"                                                  "};
							
                                                  

string keyGuideVT[5] = {"                       ~~~GUIDES~~~                  ",
						"->ID MATERIAL       : RANDOM NUMBER .      ",
						"-> STUFF NAME       : MAX 20 LETTER.                 ",
						"-> UNIT             : MAX 10 LETTER.    ",
						"-> REMAIN AMOUNT    : MAX 5 NUMBER.                   "};


string keyBangNhapHD[12] = {"             ~~~ BILL INFORMATION ~~~           ",
							"                                                 ",
							" ID BILL     :",
							"                                                 ",
							" DAY         :",
							"                                                 ",
							" MONTH       :",
							"                                                 ",
							" YEAR         :",
							"                                                 ",
							" TYPE        :",
							"                                                 "};
string keyBangNhapHD1[7] = {"               TIME INPUT LABEL                  ",
							"                                                 ",
							"                 DAY     MONTH    YEAR           ",
							" From         :",
							"                                                 ",
							" to        :",
							"                                                 "};
string keyGuideHD[3] = {"             ~~~GUIDES~~~                        ",
						  "-> BILL ID:RANDOM NUMBER. ",
						  "-> TYPE      :  N = IN, X = OUT.              "};

string keyBangNhapCTHD[10] = {"          ~~~ UPDATE DETAIL BILL ~~~                 ",
							  "                                                   ",
							  " MATERIAL ID   :",
							  "                                                   ",
							  " TAX          :",
							  "                                                   ",
							  " AMOUNT      :",
                              "                                                   ",
							  " PRICE       :",
							  "                                                            "};  

string keyGuideCTHD[5] = {"                       ~~~GUIDES~~~                         ",
						  "-> MATERIALNAME : MAX 10 NUMBER LETTER.                              ",
						  "-> TAMOUNT      : MAX 9 NUMBER LETTER.                              ",
						  "-> PRICE        : MAX 9 NUMBER LETTER.                              "};

string keyBangNhapTimKiemVT[4] = {"     ~~~ MATERIAL FINGDING ~~~                        ",
								  "                                                         ",
								  "       NAME MATERIAL                                :",
								  "                                                        ",};
string keyBangNhapTimKiemHD[4] = {"     ~~~ BILL FINDING ~~~                     ",
								  "                                                       ",
								  " ID BILL  :",
								  "                                                     ",};
string keyGuideTimKiemVT[3] ={"                        ~~~GUIDES~~~                     ",
						      "-> NAME MATERIAL   : MAX 20 LETTER     "};
							 	
					  
string keyMainMenu[5] = { "MENU", "MATERIAL", "STAFF", "BILL","SAVE & QUIT" };
string keySubMainMenu1[2] = { 	"ADD AND MODIFY",
								"PRINT THE INCREASING LIST"};

string keySubMainMenu2[2] = { 	"ADD AND MODIFY",
								"PRINT LIST INCEASINGLY"};


string keySubMainMenu3[3] = { 	"MAKE A BILL",
								"PRINT BILL.",
								"STATICS" };

string keySubMainMenu4[2] = { 	"STATICS WITH TIME  ",
								"TOP 10 BEST MATERIAL",};
