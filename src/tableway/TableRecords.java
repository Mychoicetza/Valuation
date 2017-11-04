package tableway;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by Engnoellemar on 10/3/2017.
 */
public class TableRecords {


    private final StringProperty ID;
    private final StringProperty YEAR;
    private final StringProperty OBJECTNO;
    private final StringProperty PAGENO;
    private final StringProperty PWARD;
    private final StringProperty PMTAA;
    private final StringProperty PRATEBLOCK;
    private final StringProperty POBJECT;
    private final StringProperty PBUILDINGNO;
    private final StringProperty NonRateable;
    private final StringProperty PLSTREET;
    private final StringProperty PLPLOTNO;
    private final StringProperty PLSURVEYBLOCK;
    private final StringProperty PLEXISTINGPROP;
    private final StringProperty PLMAPREF;
    private final StringProperty PLHYPERLINK;
    private final StringProperty INDIVIDUAL;
    private final StringProperty INDIVFN;
    private final StringProperty INDIVMN;
    private final StringProperty INDIVLN;
    private final StringProperty INDIVPH1;
    private final StringProperty INDIVPH2;
    private final StringProperty LegalEntity;
    private final StringProperty LEGALFCN;
    private final StringProperty LEGALPH1;
    private final StringProperty LEGALPH2;
    private final StringProperty OWNERFN;
    private final StringProperty OWNERMN;
    private final StringProperty OWNERLN;
    private final StringProperty OWNERPH1;
    private final StringProperty OWNERPH2;
    private final StringProperty OWNERPSTREET;
    private final StringProperty OWNERPLOTNO;
    private final StringProperty OWNERPOBOX;
    private final StringProperty OWNERREGION;
    private final StringProperty OWNERDISTRICT;
    private final StringProperty OWNERWARD;
    private final StringProperty OWNERMTAA;
    private final StringProperty OWNEREMAIL;
    private final StringProperty TENURE;
    private final StringProperty LAND;
    private final StringProperty ACTUALTRANSACTION;
    private final StringProperty TRANSACTIONDATE;
    private final StringProperty SOI;
    private final StringProperty NOSTORIES;
    private final StringProperty COMPLETE;
    private final StringProperty COMIND;
    private final StringProperty INSTI;
    private final StringProperty RES;
    private final StringProperty COYEAR;
    private final StringProperty RECOYEAR;
    private final StringProperty ROOF;
    private final StringProperty EXTWALL;
    private final StringProperty EXTFIN;
    private final StringProperty WINDOWS;
    private final StringProperty DOORS;
    private final StringProperty FLOOR;
    private final StringProperty CEILING;
    private final StringProperty NOFLOOR;
    private final StringProperty NOROOM;
    private final StringProperty WATER;
    private final StringProperty DRAINAGE;
    private final StringProperty ELECTRICITY;
    private final StringProperty HQ;
    private final StringProperty GQ;
    private final StringProperty AMENIT;
    private final StringProperty EXLLENT;
    private final StringProperty GOOD;
    private final StringProperty FAIR;
    private final StringProperty POOR;
    private final StringProperty ROAD;
    private final StringProperty FENCE;
    private final StringProperty COMP;
    private final StringProperty OBNONE;
    private final StringProperty OB1;
    private final StringProperty OB1HYPERLINK;
    private final StringProperty OB2;
    private final StringProperty OB2HYPERLINK;
    private final StringProperty OB3;
    private final StringProperty OB3HYPERLINK;
    private final StringProperty OB4;
    private final StringProperty OB4HYPERLINK;
    private final StringProperty SKETCH;
    private final StringProperty BULDHPHOTO1;
    private final StringProperty BULDHPHOTO2;
    private final StringProperty BATHS;
    private final StringProperty TOILETS;
    private final StringProperty MLEN;
    private final StringProperty MWID;
    private final StringProperty MAREA;
    private final StringProperty MREDFACT;
    private final StringProperty MCOMPFACT;
    private final StringProperty MREDFACTAREA;
    private final StringProperty OB1LEN;
    private final StringProperty OB1WID;
    private final StringProperty OB1AREA;
    private final StringProperty OB1REDFACT;
    private final StringProperty OB1COMPFACT;
    private final StringProperty OB1REDFACTAREA;
    private final StringProperty OB2LEN;
    private final StringProperty OB2WID;
    private final StringProperty OB2AREA;
    private final StringProperty OB2REDFACT;
    private final StringProperty OB2COMPFACT;
    private final StringProperty OB2REDFACTAREA;
    private final StringProperty OB3LEN;
    private final StringProperty OB3WID;
    private final StringProperty OB3AREA;
    private final StringProperty OB3REDFACT;
    private final StringProperty OB3COMPFACT;
    private final StringProperty OB3REDFACTAREA;
    private final StringProperty OB4LEN;
    private final StringProperty OB4WID;
    private final StringProperty OB4AREA;
    private final StringProperty OB4REDFACT;
    private final StringProperty OB4COMPFACT;
    private final StringProperty OB4REDFACTAREA;
    private final StringProperty TOTALRFA;
    private final StringProperty TOTALRFASQR;
    private final StringProperty MULTIPLYBTALL;
    private final StringProperty CURRENTREPLACEMENT;
    private final StringProperty LESSDEPREC;
    private final StringProperty DEPRECREPLACEMENT;
    private final StringProperty INSPECTEDBY;
    private final StringProperty CHECKEDBY;
    private final StringProperty APPROVEDBY;
    private final StringProperty COMPANYNAME;
    private final StringProperty COMPANYSTAMP;
    private final StringProperty CERTIFIEDDATE;
    private final StringProperty TIN;

    public TableRecords(String id, String docrefyear, String docrefobjectno, String docrefpageno, String proprefward, String proprefmtaa, String proprefrateblock, String proprefobjectno, String proprefbuildingno, String nonrateable, String proplocstreet, String proplocplotno, String proplocsurveyblock, String proplocexistingrefno, String proplocmapreferenc, String proplochyperlink, String individual, String individualfirstname, String individualmiddlename, String individuallastname, String individualphone1, String individualphone2, String legalentity, String legalentityfullcompanyname, String legalentityphone1, String legalentityphone2, String ownerinfofirstname, String ownerinfomiddlename, String ownerinfolastname, String ownerinfophone1, String ownerinfophone2, String ownerinfostreet, String ownerinfoplotno, String ownerinfopobox, String ownerinforegion, String ownerinfodistrict, String ownerinfoward, String ownerinfomtaa, String ownerinfoemail, String tenure, String landuse, String actualtransaction, String transactiondate, String soi, String noofstories, String complete, String comind, String insti, String res, String coyear, String recoyear, String roof, String extwall, String extfin, String windows, String doors, String floor, String ceiling, String nofloor, String noroom, String water, String drainage, String electricity, String hq, String gq, String amenit, String exllent, String good, String fair, String poor, String road, String fence, String comp, String obnone, String ob1, String obno1hyperlink, String ob2, String obno2hyperlink, String ob3, String obno3hyperlink, String ob4, String obno4hyperlink, String sketchphoto, String buildphoto1, String buildphoto2, String noofbaths, String nooftoilets, String mblen, String mbwid, String mbarea, String mbredfact, String mbcompfact, String mbredfactarea, String ob1len, String ob1wid, String ob1area, String ob1redfact, String ob1compfact, String ob1redfactarea, String ob2len, String ob2wid, String ob2area, String ob2redfact, String ob2compfact, String ob2redfactarea, String ob3len, String ob3wid, String ob3area, String ob3redfact, String ob3compfact, String ob3redfactarea, String ob4len, String ob4wid, String ob4area, String ob4redfact, String ob4compfact, String ob4redfactarea, String totalrfa, String totalrfasqr, String multiplybyall, String currentreplacementcost, String lessdeprec, String deprecreplacementcost, String inspectedby, String checkedby, String approvedby, String companyname, String companystamp, String certifieddate,String tin) {


        this.ID = new SimpleStringProperty(id);
        this.YEAR = new SimpleStringProperty(docrefyear);
        this.OBJECTNO = new SimpleStringProperty(docrefobjectno);
        this.PAGENO = new SimpleStringProperty(docrefpageno);
        this.PWARD = new SimpleStringProperty(proprefward);
        this.PMTAA = new SimpleStringProperty(proprefmtaa);
        this.PRATEBLOCK = new SimpleStringProperty(proprefrateblock);
        this.POBJECT = new SimpleStringProperty(proprefobjectno);
        this.PBUILDINGNO = new SimpleStringProperty(proprefbuildingno);
        this.NonRateable = new SimpleStringProperty(nonrateable);
        this.PLSTREET = new SimpleStringProperty(proplocstreet);
        this.PLPLOTNO =  new SimpleStringProperty(proplocplotno);
        this.PLSURVEYBLOCK =  new SimpleStringProperty(proplocsurveyblock);
        this.PLEXISTINGPROP =  new SimpleStringProperty(proplocexistingrefno);
        this.PLMAPREF =  new SimpleStringProperty(proplocmapreferenc);
        this.PLHYPERLINK =  new SimpleStringProperty(proplochyperlink);
        this.INDIVIDUAL =  new SimpleStringProperty(individual);
        this.INDIVFN =  new SimpleStringProperty(individualfirstname);
        this.INDIVMN =  new SimpleStringProperty(individualmiddlename);
        this.INDIVLN =  new SimpleStringProperty(individuallastname);
        this.INDIVPH1 =  new SimpleStringProperty(individualphone1);
        this.INDIVPH2 =  new SimpleStringProperty(individualphone2);
        this.LegalEntity =  new SimpleStringProperty(legalentity);
        this.LEGALFCN =  new SimpleStringProperty(legalentityfullcompanyname);
        this.LEGALPH1 =  new SimpleStringProperty(legalentityphone1);
        this.LEGALPH2 =  new SimpleStringProperty(legalentityphone2);
        this.OWNERFN =  new SimpleStringProperty(ownerinfofirstname);
        this.OWNERMN =  new SimpleStringProperty(ownerinfomiddlename);
        this.OWNERLN =  new SimpleStringProperty(ownerinfolastname);
        this.OWNERPH1 =  new SimpleStringProperty(ownerinfophone1);
        this.OWNERPH2 =  new SimpleStringProperty(ownerinfophone2);
        this.OWNERPSTREET = new SimpleStringProperty(ownerinfostreet);
        this.OWNERPLOTNO =  new SimpleStringProperty(ownerinfoplotno);
        this.OWNERPOBOX =  new SimpleStringProperty(ownerinfopobox);
        this.OWNERREGION =  new SimpleStringProperty(ownerinforegion);
        this.OWNERDISTRICT = new SimpleStringProperty(ownerinfodistrict);     ;
        this.OWNERWARD = new SimpleStringProperty(ownerinfoward);
        this.OWNERMTAA =  new SimpleStringProperty(ownerinfomtaa);
        this.OWNEREMAIL =  new SimpleStringProperty(ownerinfoemail);
        this.TENURE =  new SimpleStringProperty(tenure);
        this.LAND =  new SimpleStringProperty(landuse);
        this.ACTUALTRANSACTION =  new SimpleStringProperty(actualtransaction);
        this.TRANSACTIONDATE =  new SimpleStringProperty(transactiondate);
        this.SOI =  new SimpleStringProperty(soi);
        this.NOSTORIES =  new SimpleStringProperty(noofstories);
        this.COMPLETE =  new SimpleStringProperty(complete);
        this.COMIND =  new SimpleStringProperty(comind);
        this.INSTI =  new SimpleStringProperty(insti);
        this.RES =  new SimpleStringProperty(res);
        this.COYEAR =  new SimpleStringProperty(coyear);
        this.RECOYEAR =  new SimpleStringProperty(recoyear);
        this.ROOF =  new SimpleStringProperty(roof);
        this.EXTWALL =  new SimpleStringProperty(extwall);
        this.EXTFIN =  new SimpleStringProperty(extfin);
        this.WINDOWS =  new SimpleStringProperty(windows);
        this.DOORS =  new SimpleStringProperty(doors);
        this.FLOOR =  new SimpleStringProperty(floor);
        this.CEILING =  new SimpleStringProperty(ceiling);
        this.NOFLOOR =  new SimpleStringProperty(nofloor);
        this.NOROOM =  new SimpleStringProperty(noroom);
        this.WATER =  new SimpleStringProperty(water);
        this.DRAINAGE =  new SimpleStringProperty(drainage);
        this.ELECTRICITY=  new SimpleStringProperty(electricity);
        this.HQ =  new SimpleStringProperty(hq);
        this.GQ = new SimpleStringProperty(gq);
        this.AMENIT =  new SimpleStringProperty(amenit);
        this.EXLLENT =  new SimpleStringProperty(exllent);
        this.GOOD =  new SimpleStringProperty(good);
        this.FAIR =  new SimpleStringProperty(fair);
        this.POOR =  new SimpleStringProperty(poor);
        this.ROAD =  new SimpleStringProperty(road);
        this.FENCE =  new SimpleStringProperty(fence);
        this.COMP =  new SimpleStringProperty(comp);
        this.OBNONE =  new SimpleStringProperty(obnone);
        this.OB1 =  new SimpleStringProperty(ob1);
        this.OB1HYPERLINK =  new SimpleStringProperty(obno1hyperlink);
        this.OB2 =  new SimpleStringProperty(ob2);
        this.OB2HYPERLINK =  new SimpleStringProperty(obno2hyperlink);
        this.OB3 =  new SimpleStringProperty(ob3);
        this.OB3HYPERLINK =  new SimpleStringProperty(obno3hyperlink);
        this.OB4 =  new SimpleStringProperty(ob4);
        this.OB4HYPERLINK =  new SimpleStringProperty(obno4hyperlink);
        this.SKETCH =  new SimpleStringProperty(sketchphoto);
        this.BULDHPHOTO1 =  new SimpleStringProperty(buildphoto1);
        this.BULDHPHOTO2 =  new SimpleStringProperty(buildphoto2);
        this.BATHS =  new SimpleStringProperty(noofbaths);
        this.TOILETS =  new SimpleStringProperty(nooftoilets);
        this.MLEN =  new SimpleStringProperty(mblen);
        this.MWID =  new SimpleStringProperty(mbwid);
        this.MAREA =  new SimpleStringProperty(mbarea);
        this.MREDFACT =  new SimpleStringProperty(mbredfact);
        this.MCOMPFACT =  new SimpleStringProperty(mbcompfact);
        this.MREDFACTAREA =  new SimpleStringProperty(mbredfactarea);
        this.OB1LEN =  new SimpleStringProperty(ob1len);
        this.OB1WID =  new SimpleStringProperty(ob1wid);
        this.OB1AREA =  new SimpleStringProperty(ob1area);
        this.OB1REDFACT =  new SimpleStringProperty(ob1redfact);
        this.OB1COMPFACT =  new SimpleStringProperty(ob1compfact);
        this.OB1REDFACTAREA =  new SimpleStringProperty(ob1redfactarea);
        this.OB2LEN =  new SimpleStringProperty(ob2len);
        this.OB2WID =  new SimpleStringProperty(ob2wid);
        this.OB2AREA =  new SimpleStringProperty(ob2area);
        this.OB2REDFACT =  new SimpleStringProperty(ob2redfact);
        this.OB2COMPFACT =  new SimpleStringProperty(ob2compfact);
        this.OB2REDFACTAREA =  new SimpleStringProperty(ob2redfactarea);
        this.OB3LEN =  new SimpleStringProperty(ob3len);
        this.OB3WID =  new SimpleStringProperty(ob3wid);
        this.OB3AREA =  new SimpleStringProperty(ob3area);
        this.OB3REDFACT =  new SimpleStringProperty(ob3redfact);
        this.OB3COMPFACT =  new SimpleStringProperty(ob3compfact);
        this.OB3REDFACTAREA =  new SimpleStringProperty(ob3redfactarea);
        this.OB4LEN =  new SimpleStringProperty(ob4len);
        this.OB4WID =  new SimpleStringProperty(ob4wid);
        this.OB4AREA =  new SimpleStringProperty(ob4area);
        this.OB4REDFACT =  new SimpleStringProperty(ob4redfact);
        this.OB4COMPFACT =  new SimpleStringProperty(ob4compfact);
        this.OB4REDFACTAREA =  new SimpleStringProperty(ob4redfactarea);
        this.TOTALRFA =  new SimpleStringProperty(totalrfa);
        this.TOTALRFASQR =  new SimpleStringProperty(totalrfasqr);
        this.MULTIPLYBTALL =  new SimpleStringProperty(multiplybyall);
        this.CURRENTREPLACEMENT =  new SimpleStringProperty(currentreplacementcost);
        this.LESSDEPREC =  new SimpleStringProperty(lessdeprec);
        this.DEPRECREPLACEMENT =  new SimpleStringProperty(deprecreplacementcost);
        this.INSPECTEDBY =  new SimpleStringProperty(inspectedby);
        this.CHECKEDBY =  new SimpleStringProperty(checkedby);
        this.APPROVEDBY =  new SimpleStringProperty(approvedby);
        this.COMPANYNAME =  new SimpleStringProperty(companyname);
        this.COMPANYSTAMP =  new SimpleStringProperty(companystamp);
        this.CERTIFIEDDATE =  new SimpleStringProperty(certifieddate);
        this.TIN =  new SimpleStringProperty(tin);

    }


    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

    public void setID(String ID) {
        this.ID.set(ID);
    }

    public String getYEAR() {
        return YEAR.get();
    }

    public StringProperty YEARProperty() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR.set(YEAR);
    }

    public String getOBJECTNO() {
        return OBJECTNO.get();
    }

    public StringProperty OBJECTNOProperty() {
        return OBJECTNO;
    }

    public void setOBJECTNO(String OBJECTNO) {
        this.OBJECTNO.set(OBJECTNO);
    }

    public String getPAGENO() {
        return PAGENO.get();
    }

    public StringProperty PAGENOProperty() {
        return PAGENO;
    }

    public void setPAGENO(String PAGENO) {
        this.PAGENO.set(PAGENO);
    }

    public String getPWARD() {
        return PWARD.get();
    }

    public StringProperty PWARDProperty() {
        return PWARD;
    }

    public void setPWARD(String PWARD) {
        this.PWARD.set(PWARD);
    }

    public String getPMTAA() {
        return PMTAA.get();
    }

    public StringProperty PMTAAProperty() {
        return PMTAA;
    }

    public void setPMTAA(String PMTAA) {
        this.PMTAA.set(PMTAA);
    }

    public String getPRATEBLOCK() {
        return PRATEBLOCK.get();
    }

    public StringProperty PRATEBLOCKProperty() {
        return PRATEBLOCK;
    }

    public void setPRATEBLOCK(String PRATEBLOCK) {
        this.PRATEBLOCK.set(PRATEBLOCK);
    }

    public String getPOBJECT() {
        return POBJECT.get();
    }

    public StringProperty POBJECTProperty() {
        return POBJECT;
    }

    public void setPOBJECT(String POBJECT) {
        this.POBJECT.set(POBJECT);
    }

    public String getPBUILDINGNO() {
        return PBUILDINGNO.get();
    }

    public StringProperty PBUILDINGNOProperty() {
        return PBUILDINGNO;
    }

    public void setPBUILDINGNO(String PBUILDINGNO) {
        this.PBUILDINGNO.set(PBUILDINGNO);
    }

    public String getNonRateable() {
        return NonRateable.get();
    }

    public StringProperty nonRateableProperty() {
        return NonRateable;
    }

    public void setNonRateable(String nonRateable) {
        this.NonRateable.set(nonRateable);
    }

    public String getPLSTREET() {
        return PLSTREET.get();
    }

    public StringProperty PLSTREETProperty() {
        return PLSTREET;
    }

    public void setPLSTREET(String PLSTREET) {
        this.PLSTREET.set(PLSTREET);
    }

    public String getPLPLOTNO() {
        return PLPLOTNO.get();
    }

    public StringProperty PLPLOTNOProperty() {
        return PLPLOTNO;
    }

    public void setPLPLOTNO(String PLPLOTNO) {
        this.PLPLOTNO.set(PLPLOTNO);
    }

    public String getPLSURVEYBLOCK() {
        return PLSURVEYBLOCK.get();
    }

    public StringProperty PLSURVEYBLOCKProperty() {
        return PLSURVEYBLOCK;
    }

    public void setPLSURVEYBLOCK(String PLSURVEYBLOCK) {
        this.PLSURVEYBLOCK.set(PLSURVEYBLOCK);
    }

    public String getPLEXISTINGPROP() {
        return PLEXISTINGPROP.get();
    }

    public StringProperty PLEXISTINGPROPProperty() {
        return PLEXISTINGPROP;
    }

    public void setPLEXISTINGPROP(String PLEXISTINGPROP) {
        this.PLEXISTINGPROP.set(PLEXISTINGPROP);
    }

    public String getPLMAPREF() {
        return PLMAPREF.get();
    }

    public StringProperty PLMAPREFProperty() {
        return PLMAPREF;
    }

    public void setPLMAPREF(String PLMAPREF) {
        this.PLMAPREF.set(PLMAPREF);
    }

    public String getPLHYPERLINK() {
        return PLHYPERLINK.get();
    }

    public StringProperty PLHYPERLINKProperty() {
        return PLHYPERLINK;
    }

    public void setPLHYPERLINK(String PLHYPERLINK) {
        this.PLHYPERLINK.set(PLHYPERLINK);
    }

    public String getINDIVIDUAL() {
        return INDIVIDUAL.get();
    }

    public StringProperty INDIVIDUALProperty() {
        return INDIVIDUAL;
    }

    public void setINDIVIDUAL(String INDIVIDUAL) {
        this.INDIVIDUAL.set(INDIVIDUAL);
    }

    public String getINDIVFN() {
        return INDIVFN.get();
    }

    public StringProperty INDIVFNProperty() {
        return INDIVFN;
    }

    public void setINDIVFN(String INDIVFN) {
        this.INDIVFN.set(INDIVFN);
    }

    public String getINDIVMN() {
        return INDIVMN.get();
    }

    public StringProperty INDIVMNProperty() {
        return INDIVMN;
    }

    public void setINDIVMN(String INDIVMN) {
        this.INDIVMN.set(INDIVMN);
    }

    public String getINDIVLN() {
        return INDIVLN.get();
    }

    public StringProperty INDIVLNProperty() {
        return INDIVLN;
    }

    public void setINDIVLN(String INDIVLN) {
        this.INDIVLN.set(INDIVLN);
    }

    public String getINDIVPH1() {
        return INDIVPH1.get();
    }

    public StringProperty INDIVPH1Property() {
        return INDIVPH1;
    }

    public void setINDIVPH1(String INDIVPH1) {
        this.INDIVPH1.set(INDIVPH1);
    }

    public String getINDIVPH2() {
        return INDIVPH2.get();
    }

    public StringProperty INDIVPH2Property() {
        return INDIVPH2;
    }

    public void setINDIVPH2(String INDIVPH2) {
        this.INDIVPH2.set(INDIVPH2);
    }

    public String getLegalEntity() {
        return LegalEntity.get();
    }

    public StringProperty legalEntityProperty() {
        return LegalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.LegalEntity.set(legalEntity);
    }

    public String getLEGALFCN() {
        return LEGALFCN.get();
    }

    public StringProperty LEGALFCNProperty() {
        return LEGALFCN;
    }

    public void setLEGALFCN(String LEGALFCN) {
        this.LEGALFCN.set(LEGALFCN);
    }

    public String getLEGALPH1() {
        return LEGALPH1.get();
    }

    public StringProperty LEGALPH1Property() {
        return LEGALPH1;
    }

    public void setLEGALPH1(String LEGALPH1) {
        this.LEGALPH1.set(LEGALPH1);
    }

    public String getLEGALPH2() {
        return LEGALPH2.get();
    }

    public StringProperty LEGALPH2Property() {
        return LEGALPH2;
    }

    public void setLEGALPH2(String LEGALPH2) {
        this.LEGALPH2.set(LEGALPH2);
    }

    public String getOWNERFN() {
        return OWNERFN.get();
    }

    public StringProperty OWNERFNProperty() {
        return OWNERFN;
    }

    public void setOWNERFN(String OWNERFN) {
        this.OWNERFN.set(OWNERFN);
    }

    public String getOWNERMN() {
        return OWNERMN.get();
    }

    public StringProperty OWNERMNProperty() {
        return OWNERMN;
    }

    public void setOWNERMN(String OWNERMN) {
        this.OWNERMN.set(OWNERMN);
    }

    public String getOWNERLN() {
        return OWNERLN.get();
    }

    public StringProperty OWNERLNProperty() {
        return OWNERLN;
    }

    public void setOWNERLN(String OWNERLN) {
        this.OWNERLN.set(OWNERLN);
    }

    public String getOWNERPH1() {
        return OWNERPH1.get();
    }

    public StringProperty OWNERPH1Property() {
        return OWNERPH1;
    }

    public void setOWNERPH1(String OWNERPH1) {
        this.OWNERPH1.set(OWNERPH1);
    }

    public String getOWNERPH2() {
        return OWNERPH2.get();
    }

    public StringProperty OWNERPH2Property() {
        return OWNERPH2;
    }

    public void setOWNERPH2(String OWNERPH2) {
        this.OWNERPH2.set(OWNERPH2);
    }

    public String getOWNERPSTREET() {
        return OWNERPSTREET.get();
    }

    public StringProperty OWNERPSTREETProperty() {
        return OWNERPSTREET;
    }

    public void setOWNERPSTREET(String OWNERPSTREET) {
        this.OWNERPSTREET.set(OWNERPSTREET);
    }

    public String getOWNERPLOTNO() {
        return OWNERPLOTNO.get();
    }

    public StringProperty OWNERPLOTNOProperty() {
        return OWNERPLOTNO;
    }

    public void setOWNERPLOTNO(String OWNERPLOTNO) {
        this.OWNERPLOTNO.set(OWNERPLOTNO);
    }

    public String getOWNERPOBOX() {
        return OWNERPOBOX.get();
    }

    public StringProperty OWNERPOBOXProperty() {
        return OWNERPOBOX;
    }

    public void setOWNERPOBOX(String OWNERPOBOX) {
        this.OWNERPOBOX.set(OWNERPOBOX);
    }

    public String getOWNERREGION() {
        return OWNERREGION.get();
    }

    public StringProperty OWNERREGIONProperty() {
        return OWNERREGION;
    }

    public void setOWNERREGION(String OWNERREGION) {
        this.OWNERREGION.set(OWNERREGION);
    }

    public String getOWNERDISTRICT() {
        return OWNERDISTRICT.get();
    }

    public StringProperty OWNERDISTRICTProperty() {
        return OWNERDISTRICT;
    }

    public void setOWNERDISTRICT(String OWNERDISTRICT) {
        this.OWNERDISTRICT.set(OWNERDISTRICT);
    }

    public String getOWNERWARD() {
        return OWNERWARD.get();
    }

    public StringProperty OWNERWARDProperty() {
        return OWNERWARD;
    }

    public void setOWNERWARD(String OWNERWARD) {
        this.OWNERWARD.set(OWNERWARD);
    }

    public String getOWNERMTAA() {
        return OWNERMTAA.get();
    }

    public StringProperty OWNERMTAAProperty() {
        return OWNERMTAA;
    }

    public void setOWNERMTAA(String OWNERMTAA) {
        this.OWNERMTAA.set(OWNERMTAA);
    }

    public String getOWNEREMAIL() {
        return OWNEREMAIL.get();
    }

    public StringProperty OWNEREMAILProperty() {
        return OWNEREMAIL;
    }

    public void setOWNEREMAIL(String OWNEREMAIL) {
        this.OWNEREMAIL.set(OWNEREMAIL);
    }

    public String getTENURE() {
        return TENURE.get();
    }

    public StringProperty TENUREProperty() {
        return TENURE;
    }

    public void setTENURE(String TENURE) {
        this.TENURE.set(TENURE);
    }

    public String getLAND() {
        return LAND.get();
    }

    public StringProperty LANDProperty() {
        return LAND;
    }

    public void setLAND(String LAND) {
        this.LAND.set(LAND);
    }

    public String getACTUALTRANSACTION() {
        return ACTUALTRANSACTION.get();
    }

    public StringProperty ACTUALTRANSACTIONProperty() {
        return ACTUALTRANSACTION;
    }

    public void setACTUALTRANSACTION(String ACTUALTRANSACTION) {
        this.ACTUALTRANSACTION.set(ACTUALTRANSACTION);
    }

    public String getTRANSACTIONDATE() {
        return TRANSACTIONDATE.get();
    }

    public StringProperty TRANSACTIONDATEProperty() {
        return TRANSACTIONDATE;
    }

    public void setTRANSACTIONDATE(String TRANSACTIONDATE) {
        this.TRANSACTIONDATE.set(TRANSACTIONDATE);
    }

    public String getSOI() {
        return SOI.get();
    }

    public StringProperty SOIProperty() {
        return SOI;
    }

    public void setSOI(String SOI) {
        this.SOI.set(SOI);
    }

    public String getNOSTORIES() {
        return NOSTORIES.get();
    }

    public StringProperty NOSTORIESProperty() {
        return NOSTORIES;
    }

    public void setNOSTORIES(String NOSTORIES) {
        this.NOSTORIES.set(NOSTORIES);
    }

    public String getCOMPLETE() {
        return COMPLETE.get();
    }

    public StringProperty COMPLETEProperty() {
        return COMPLETE;
    }

    public void setCOMPLETE(String COMPLETE) {
        this.COMPLETE.set(COMPLETE);
    }

    public String getCOMIND() {
        return COMIND.get();
    }

    public StringProperty COMINDProperty() {
        return COMIND;
    }

    public void setCOMIND(String COMIND) {
        this.COMIND.set(COMIND);
    }

    public String getINSTI() {
        return INSTI.get();
    }

    public StringProperty INSTIProperty() {
        return INSTI;
    }

    public void setINSTI(String INSTI) {
        this.INSTI.set(INSTI);
    }

    public String getRES() {
        return RES.get();
    }

    public StringProperty RESProperty() {
        return RES;
    }

    public void setRES(String RES) {
        this.RES.set(RES);
    }

    public String getCOYEAR() {
        return COYEAR.get();
    }

    public StringProperty COYEARProperty() {
        return COYEAR;
    }

    public void setCOYEAR(String COYEAR) {
        this.COYEAR.set(COYEAR);
    }

    public String getRECOYEAR() {
        return RECOYEAR.get();
    }

    public StringProperty RECOYEARProperty() {
        return RECOYEAR;
    }

    public void setRECOYEAR(String RECOYEAR) {
        this.RECOYEAR.set(RECOYEAR);
    }

    public String getROOF() {
        return ROOF.get();
    }

    public StringProperty ROOFProperty() {
        return ROOF;
    }

    public void setROOF(String ROOF) {
        this.ROOF.set(ROOF);
    }

    public String getEXTWALL() {
        return EXTWALL.get();
    }

    public StringProperty EXTWALLProperty() {
        return EXTWALL;
    }

    public void setEXTWALL(String EXTWALL) {
        this.EXTWALL.set(EXTWALL);
    }

    public String getEXTFIN() {
        return EXTFIN.get();
    }

    public StringProperty EXTFINProperty() {
        return EXTFIN;
    }

    public void setEXTFIN(String EXTFIN) {
        this.EXTFIN.set(EXTFIN);
    }

    public String getWINDOWS() {
        return WINDOWS.get();
    }

    public StringProperty WINDOWSProperty() {
        return WINDOWS;
    }

    public void setWINDOWS(String WINDOWS) {
        this.WINDOWS.set(WINDOWS);
    }

    public String getDOORS() {
        return DOORS.get();
    }

    public StringProperty DOORSProperty() {
        return DOORS;
    }

    public void setDOORS(String DOORS) {
        this.DOORS.set(DOORS);
    }

    public String getFLOOR() {
        return FLOOR.get();
    }

    public StringProperty FLOORProperty() {
        return FLOOR;
    }

    public void setFLOOR(String FLOOR) {
        this.FLOOR.set(FLOOR);
    }

    public String getCEILING() {
        return CEILING.get();
    }

    public StringProperty CEILINGProperty() {
        return CEILING;
    }

    public void setCEILING(String CEILING) {
        this.CEILING.set(CEILING);
    }

    public String getNOFLOOR() {
        return NOFLOOR.get();
    }

    public StringProperty NOFLOORProperty() {
        return NOFLOOR;
    }

    public void setNOFLOOR(String NOFLOOR) {
        this.NOFLOOR.set(NOFLOOR);
    }

    public String getNOROOM() {
        return NOROOM.get();
    }

    public StringProperty NOROOMProperty() {
        return NOROOM;
    }

    public void setNOROOM(String NOROOM) {
        this.NOROOM.set(NOROOM);
    }

    public String getWATER() {
        return WATER.get();
    }

    public StringProperty WATERProperty() {
        return WATER;
    }

    public void setWATER(String WATER) {
        this.WATER.set(WATER);
    }

    public String getDRAINAGE() {
        return DRAINAGE.get();
    }

    public StringProperty DRAINAGEProperty() {
        return DRAINAGE;
    }

    public void setDRAINAGE(String DRAINAGE) {
        this.DRAINAGE.set(DRAINAGE);
    }

    public String getELECTRICITY() {
        return ELECTRICITY.get();
    }

    public StringProperty ELECTRICITYProperty() {
        return ELECTRICITY;
    }

    public void setELECTRICITY(String ELECTRICITY) {
        this.ELECTRICITY.set(ELECTRICITY);
    }

    public String getHQ() {
        return HQ.get();
    }

    public StringProperty HQProperty() {
        return HQ;
    }

    public void setHQ(String HQ) {
        this.HQ.set(HQ);
    }

    public String getGQ() {
        return GQ.get();
    }

    public StringProperty GQProperty() {
        return GQ;
    }

    public void setGQ(String GQ) {
        this.GQ.set(GQ);
    }

    public String getAMENIT() {
        return AMENIT.get();
    }

    public StringProperty AMENITProperty() {
        return AMENIT;
    }

    public void setAMENIT(String AMENIT) {
        this.AMENIT.set(AMENIT);
    }

    public String getEXLLENT() {
        return EXLLENT.get();
    }

    public StringProperty EXLLENTProperty() {
        return EXLLENT;
    }

    public void setEXLLENT(String EXLLENT) {
        this.EXLLENT.set(EXLLENT);
    }

    public String getGOOD() {
        return GOOD.get();
    }

    public StringProperty GOODProperty() {
        return GOOD;
    }

    public void setGOOD(String GOOD) {
        this.GOOD.set(GOOD);
    }

    public String getFAIR() {
        return FAIR.get();
    }

    public StringProperty FAIRProperty() {
        return FAIR;
    }

    public void setFAIR(String FAIR) {
        this.FAIR.set(FAIR);
    }

    public String getPOOR() {
        return POOR.get();
    }

    public StringProperty POORProperty() {
        return POOR;
    }

    public void setPOOR(String POOR) {
        this.POOR.set(POOR);
    }

    public String getROAD() {
        return ROAD.get();
    }

    public StringProperty ROADProperty() {
        return ROAD;
    }

    public void setROAD(String ROAD) {
        this.ROAD.set(ROAD);
    }

    public String getFENCE() {
        return FENCE.get();
    }

    public StringProperty FENCEProperty() {
        return FENCE;
    }

    public void setFENCE(String FENCE) {
        this.FENCE.set(FENCE);
    }

    public String getCOMP() {
        return COMP.get();
    }

    public StringProperty COMPProperty() {
        return COMP;
    }

    public void setCOMP(String COMP) {
        this.COMP.set(COMP);
    }

    public String getOBNONE() {
        return OBNONE.get();
    }

    public StringProperty OBNONEProperty() {
        return OBNONE;
    }

    public void setOBNONE(String OBNONE) {
        this.OBNONE.set(OBNONE);
    }

    public String getOB1() {
        return OB1.get();
    }

    public StringProperty OB1Property() {
        return OB1;
    }

    public void setOB1(String OB1) {
        this.OB1.set(OB1);
    }

    public String getOB1HYPERLINK() {
        return OB1HYPERLINK.get();
    }

    public StringProperty OB1HYPERLINKProperty() {
        return OB1HYPERLINK;
    }

    public void setOB1HYPERLINK(String OB1HYPERLINK) {
        this.OB1HYPERLINK.set(OB1HYPERLINK);
    }

    public String getOB2() {
        return OB2.get();
    }

    public StringProperty OB2Property() {
        return OB2;
    }

    public void setOB2(String OB2) {
        this.OB2.set(OB2);
    }

    public String getOB2HYPERLINK() {
        return OB2HYPERLINK.get();
    }

    public StringProperty OB2HYPERLINKProperty() {
        return OB2HYPERLINK;
    }

    public void setOB2HYPERLINK(String OB2HYPERLINK) {
        this.OB2HYPERLINK.set(OB2HYPERLINK);
    }

    public String getOB3() {
        return OB3.get();
    }

    public StringProperty OB3Property() {
        return OB3;
    }

    public void setOB3(String OB3) {
        this.OB3.set(OB3);
    }

    public String getOB3HYPERLINK() {
        return OB3HYPERLINK.get();
    }

    public StringProperty OB3HYPERLINKProperty() {
        return OB3HYPERLINK;
    }

    public void setOB3HYPERLINK(String OB3HYPERLINK) {
        this.OB3HYPERLINK.set(OB3HYPERLINK);
    }

    public String getOB4() {
        return OB4.get();
    }

    public StringProperty OB4Property() {
        return OB4;
    }

    public void setOB4(String OB4) {
        this.OB4.set(OB4);
    }

    public String getOB4HYPERLINK() {
        return OB4HYPERLINK.get();
    }

    public StringProperty OB4HYPERLINKProperty() {
        return OB4HYPERLINK;
    }

    public void setOB4HYPERLINK(String OB4HYPERLINK) {
        this.OB4HYPERLINK.set(OB4HYPERLINK);
    }

    public String getSKETCH() {
        return SKETCH.get();
    }

    public StringProperty SKETCHProperty() {
        return SKETCH;
    }

    public void setSKETCH(String SKETCH) {
        this.SKETCH.set(SKETCH);
    }

    public String getBULDHPHOTO1() {
        return BULDHPHOTO1.get();
    }

    public StringProperty BULDHPHOTO1Property() {
        return BULDHPHOTO1;
    }

    public void setBULDHPHOTO1(String BULDHPHOTO1) {
        this.BULDHPHOTO1.set(BULDHPHOTO1);
    }

    public String getBULDHPHOTO2() {
        return BULDHPHOTO2.get();
    }

    public StringProperty BULDHPHOTO2Property() {
        return BULDHPHOTO2;
    }

    public void setBULDHPHOTO2(String BULDHPHOTO2) {
        this.BULDHPHOTO2.set(BULDHPHOTO2);
    }

    public String getBATHS() {
        return BATHS.get();
    }

    public StringProperty BATHSProperty() {
        return BATHS;
    }

    public void setBATHS(String BATHS) {
        this.BATHS.set(BATHS);
    }

    public String getTOILETS() {
        return TOILETS.get();
    }

    public StringProperty TOILETSProperty() {
        return TOILETS;
    }

    public void setTOILETS(String TOILETS) {
        this.TOILETS.set(TOILETS);
    }

    public String getMLEN() {
        return MLEN.get();
    }

    public StringProperty MLENProperty() {
        return MLEN;
    }

    public void setMLEN(String MLEN) {
        this.MLEN.set(MLEN);
    }

    public String getMWID() {
        return MWID.get();
    }

    public StringProperty MWIDProperty() {
        return MWID;
    }

    public void setMWID(String MWID) {
        this.MWID.set(MWID);
    }

    public String getMAREA() {
        return MAREA.get();
    }

    public StringProperty MAREAProperty() {
        return MAREA;
    }

    public void setMAREA(String MAREA) {
        this.MAREA.set(MAREA);
    }

    public String getMREDFACT() {
        return MREDFACT.get();
    }

    public StringProperty MREDFACTProperty() {
        return MREDFACT;
    }

    public void setMREDFACT(String MREDFACT) {
        this.MREDFACT.set(MREDFACT);
    }

    public String getMCOMPFACT() {
        return MCOMPFACT.get();
    }

    public StringProperty MCOMPFACTProperty() {
        return MCOMPFACT;
    }

    public void setMCOMPFACT(String MCOMPFACT) {
        this.MCOMPFACT.set(MCOMPFACT);
    }

    public String getMREDFACTAREA() {
        return MREDFACTAREA.get();
    }

    public StringProperty MREDFACTAREAProperty() {
        return MREDFACTAREA;
    }

    public void setMREDFACTAREA(String MREDFACTAREA) {
        this.MREDFACTAREA.set(MREDFACTAREA);
    }

    public String getOB1LEN() {
        return OB1LEN.get();
    }

    public StringProperty OB1LENProperty() {
        return OB1LEN;
    }

    public void setOB1LEN(String OB1LEN) {
        this.OB1LEN.set(OB1LEN);
    }

    public String getOB1WID() {
        return OB1WID.get();
    }

    public StringProperty OB1WIDProperty() {
        return OB1WID;
    }

    public void setOB1WID(String OB1WID) {
        this.OB1WID.set(OB1WID);
    }

    public String getOB1AREA() {
        return OB1AREA.get();
    }

    public StringProperty OB1AREAProperty() {
        return OB1AREA;
    }

    public void setOB1AREA(String OB1AREA) {
        this.OB1AREA.set(OB1AREA);
    }

    public String getOB1REDFACT() {
        return OB1REDFACT.get();
    }

    public StringProperty OB1REDFACTProperty() {
        return OB1REDFACT;
    }

    public void setOB1REDFACT(String OB1REDFACT) {
        this.OB1REDFACT.set(OB1REDFACT);
    }

    public String getOB1COMPFACT() {
        return OB1COMPFACT.get();
    }

    public StringProperty OB1COMPFACTProperty() {
        return OB1COMPFACT;
    }

    public void setOB1COMPFACT(String OB1COMPFACT) {
        this.OB1COMPFACT.set(OB1COMPFACT);
    }

    public String getOB1REDFACTAREA() {
        return OB1REDFACTAREA.get();
    }

    public StringProperty OB1REDFACTAREAProperty() {
        return OB1REDFACTAREA;
    }

    public void setOB1REDFACTAREA(String OB1REDFACTAREA) {
        this.OB1REDFACTAREA.set(OB1REDFACTAREA);
    }

    public String getOB2LEN() {
        return OB2LEN.get();
    }

    public StringProperty OB2LENProperty() {
        return OB2LEN;
    }

    public void setOB2LEN(String OB2LEN) {
        this.OB2LEN.set(OB2LEN);
    }

    public String getOB2WID() {
        return OB2WID.get();
    }

    public StringProperty OB2WIDProperty() {
        return OB2WID;
    }

    public void setOB2WID(String OB2WID) {
        this.OB2WID.set(OB2WID);
    }

    public String getOB2AREA() {
        return OB2AREA.get();
    }

    public StringProperty OB2AREAProperty() {
        return OB2AREA;
    }

    public void setOB2AREA(String OB2AREA) {
        this.OB2AREA.set(OB2AREA);
    }

    public String getOB2REDFACT() {
        return OB2REDFACT.get();
    }

    public StringProperty OB2REDFACTProperty() {
        return OB2REDFACT;
    }

    public void setOB2REDFACT(String OB2REDFACT) {
        this.OB2REDFACT.set(OB2REDFACT);
    }

    public String getOB2COMPFACT() {
        return OB2COMPFACT.get();
    }

    public StringProperty OB2COMPFACTProperty() {
        return OB2COMPFACT;
    }

    public void setOB2COMPFACT(String OB2COMPFACT) {
        this.OB2COMPFACT.set(OB2COMPFACT);
    }

    public String getOB2REDFACTAREA() {
        return OB2REDFACTAREA.get();
    }

    public StringProperty OB2REDFACTAREAProperty() {
        return OB2REDFACTAREA;
    }

    public void setOB2REDFACTAREA(String OB2REDFACTAREA) {
        this.OB2REDFACTAREA.set(OB2REDFACTAREA);
    }

    public String getOB3LEN() {
        return OB3LEN.get();
    }

    public StringProperty OB3LENProperty() {
        return OB3LEN;
    }

    public void setOB3LEN(String OB3LEN) {
        this.OB3LEN.set(OB3LEN);
    }

    public String getOB3WID() {
        return OB3WID.get();
    }

    public StringProperty OB3WIDProperty() {
        return OB3WID;
    }

    public void setOB3WID(String OB3WID) {
        this.OB3WID.set(OB3WID);
    }

    public String getOB3AREA() {
        return OB3AREA.get();
    }

    public StringProperty OB3AREAProperty() {
        return OB3AREA;
    }

    public void setOB3AREA(String OB3AREA) {
        this.OB3AREA.set(OB3AREA);
    }

    public String getOB3REDFACT() {
        return OB3REDFACT.get();
    }

    public StringProperty OB3REDFACTProperty() {
        return OB3REDFACT;
    }

    public void setOB3REDFACT(String OB3REDFACT) {
        this.OB3REDFACT.set(OB3REDFACT);
    }

    public String getOB3COMPFACT() {
        return OB3COMPFACT.get();
    }

    public StringProperty OB3COMPFACTProperty() {
        return OB3COMPFACT;
    }

    public void setOB3COMPFACT(String OB3COMPFACT) {
        this.OB3COMPFACT.set(OB3COMPFACT);
    }

    public String getOB3REDFACTAREA() {
        return OB3REDFACTAREA.get();
    }

    public StringProperty OB3REDFACTAREAProperty() {
        return OB3REDFACTAREA;
    }

    public void setOB3REDFACTAREA(String OB3REDFACTAREA) {
        this.OB3REDFACTAREA.set(OB3REDFACTAREA);
    }

    public String getOB4LEN() {
        return OB4LEN.get();
    }

    public StringProperty OB4LENProperty() {
        return OB4LEN;
    }

    public void setOB4LEN(String OB4LEN) {
        this.OB4LEN.set(OB4LEN);
    }

    public String getOB4WID() {
        return OB4WID.get();
    }

    public StringProperty OB4WIDProperty() {
        return OB4WID;
    }

    public void setOB4WID(String OB4WID) {
        this.OB4WID.set(OB4WID);
    }

    public String getOB4AREA() {
        return OB4AREA.get();
    }

    public StringProperty OB4AREAProperty() {
        return OB4AREA;
    }

    public void setOB4AREA(String OB4AREA) {
        this.OB4AREA.set(OB4AREA);
    }

    public String getOB4REDFACT() {
        return OB4REDFACT.get();
    }

    public StringProperty OB4REDFACTProperty() {
        return OB4REDFACT;
    }

    public void setOB4REDFACT(String OB4REDFACT) {
        this.OB4REDFACT.set(OB4REDFACT);
    }

    public String getOB4COMPFACT() {
        return OB4COMPFACT.get();
    }

    public StringProperty OB4COMPFACTProperty() {
        return OB4COMPFACT;
    }

    public void setOB4COMPFACT(String OB4COMPFACT) {
        this.OB4COMPFACT.set(OB4COMPFACT);
    }

    public String getOB4REDFACTAREA() {
        return OB4REDFACTAREA.get();
    }

    public StringProperty OB4REDFACTAREAProperty() {
        return OB4REDFACTAREA;
    }

    public void setOB4REDFACTAREA(String OB4REDFACTAREA) {
        this.OB4REDFACTAREA.set(OB4REDFACTAREA);
    }

    public String getTOTALRFA() {
        return TOTALRFA.get();
    }

    public StringProperty TOTALRFAProperty() {
        return TOTALRFA;
    }

    public void setTOTALRFA(String TOTALRFA) {
        this.TOTALRFA.set(TOTALRFA);
    }

    public String getTOTALRFASQR() {
        return TOTALRFASQR.get();
    }

    public StringProperty TOTALRFASQRProperty() {
        return TOTALRFASQR;
    }

    public void setTOTALRFASQR(String TOTALRFASQR) {
        this.TOTALRFASQR.set(TOTALRFASQR);
    }

    public String getMULTIPLYBTALL() {
        return MULTIPLYBTALL.get();
    }

    public StringProperty MULTIPLYBTALLProperty() {
        return MULTIPLYBTALL;
    }

    public void setMULTIPLYBTALL(String MULTIPLYBTALL) {
        this.MULTIPLYBTALL.set(MULTIPLYBTALL);
    }

    public String getCURRENTREPLACEMENT() {
        return CURRENTREPLACEMENT.get();
    }

    public StringProperty CURRENTREPLACEMENTProperty() {
        return CURRENTREPLACEMENT;
    }

    public void setCURRENTREPLACEMENT(String CURRENTREPLACEMENT) {
        this.CURRENTREPLACEMENT.set(CURRENTREPLACEMENT);
    }

    public String getLESSDEPREC() {
        return LESSDEPREC.get();
    }

    public StringProperty LESSDEPRECProperty() {
        return LESSDEPREC;
    }

    public void setLESSDEPREC(String LESSDEPREC) {
        this.LESSDEPREC.set(LESSDEPREC);
    }

    public String getDEPRECREPLACEMENT() {
        return DEPRECREPLACEMENT.get();
    }

    public StringProperty DEPRECREPLACEMENTProperty() {
        return DEPRECREPLACEMENT;
    }

    public void setDEPRECREPLACEMENT(String DEPRECREPLACEMENT) {
        this.DEPRECREPLACEMENT.set(DEPRECREPLACEMENT);
    }

    public String getINSPECTEDBY() {
        return INSPECTEDBY.get();
    }

    public StringProperty INSPECTEDBYProperty() {
        return INSPECTEDBY;
    }

    public void setINSPECTEDBY(String INSPECTEDBY) {
        this.INSPECTEDBY.set(INSPECTEDBY);
    }

    public String getCHECKEDBY() {
        return CHECKEDBY.get();
    }

    public StringProperty CHECKEDBYProperty() {
        return CHECKEDBY;
    }

    public void setCHECKEDBY(String CHECKEDBY) {
        this.CHECKEDBY.set(CHECKEDBY);
    }

    public String getAPPROVEDBY() {
        return APPROVEDBY.get();
    }

    public StringProperty APPROVEDBYProperty() {
        return APPROVEDBY;
    }

    public void setAPPROVEDBY(String APPROVEDBY) {
        this.APPROVEDBY.set(APPROVEDBY);
    }

    public String getCOMPANYNAME() {
        return COMPANYNAME.get();
    }

    public StringProperty COMPANYNAMEProperty() {
        return COMPANYNAME;
    }

    public void setCOMPANYNAME(String COMPANYNAME) {
        this.COMPANYNAME.set(COMPANYNAME);
    }

    public String getCOMPANYSTAMP() {
        return COMPANYSTAMP.get();
    }

    public StringProperty COMPANYSTAMPProperty() {
        return COMPANYSTAMP;
    }

    public void setCOMPANYSTAMP(String COMPANYSTAMP) {
        this.COMPANYSTAMP.set(COMPANYSTAMP);
    }

    public String getCERTIFIEDDATE() {
        return CERTIFIEDDATE.get();
    }

    public StringProperty CERTIFIEDDATEProperty() {
        return CERTIFIEDDATE;
    }

    public void setCERTIFIEDDATE(String CERTIFIEDDATE) {
        this.CERTIFIEDDATE.set(CERTIFIEDDATE);
    }

    public String getTIN() {
        return TIN.get();
    }

    public StringProperty TINProperty() {
        return TIN;
    }

    public void setTIN(String TIN) {
        this.TIN.set(TIN);
    }
}