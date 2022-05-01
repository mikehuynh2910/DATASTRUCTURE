#pragma once
#include <iostream>
#include <string>
#include<fstream>
#include <cstdlib>// rand , srand
#include<ctime>
#include"Process.h"
using namespace std;
//List Material
struct Material
{
	string ID_Material;
	string Name_Material;
	string Unit_Material;
	float Amount_Left;
	bool ch;// check created or not
};
typedef struct Material MATERIAL;

struct List_Material
{
	MATERIAL *List[100];
		int am = 0;
};
typedef struct List_Material LIST_MATERIAL;

//=====List Bill====
struct Bill
{
	//data
	string ID_Bill;
	string CreateDay;
	char type;//I: Import - E:Export
	//ListBill
	// LIST_DETAILBILL List_DetailBill
	//pointer
	Bill* pnext;
	//bool ch;
};
typedef struct Bill BILL;
struct List_Bill
{
	BILL* phead = NULL;
	int am = 0;
};
typedef struct List_Bill LIST_BILL;
//List Staff
struct Detail_Bill
{
	string ID_Material;
	 int Amount;
	 float price;
	 float tax;
	 bool Status;  // 1:Bought 0:Return Back
};
typedef struct Detail_Bill DETAIL_BILL;

struct List_DetailBill
{
	DETAIL_BILL List[20];
	int am = 0;
};
typedef struct List_DetailBill LIST_DETAILBILL;
struct Staff
{	//data
	int ID_Staff;
	string LastName;
	string FirstName;
	string Gender;
	//
	LIST_BILL List_bill;
	// * to ListBill
	//pointer
	Staff* pleft;
	Staff* pright;
};
typedef struct Staff *tree;

struct List_Staff
{
	tree TREE = NULL;
	int am = 0;
};
typedef struct List_Staff LIST_STAFF;


