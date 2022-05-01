#pragma once
#include "DataStructure.h"
#include"Sub.h"
#include"ReadandWriteFile.h"
#include<fstream>
//=========== ADD LIST MATERIALS===============
//MATERIAL WORK
void Add_Material(LIST_MATERIAL& l_m);
int Check_Same(string a, LIST_MATERIAL l_m);
string Create_IDMate(LIST_MATERIAL l_m);
void Export_Material_List(LIST_MATERIAL l_m);
int Check_ID_Material(string a, LIST_MATERIAL l_m);
void Delete_Material(LIST_MATERIAL& l_m);
void Adjust_Material_Basedon_IDMatrerial(LIST_MATERIAL l_m);
//MATERIAL STAFF
Staff* create_Node_Staff();
bool Check_Same_IDStaff(tree t, int id);
void Add_1_Staff(tree& t, Staff* p);
int Create_ID_Staff(tree t);

// ADD + Modified STAFF
void Add_Staff(LIST_STAFF &l_s); 
void Adjust_Staff(LIST_STAFF& l_s);

// Print Name Staff
void TreetoArray(tree t, Staff *List[], int &NewList);
void Print_Staff_List(Staff *List[], int &newList);
void Arrange_Staff_List(Staff *List[], int &newList);
void Realse_Staff_List(Staff *List[], int &newList);
//Delete Staff
void Delete_Staff(LIST_STAFF& l_s);
void node_sub(tree& t, Staff*& x);
void Delete_1_Staff(tree& t, int ma);
void Adjust_1_Staff(tree t, int ma);


//================ Build Bill ==============
void Create_Bill(LIST_STAFF& l_s);
void Add_1_Bill(BILL*& phead, BILL* p);
Bill* Create_Node_Bill();
Staff* Check_Same_ID_Staff(tree t, int id);
bool Check_Same_Bill(BILL* phead, string id);
string Create_ID_Bill(LIST_BILL l_b);

//====== Menu=====
void menu()
{
	//=====Variables Delacration 
	LIST_MATERIAL l_m;
	bool ch = true;
	LIST_STAFF l_s;
	//LoadFile
	Read_File_Material_List(l_m);
	Read_File_List_Staff(l_s);
	while (ch)
	{
		system("cls");
		cout << "1. Add material." << endl;
		cout << "2. Export Material List." << endl;
		cout << "3. Delele Material ." << endl;
		cout << "4. Adjust Material." << endl;
		cout << "5. Add Staff." << endl;
		cout << "6. Print Staff List." << endl;
		cout << "7. Delete Staff." << endl;
		cout << "8. Adjust Staff." << endl;
		cout << "9. Make Bill." << endl;
		cout << "0. Quit." << endl;
		int choice;
		cout << "Input choice: " << endl;
		cin >> choice;
		switch (choice)
		{
		case 1:
		{
			if (l_m.am == 100) {
				cout << " CANNOT ADD MORE!FULL MATERIAL DATA" << endl;
				system("pause");
			}
			else
			{
				Add_Material(l_m);
			}
			break;
		}
		case 2:
		{
			Export_Material_List(l_m);
			system("pause");

			break;
		}
		case 3:
		{
			if (l_m.am == 0) {
				cout << " CANNOT DELETE !EMPTY MATERIAL DATA" << endl;
				system("pause");

			}
			else
			{
				Delete_Material(l_m);
			}
			break;
		}
		case 4://///////////////
		{
			if(l_m.am==0)
			{
				cout << "empty Data" << endl;
				system("pause");
			}
			else
			{
				Adjust_Material_Basedon_IDMatrerial( l_m);
			}
			break;
		}
		case 5:
		{
			Add_Staff(l_s);
			break;
		}
		case 6:
		{
			Staff* List[100];
			int newList = 0;
			TreetoArray(l_s.TREE, List, newList);
			Arrange_Staff_List(List, newList);
			Print_Staff_List(List, newList);
			Realse_Staff_List(List, newList);
			system("pause");
			break;

		}
		case 7:
		{
			Delete_Staff(l_s);
			system("pause");

			break;
		}
		case 8:
		{
			Adjust_Staff(l_s);
			system("pause");

			break;
		}
		case 9:
		{
			Create_Bill(l_s);
			break;
		}
		case 0:
			ch = false;
			break;
		}

	}
}
/////// ADD MATERIAL
void Add_Material(LIST_MATERIAL &l_m)
{
	MATERIAL* p = new MATERIAL;
	p->ID_Material = Create_IDMate(l_m);
	cout << "Add Material Name:" << endl;
	cin.ignore();
	getline(cin, p->Name_Material);
	cout << "Add Material Unit: " << endl;
	getline(cin, p->Unit_Material);
	cout << "Add Left Amount: " << endl;
	cin >> p->Amount_Left;
	//=========StringtoString
		StringtoString(p->ID_Material);
		StringtoString(p->Name_Material);
		StringtoString(p->Unit_Material);
	l_m.List[l_m.am]=p;
	l_m.am++;
}
string Create_IDMate(LIST_MATERIAL l_m)
{
	string a = "MA0000";
	do {
		for (int i= 2; i < a.length(); i++)
		{
			a[i] = rand() % (57 - 48 + 1) + 48;
		}
	} while (Check_Same(a, l_m) >= 0);
	return a;
}
int Check_Same(string a, LIST_MATERIAL l_m)
{
	for (int i = 0; i < l_m.am; i++)
	{
		if (l_m.List[i]->ID_Material == a)
		{
			return i;
		}
	}
	return -1;
}
//// Export Material List
void Export_Material_List(LIST_MATERIAL l_m)
{
	for (int i = 0; i < l_m.am; i++)
	{
		cout << " Material ID: " << l_m.List[i]->ID_Material << endl;
		cout << " Material Name: " << l_m.List[i]->Name_Material<<endl;
		cout << " Material Unit: " << l_m.List[i]->Unit_Material << endl;
		cout << " Amount Left: " << l_m.List[i]->Amount_Left << endl;
	}
}
void Delete_Material(LIST_MATERIAL & l_m)
{
	cout << "If the Data exist Material type in Bill, cannot Delete it." << endl;
	string a;
	cout << "Input ID Material: "; cin >> a;
	//String to String(a);
	//=======================
	int mate = Check_ID_Material(a, l_m);
	//======== Del ========
	if (mate < 0)
	{
		cout << "Exist or Billed Material." << endl;
		system("pause");
	}
	else
	{
		for (int i = mate; i < l_m.am - 1; i++)
		{
			l_m.List[i]->ID_Material = l_m.List[i + 1]->ID_Material;
			l_m.List[i]->Name_Material = l_m.List[i + 1]->Name_Material;
			l_m.List[i]->Unit_Material = l_m.List[i + 1]->Unit_Material;
			l_m.List[i]->Amount_Left = l_m.List[i + 1]->Amount_Left;
			l_m.List[i]->ch = l_m.List[i + 1]->ch;
		}
		
		MATERIAL  *tem = l_m.List[l_m.am - 1];
		l_m.am--;
		cout << "Succesfully Delete !" << endl;
		system("pause");
	}
}
int Check_ID_Material(string a, LIST_MATERIAL l_m)
{
	for (int i = 0; i < l_m.am; i++)//list material am=amount
	{
		//Check the Material "a" exist?
		if (l_m.List[i]->ID_Material ==  a)
		{
			//kcheck Created Bill or Not
			if (l_m.List[i]->ch == false)
			{
				return i;
			}
		}
	}
	return -1;
}
void Adjust_Material_Basedon_IDMatrerial(LIST_MATERIAL l_m)
{
	string a;
	cout << "Input Matrerial ID to modify: "; cin >> a;
	//========= Check IDMaterials =============
	int mate = Check_ID_Material(a, l_m);
	if (mate < 0)
	{
		cout << "This ID not exist!" << endl;
		system("pause");
	}
	else
	{
		//======== Modify ==========
		cout << "Input Material Name: ";
		cin.ignore();
		getline(cin, l_m.List[mate]->Name_Material);
		cout << "Input Material Unit: ";
		getline(cin, l_m.List[mate]->Unit_Material);
		StringtoString(l_m.List[mate]->Name_Material);
		StringtoString(l_m.List[mate]->Unit_Material);
		cout << "===================" << endl;
		cout << "Successfully Modified !" << endl;
		system("pause");
	}
}
//================STAFF=======================
//============ add STAFF
//====== Modify Staff
Staff* create_Node_Staff()
{
	Staff* p = new Staff;
	p->pleft = NULL;
	p->pright = NULL;
	return p;
}

void Add_Staff(LIST_STAFF &l_s)
{
	Staff *p = new Staff();
	cin.ignore();
	cout << "Input Staff LastName: "; getline(cin, p->LastName);
	cout << "Input Staff FirstName: "; getline(cin, p->FirstName);
	cout << "Input Gender: "; getline(cin, p->Gender);
	p->ID_Staff = Create_ID_Staff(l_s.TREE);
	Add_1_Staff(l_s.TREE, p);
	l_s.am++;

}
int Create_ID_Staff(tree t)
{
	int id;//100-999
	do
	{
		id = rand() % (999 - 100 + 1) + 100;

	} while (Check_Same_IDStaff(t, id) == true);
	return id;

}
bool Check_Same_IDStaff( tree t, int id)
{
		if (t == NULL)
		{
			return 0;
		}
		else
		{
			if(t->ID_Staff == id)
			{
				return 1;
			}
			else if (t->ID_Staff < id)
			{
				Check_Same_IDStaff(t->pright, id);
			}
			else
			{
				Check_Same_IDStaff(t->pleft, id);
			}
		}
}

void Add_1_Staff(tree& t, Staff* p)
{
	if (t == NULL)
	{
		t = p;
	}
	else
	{
		if (p->ID_Staff > t->ID_Staff)
		{
			Add_1_Staff(t->pright, p);
		}
		else if (p->ID_Staff < t->ID_Staff)
		{
			Add_1_Staff(t->pleft, p);
		}
	}
}
//========Print Staff List
//=====Step1: Cope Tree to Array Format 
void TreetoArray(tree t, Staff* List[], int & newList)
{
	if (t != NULL)
	{
		//data
		List[newList] = new Staff;
		List[newList]->ID_Staff = t->ID_Staff;
		List[newList]->LastName = t->LastName;
		List[newList]->FirstName = t->FirstName;
		List[newList]->Gender = t->Gender;
		newList++;
		TreetoArray(t->pleft, List, newList);
		TreetoArray(t->pright, List, newList);
	}
}
//------ Arrange Staff List -------
// Sorting ALGORITH
void Permutation_2_Staff(Staff *a, Staff *b)
{
	Staff *tem = new Staff;
	tem->ID_Staff = a->ID_Staff;
	tem->LastName = a->LastName;
	tem->FirstName = a->FirstName;
	tem->Gender = a->Gender;
	tem->List_bill = a->List_bill;
	//---------
	a->ID_Staff = b->ID_Staff;
	a->LastName = b->LastName;
	a->FirstName = b->FirstName;
	a->Gender = b->Gender;
	a->List_bill = b->List_bill;
	//-----------
	b->ID_Staff = tem->ID_Staff;
	b->LastName = tem->LastName;
	b->FirstName = tem->FirstName;
	b->Gender = tem->Gender;
	b->List_bill = tem->List_bill;
	delete tem;
}
void Arrange_Staff_List(Staff *List[], int& newList)
{
	for (int i = 0; i < newList - 1; i++)
	{
		for (int j = i + 1; j < newList; j++)
		{
			if (List[i]->FirstName > List[j]->FirstName)
			{
				Permutation_2_Staff(List[i], List[j]);
			}
			else if (List[i]->FirstName == List[j]->FirstName)
			{
				if (List[i]->LastName > List[j]->LastName)
				{
					Permutation_2_Staff(List[i], List[j]);
				}
			}
		}
	}
}
//--- Print Staff -------------
void Print_Staff_List(Staff *List[], int & newList)
{
	for (int i = 0; i < newList; i++)
	{
		cout << "\t\t======== STAFF " << i << " ========" << endl;
		cout << "Staff ID: " << List[i]->ID_Staff << endl;
		cout << "full Name:" << List[i]->LastName << " " << List[i]->FirstName << endl;
		cout << "Gender: " << List[i]->Gender << endl;
	}
}
//------------ Realse(free memory) ------------
void Realse_Staff_List(Staff *List[], int& newList)
{
	for (int i = 0; i < newList; i++)
	{
		delete List[i];
	}
}
//=============== DELETE STAFF
void Delete_Staff(LIST_STAFF& l_s)
{
	int a;
	cout << "Input Staff ID: "; cin >> a;
	bool kt = Check_Same_IDStaff(l_s.TREE, a);
	if (kt == true)
	{
		//xoa
		Delete_1_Staff(l_s.TREE, a);
		l_s.am--;
		cout << "Sucessfully Delete!" << endl;
	}
	else
	{
		cout << "ID not exist!" << endl;
	}
	system("pause");
}
void Delete_1_Staff(tree& t, int ma)
{
	if (t != NULL)
	{
		if (t->ID_Staff == ma)
		{
			Staff* x = t;//x BE SAVED TO RELEASED
			if (t->pleft == NULL)
			{
				t = t->pright;
			}
			else if (t->pright == NULL)
			{
				t = t->pleft;
			}
			else if (t->pleft != NULL && t->pright != NULL)
			{
				//fIND fINAL nODE: fINAL LEFT NODE> rIGHT NODE, PROCESS COMBINE TWO NODE
				node_sub(t->pright, x);
			}
			delete x;
		}
		else if (t->ID_Staff < ma)
		{
			Delete_1_Staff(t->pright, ma);
		}
		else if (t->ID_Staff > ma)
		{
			Delete_1_Staff(t->pleft, ma);
		}
	}
}
void node_sub(tree& t, Staff*& x)
{
	if (t->pleft != NULL)
	{
		node_sub(t->pleft, x);
	}
	else//final left
	{
		Permutation_2_Staff(t, x);
		x = t;//x SAVE THE POSITION NODE then deleted later
		t = t->pright;
	}
}
////=== MODIFY STAFF
///= ============ Modify Staff ==========
void Adjust_Staff(LIST_STAFF & l_s)
{
	int a;
	cout << "In put Adjust Staff ID: "; cin >> a;
	bool ch = Check_Same_IDStaff(l_s.TREE, a);
	if (ch == true)
	{
		Adjust_1_Staff(l_s.TREE, a);
		cout << "Successfully Modified" << endl;
	}
	else
	{
		cout << "ID not exist." << endl;
	}
system("pause");
}
void Adjust_1_Staff(tree t, int ma)
{
	if (t != NULL)
	{
		if (t->ID_Staff == ma)
		{
			cin.ignore();
			cout << "Input LastName: "; getline(cin, t->LastName);
			cout << "Input FirstName: "; getline(cin, t->FirstName);
			cout << "Input Gender: "; getline(cin, t->Gender);
			StringtoString(t->LastName);
			StringtoString(t->FirstName);
			StringtoString(t->Gender);
		}
		else if (t->ID_Staff > ma)
		{
			Adjust_1_Staff(t->pleft, ma);
		}
		else if (t->ID_Staff < ma)
		{
			Adjust_1_Staff(t->pright, ma);
		}
	}
}



//}
////================ Build Bill ==============
//BILL* Create_Node_Bill()
//{
//	BILL* p = new BILL;
//	p->pnext = NULL;
//}
void Create_Bill(LIST_STAFF & l_s)
{
	int a;
	cout << "Input ID Staff to Create Bill: "; cin >> a;
	Staff* tem = Check_Same_ID_Staff(l_s.TREE, a);
	if (tem == NULL)
	{
		cout << "Staff Id not exist!" << endl;
	}
	else
	{
		//Creat_Bill rESOLVEr
		BILL* p = Create_Node_Bill();
		bool inp;
		bool ktw = true;
		while (ktw == true)
		{
			system("cls");
			cout << "1. ImportBill Type" << endl;
			cout << "2. Export Bill Type" << endl;
			cout << "Nhap loai hoa don: "; int x;
			cin >> x;
			switch (x)
			{
			case 1:
			{
				cout << "ImportBill: " << endl;
				inp = true;
				p->type = 'N';
				ktw = false;
				break;
			}
			case 2:
			{
				cout << "Export Bill:" << endl;
				inp = false;
				p->type = 'X';
				ktw = false;
				break;
			}
			}
		}
		//======================
		p->ID_Bill = Create_ID_Bill(tem->List_bill);
		cout << "Bill ID: " << p->ID_Bill << endl;
		cin.ignore();
		cout << "Enter invoice date: "; getline(cin, p->CreateDay);
		//--------- adding bill to listbill --------
		Add_1_Bill(tem->List_bill.phead, p);
		cout << "Invoice Success! Press any key to continue making invoice detailsn" << endl;
		system("pause");
		cout << "Bill: " << p->type << " Bill_ID: " << p->ID_Bill << " Invoice date: " << p->CreateDay << endl;
	}
}
	

//
void Add_1_Bill(BILL*& phead, BILL* p)
{
	if (phead == NULL)
	{
		phead = p;
	}
	else
	{
		for (BILL* k = phead; k != NULL; k = k->pnext)
		{
			if (k->pnext == NULL)
			{
				k->pnext = p;
			}
		}
	}
}
//
Bill *Create_Node_Bill()
{
	BILL* p = new BILL;
	p->pnext = NULL;
	return p;
}
Staff* Check_Same_ID_Staff(tree t, int id)
{
	if (t != NULL)
	{
		if (t->ID_Staff == id)
		{
			return t;
		}
		else if (t->ID_Staff < id)
		{
			Check_Same_ID_Staff(t->pright, id);
		}
		else if (t->ID_Staff > id)
		{
			Check_Same_ID_Staff(t->pleft, id);
		}
}
	else
	{
	return NULL;
	}
}

//}
bool Check_Same_Bill(BILL* phead, string id)
{
	for (BILL* k = phead; k != NULL; k = k->pnext)
	{
		if (k->ID_Bill == id)
		{
			return true;
		}
	}
	return false;
}
string Create_ID_Bill(LIST_BILL l_b)
{
	string a = "BI0000";
	do
	{
		for (int i = 2; i < a.length(); i++)
		{
			a[i] = rand() % (57 - 48 + 1) + 48;
		}
	} while (Check_Same_Bill(l_b.phead, a) == true);
	return a;
}

//dEF





