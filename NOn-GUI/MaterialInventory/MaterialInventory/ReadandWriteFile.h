#pragma once
#include"DataStructure.h"
#include"Sub.h"
//===========Read and Write File
void Read_File_Material_List(LIST_MATERIAL &l_m)
{
	ifstream filein;
	filein.open("l_m.txt", ios_base::in);
	while (filein.eof() != true)
	{
		l_m.List[l_m.am] = new MATERIAL;
		getline(filein, l_m.List[l_m.am]->ID_Material,',');
		getline(filein, l_m.List[l_m.am]->Name_Material, ',');
		getline(filein, l_m.List[l_m.am]->Unit_Material, ',');
		filein>> l_m.List[l_m.am]->Amount_Left;
		filein.ignore();
		filein >> l_m.List[l_m.am]->ch;
		filein.ignore();
		l_m.am++;
	}
	filein.close();
}



////====== READFILE STAFF
void Read_File_List_Staff(LIST_STAFF& l_s)
{
	ifstream filein;
	filein.open("l_s.txt", ios_base::in);
	while (filein.eof() != true)
	{
		Staff* x = create_Node_Staff();
		filein >> x->ID_Staff;
		filein.ignore();
		getline(filein, x->LastName, ',');
		getline(filein, x->FirstName, ',');
		getline(filein, x->Gender, '\n');
		Add_1_Staff(l_s.TREE, x);
		l_s.am++;
	}
	filein.close();
}