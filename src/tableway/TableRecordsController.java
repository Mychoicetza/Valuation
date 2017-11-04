package tableway;

import dbUtil.dbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import superviser.BlockRecords;

import javax.swing.JFrame;

import java.awt.*;
import java.util.*;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Engnoellemar on 10/3/2017.
 */
public  class TableRecordsController  implements Initializable {

    public AnchorPane panee;
    @FXML
    private TextField rr;
    @FXML
    private Button textload;
    @FXML
    private Button nextButton;
    @FXML
    private Button prevButton;
    @FXML
    private TextArea tid;
    @FXML
    private TextArea tyear;
    @FXML
    private TextArea tref;
    @FXML
    private TextArea tward;
    @FXML
    private TextArea tmtaa;
    @FXML
    private TextArea tindivfn;
    @FXML
    private TextArea tindivmn;
    @FXML
    private TextArea tindivln;
    @FXML
    private TextArea transdate;
    @FXML
    private DatePicker transactiondate;
    @FXML
    private DatePicker coyear;
    @FXML
    private CheckBox tenurelease;
    @FXML
    private CheckBox tenureres;
    @FXML
    private CheckBox tenurereslic;
    @FXML
    private CheckBox tenureuntitled;
    @FXML
    private CheckBox soibuyer;
    @FXML
    private CheckBox soinotary;
    @FXML
    private CheckBox soivaluer;
    @FXML
    private CheckBox soigovt;
    @FXML
    private CheckBox soibank;
    @FXML
    private CheckBox soibroker;
    @FXML
    private CheckBox soiother;
    @FXML
    private CheckBox landinsti;
    @FXML
    private CheckBox landcomres;
    @FXML
    private CheckBox landcomm;
    @FXML
    private CheckBox landres;
    @FXML
    private CheckBox landindustrial;
    @FXML
    private CheckBox landother;
    @FXML
    private Button tload;
    @FXML
    private Button text;
    @FXML
    private Button tquit;
    @FXML
    private ImageView tsketchphoto;
    @FXML
    private ImageView tbuildphoto1;
    @FXML
    private ImageView tbuildphoto2;
    @FXML
    private ImageView tinspectedby;
    @FXML
    private ImageView tcheckedby;
    @FXML
    private ImageView tapprovedby;
    @FXML
    private ImageView tcompanystamp;
    @FXML
    Image imgsketch, imgbuild1, imgbuild2, imginspectedby, imgcheckedby, imgapprovedby;

    @FXML
    private TableView<TableRecords> tableblock;
    @FXML
    private TableColumn<TableRecords, String> idcol;
    @FXML
    private TableColumn<TableRecords, String> docrefyearcol;
    @FXML
    private TableColumn<TableRecords, String> docrefobjectnocol;
    @FXML
    private TableColumn<TableRecords, String> docrefpagenocol;
    @FXML
    private TableColumn<TableRecords, String> proprefwardcol;
    @FXML
    private TableColumn<TableRecords, String> proprefmtaacol;
    @FXML
    private TableColumn<TableRecords, String> proprefrateblockcol;
    @FXML
    private TableColumn<TableRecords, String> proprefobjectnocol;
    @FXML
    private TableColumn<TableRecords, String> proprefbuildingnocol;
    @FXML
    private TableColumn<TableRecords, String> nonrateablecol;
    @FXML
    private TableColumn<TableRecords, String> proplocstreetcol;
    @FXML
    private TableColumn<TableRecords, String> proplocplotnocol;
    @FXML
    private TableColumn<TableRecords, String> proplocsurveyblockcol;
    @FXML
    private TableColumn<TableRecords, String> proplocexistingrefnocol;
    @FXML
    private TableColumn<TableRecords, String> proplocmapreferenccol;
    @FXML
    private TableColumn<TableRecords, String> proplochyperlinkcol;
    @FXML
    private TableColumn<TableRecords, String> individualcol;
    @FXML
    private TableColumn<TableRecords, String> individualfirstnamecol;
    @FXML
    private TableColumn<TableRecords, String> individualmiddlenamecol;
    @FXML
    private TableColumn<TableRecords, String> individuallastnamecol;
    @FXML
    private TableColumn<TableRecords, String> individualphone1col;
    @FXML
    private TableColumn<TableRecords, String> individualphone2col;
    @FXML
    private TableColumn<TableRecords, String> legalentitycol;
    @FXML
    private TableColumn<TableRecords, String> legalentityfullcompanynamecol;
    @FXML
    private TableColumn<TableRecords, String> legalentityphone1col;
    @FXML
    private TableColumn<TableRecords, String> legalentityphone2col;
    @FXML
    private TableColumn<TableRecords, String> ownerinfofirstnamecol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfomiddlenamecol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfolastnamecol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfophone1col;
    @FXML
    private TableColumn<TableRecords, String> ownerinfophone2col;
    @FXML
    private TableColumn<TableRecords, String> ownerinfostreetcol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfoplotnocol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfopoboxcol;
    @FXML
    private TableColumn<TableRecords, String> ownerinforegioncol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfodistrictcol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfowardcol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfomtaacol;
    @FXML
    private TableColumn<TableRecords, String> ownerinfoemailcol;
    @FXML
    private TableColumn<TableRecords, String> tenurecol;
    @FXML
    private TableColumn<TableRecords, String> landusecol;
    @FXML
    private TableColumn<TableRecords, String> actualtransactioncol;
    @FXML
    private TableColumn<TableRecords, String> transactiondatecol;
    @FXML
    private TableColumn<TableRecords, String> soicol;
    @FXML
    private TableColumn<TableRecords, String> noofstoriescol;
    @FXML
    private TableColumn<TableRecords, String> completecol;
    @FXML
    private TableColumn<TableRecords, String> comindcol;
    @FXML
    private TableColumn<TableRecords, String> insticol;
    @FXML
    private TableColumn<TableRecords, String> rescol;
    @FXML
    private TableColumn<TableRecords, String> coyearcol;
    @FXML
    private TableColumn<TableRecords, String> recoyearcol;
    @FXML
    private TableColumn<TableRecords, String> roofcol;
    @FXML
    private TableColumn<TableRecords, String> extwallcol;
    @FXML
    private TableColumn<TableRecords, String> extfincol;
    @FXML
    private TableColumn<TableRecords, String> windowscol;
    @FXML
    private TableColumn<TableRecords, String> doorscol;
    @FXML
    private TableColumn<TableRecords, String> floorcol;
    @FXML
    private TableColumn<TableRecords, String> ceilingcol;
    @FXML
    private TableColumn<TableRecords, String> nofloorcol;
    @FXML
    private TableColumn<TableRecords, String> noroomcol;
    @FXML
    private TableColumn<TableRecords, String> watercol;
    @FXML
    private TableColumn<TableRecords, String> drainagecol;
    @FXML
    private TableColumn<TableRecords, String> electricitycol;
    @FXML
    private TableColumn<TableRecords, String> hqcol;
    @FXML
    private TableColumn<TableRecords, String> gqcol;
    @FXML
    private TableColumn<TableRecords, String> amenitcol;
    @FXML
    private TableColumn<TableRecords, String> exllentcol;
    @FXML
    private TableColumn<TableRecords, String> goodcol;
    @FXML
    private TableColumn<TableRecords, String> faircol;
    @FXML
    private TableColumn<TableRecords, String> poorcol;
    @FXML
    private TableColumn<TableRecords, String> roadcol;
    @FXML
    private TableColumn<TableRecords, String> fencecol;
    @FXML
    private TableColumn<TableRecords, String> compcol;
    @FXML
    private TableColumn<TableRecords, String> obnonecol;
    @FXML
    private TableColumn<TableRecords, String> ob1col;
    @FXML
    private TableColumn<TableRecords, String> obno1hyperlinkcol;
    @FXML
    private TableColumn<TableRecords, String> ob2col;
    @FXML
    private TableColumn<TableRecords, String> obno2hyperlinkcol;
    @FXML
    private TableColumn<TableRecords, String> ob3col;
    @FXML
    private TableColumn<TableRecords, String> obno3hyperlinkcol;
    @FXML
    private TableColumn<TableRecords, String> ob4col;
    @FXML
    private TableColumn<TableRecords, String> obno4hyperlinkcol;
    @FXML
    private TableColumn<TableRecords, String> sketchphotocol;
    @FXML
    private TableColumn<TableRecords, String> buildphoto1col;
    @FXML
    private TableColumn<TableRecords, String> buildphoto2col;
    @FXML
    private TableColumn<TableRecords, String> noofbathscol;
    @FXML
    private TableColumn<TableRecords, String> nooftoiletscol;
    @FXML
    private TableColumn<TableRecords, String> mblencol;
    @FXML
    private TableColumn<TableRecords, String> mbwidcol;
    @FXML
    private TableColumn<TableRecords, String> mbareacol;
    @FXML
    private TableColumn<TableRecords, String> mbredfactcol;
    @FXML
    private TableColumn<TableRecords, String> mbcompfactcol;
    @FXML
    private TableColumn<TableRecords, String> mbredfactareacol;
    @FXML
    private TableColumn<TableRecords, String> ob1lencol;
    @FXML
    private TableColumn<TableRecords, String> ob1widcol;
    @FXML
    private TableColumn<TableRecords, String> ob1areacol;
    @FXML
    private TableColumn<TableRecords, String> ob1redfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob1compfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob1redfactareacol;
    @FXML
    private TableColumn<TableRecords, String> ob2lencol;
    @FXML
    private TableColumn<TableRecords, String> ob2widcol;
    @FXML
    private TableColumn<TableRecords, String> ob2areacol;
    @FXML
    private TableColumn<TableRecords, String> ob2redfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob2compfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob2redfactareacol;
    @FXML
    private TableColumn<TableRecords, String> ob3lencol;
    @FXML
    private TableColumn<TableRecords, String> ob3widcol;
    @FXML
    private TableColumn<TableRecords, String> ob3areacol;
    @FXML
    private TableColumn<TableRecords, String> ob3redfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob3compfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob3redfactareacol;
    @FXML
    private TableColumn<TableRecords, String> ob4lencol;
    @FXML
    private TableColumn<TableRecords, String> ob4widcol;
    @FXML
    private TableColumn<TableRecords, String> ob4areacol;
    @FXML
    private TableColumn<TableRecords, String> ob4redfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob4compfactcol;
    @FXML
    private TableColumn<TableRecords, String> ob4redfactareacol;
    @FXML
    private TableColumn<TableRecords, String> totalrfacol;
    @FXML
    private TableColumn<TableRecords, String> totalrfasqrcol;
    @FXML
    private TableColumn<TableRecords, String> multiplybyallcol;
    @FXML
    private TableColumn<TableRecords, String> currentreplacementcostcol;
    @FXML
    private TableColumn<TableRecords, String> lessdepreccol;
    @FXML
    private TableColumn<TableRecords, String> deprecreplacementcostcol;
    @FXML
    private TableColumn<TableRecords, String> inspectedbycol;
    @FXML
    private TableColumn<TableRecords, String> checkedbycol;
    @FXML
    private TableColumn<TableRecords, String> approvedbycol;
    @FXML
    private TableColumn<TableRecords, String> companynamecol;
    @FXML
    private TableColumn<TableRecords, String> companystampcol;
    @FXML
    private TableColumn<TableRecords, String> certifieddatecol;
    @FXML
    private ObservableList<TableRecords> tabledata;
    int count = 0;
    TableRecords tableRecords;
    private dbConnection dc;
    @FXML
    private Button deletebut;


    @Override
    public void initialize(URL location, ResourceBundle rb) {
        this.dc = new dbConnection();

    }




    @FXML
    private void loadBlockRecords(ActionEvent event) {


        try {

            Connection conn = dbConnection.getConnection();
            this.tabledata = FXCollections.observableArrayList();


            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM block");
            while (rs.next()) {

                this.tabledata.add(new TableRecords(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25), rs.getString(26), rs.getString(27), rs.getString(28), rs.getString(29), rs.getString(30), rs.getString(31), rs.getString(32), rs.getString(33), rs.getString(34), rs.getString(35), rs.getString(36), rs.getString(37), rs.getString(38), rs.getString(39), rs.getString(40), rs.getString(41), rs.getString(42), rs.getString(43), rs.getString(44), rs.getString(45), rs.getString(46), rs.getString(47), rs.getString(48), rs.getString(49), rs.getString(50), rs.getString(51), rs.getString(52), rs.getString(53), rs.getString(54), rs.getString(55), rs.getString(56), rs.getString(57), rs.getString(58), rs.getString(59), rs.getString(60), rs.getString(61), rs.getString(62), rs.getString(63), rs.getString(64), rs.getString(65), rs.getString(66), rs.getString(67), rs.getString(68), rs.getString(69), rs.getString(70), rs.getString(71), rs.getString(72), rs.getString(73), rs.getString(74), rs.getString(75), rs.getString(76), rs.getString(77), rs.getString(78), rs.getString(79), rs.getString(80), rs.getString(81), rs.getString(82), rs.getString(83), rs.getString(84), rs.getString(85), rs.getString(86), rs.getString(87), rs.getString(88), rs.getString(89), rs.getString(90), rs.getString(91), rs.getString(92), rs.getString(93), rs.getString(94), rs.getString(95), rs.getString(96), rs.getString(97), rs.getString(98), rs.getString(99), rs.getString(100), rs.getString(101), rs.getString(102), rs.getString(103), rs.getString(104), rs.getString(105), rs.getString(106), rs.getString(107), rs.getString(108), rs.getString(109), rs.getString(110), rs.getString(111), rs.getString(112), rs.getString(113), rs.getString(114), rs.getString(115), rs.getString(116), rs.getString(117), rs.getString(118), rs.getString(119), rs.getString(120), rs.getString(121), rs.getString(122), rs.getString(123), rs.getString(124), rs.getString(125), rs.getString(126), rs.getString(127), rs.getString(128), rs.getString(129), rs.getString(130)));

            }
        } catch (SQLException e) {
            System.err.println("Error occured " + e);
        }
        this.idcol.setCellValueFactory(new PropertyValueFactory("ID"));
        this.docrefyearcol.setCellValueFactory(new PropertyValueFactory("YEAR"));
        this.docrefobjectnocol.setCellValueFactory(new PropertyValueFactory("OBJECTNO"));
        this.docrefpagenocol.setCellValueFactory(new PropertyValueFactory("PAGENO"));
        this.proprefwardcol.setCellValueFactory(new PropertyValueFactory("PWARD"));
        this.proprefmtaacol.setCellValueFactory(new PropertyValueFactory("PMTAA"));
        this.proprefrateblockcol.setCellValueFactory(new PropertyValueFactory("PRATEBLOCK"));
        this.proprefobjectnocol.setCellValueFactory(new PropertyValueFactory("POBJECT"));
        this.proprefbuildingnocol.setCellValueFactory(new PropertyValueFactory("PBUILDINGNO"));
        this.nonrateablecol.setCellValueFactory(new PropertyValueFactory("NonRateable"));
        this.proplocstreetcol.setCellValueFactory(new PropertyValueFactory("PLSTREET"));
        this.proplocplotnocol.setCellValueFactory(new PropertyValueFactory("PLPLOTNO"));
        this.proplocsurveyblockcol.setCellValueFactory(new PropertyValueFactory("PLSURVEYBLOCK"));
        this.proplocexistingrefnocol.setCellValueFactory(new PropertyValueFactory("PLEXISTINGPROP"));
        this.proplocmapreferenccol.setCellValueFactory(new PropertyValueFactory("PLMAPREF"));
        this.proplochyperlinkcol.setCellValueFactory(new PropertyValueFactory("PLHYPERLINK"));
        this.individualcol.setCellValueFactory(new PropertyValueFactory("INDIVIDUAL"));
        this.individualfirstnamecol.setCellValueFactory(new PropertyValueFactory("INDIVFN"));
        this.individualmiddlenamecol.setCellValueFactory(new PropertyValueFactory("INDIVMN"));
        this.individuallastnamecol.setCellValueFactory(new PropertyValueFactory("INDIVLN"));
        this.individualphone1col.setCellValueFactory(new PropertyValueFactory("INDIVPH1"));
        this.individualphone2col.setCellValueFactory(new PropertyValueFactory("INDIVPH2"));
        this.legalentitycol.setCellValueFactory(new PropertyValueFactory("LegalEntity"));
        this.legalentityfullcompanynamecol.setCellValueFactory(new PropertyValueFactory("LEGALFCN"));
        this.legalentityphone1col.setCellValueFactory(new PropertyValueFactory("LEGALPH1"));
        this.legalentityphone2col.setCellValueFactory(new PropertyValueFactory("LEGALPH2"));
        this.ownerinfofirstnamecol.setCellValueFactory(new PropertyValueFactory("OWNERFN"));
        this.ownerinfomiddlenamecol.setCellValueFactory(new PropertyValueFactory("OWNERMN"));
        this.ownerinfolastnamecol.setCellValueFactory(new PropertyValueFactory("OWNERLN"));
        this.ownerinfophone1col.setCellValueFactory(new PropertyValueFactory("OWNERPH1"));
        this.ownerinfophone2col.setCellValueFactory(new PropertyValueFactory("OWNERPH2"));
        this.ownerinfostreetcol.setCellValueFactory(new PropertyValueFactory("OWNERPSTREET"));
        this.ownerinfoplotnocol.setCellValueFactory(new PropertyValueFactory("OWNERPLOTNO"));
        this.ownerinfopoboxcol.setCellValueFactory(new PropertyValueFactory("OWNERPOBOX"));
        this.ownerinforegioncol.setCellValueFactory(new PropertyValueFactory("OWNERREGION"));
        this.ownerinfodistrictcol.setCellValueFactory(new PropertyValueFactory("OWNERDISTRICT"));
        this.ownerinfowardcol.setCellValueFactory(new PropertyValueFactory("OWNERWARD"));
        this.ownerinfomtaacol.setCellValueFactory(new PropertyValueFactory("OWNERMTAA"));
        this.ownerinfoemailcol.setCellValueFactory(new PropertyValueFactory("OWNEREMAIL"));
        this.tenurecol.setCellValueFactory(new PropertyValueFactory("TENURE"));
        this.landusecol.setCellValueFactory(new PropertyValueFactory("LAND"));
        this.actualtransactioncol.setCellValueFactory(new PropertyValueFactory("ACTUALTRANSACTION"));
        this.transactiondatecol.setCellValueFactory(new PropertyValueFactory("TRANSACTIONDATE"));
        this.soicol.setCellValueFactory(new PropertyValueFactory("SOI"));
        this.noofstoriescol.setCellValueFactory(new PropertyValueFactory("NOSTORIES"));
        this.completecol.setCellValueFactory(new PropertyValueFactory("COMPLETE"));
        this.comindcol.setCellValueFactory(new PropertyValueFactory("COMIND"));
        this.insticol.setCellValueFactory(new PropertyValueFactory("INSTI"));
        this.rescol.setCellValueFactory(new PropertyValueFactory("RES"));
        this.coyearcol.setCellValueFactory(new PropertyValueFactory("COYEAR"));
        this.recoyearcol.setCellValueFactory(new PropertyValueFactory("RECOYEAR"));
        this.roofcol.setCellValueFactory(new PropertyValueFactory("ROOF"));
        this.extwallcol.setCellValueFactory(new PropertyValueFactory("EXTWALL"));
        this.extfincol.setCellValueFactory(new PropertyValueFactory("EXTFIN"));
        this.windowscol.setCellValueFactory(new PropertyValueFactory("WINDOWS"));
        this.doorscol.setCellValueFactory(new PropertyValueFactory("DOORS"));
        this.floorcol.setCellValueFactory(new PropertyValueFactory("FLOOR"));
        this.ceilingcol.setCellValueFactory(new PropertyValueFactory("CEILING"));
        this.nofloorcol.setCellValueFactory(new PropertyValueFactory("NOFLOOR"));
        this.noroomcol.setCellValueFactory(new PropertyValueFactory("NOROOM"));
        this.watercol.setCellValueFactory(new PropertyValueFactory("WATER"));
        this.drainagecol.setCellValueFactory(new PropertyValueFactory("DRAINAGE"));
        this.electricitycol.setCellValueFactory(new PropertyValueFactory("ELECTRICITY"));
        this.hqcol.setCellValueFactory(new PropertyValueFactory("HQ"));
        this.gqcol.setCellValueFactory(new PropertyValueFactory("GQ"));
        this.amenitcol.setCellValueFactory(new PropertyValueFactory("AMENIT"));
        this.exllentcol.setCellValueFactory(new PropertyValueFactory("EXLLENT"));
        this.goodcol.setCellValueFactory(new PropertyValueFactory("GOOD"));
        this.faircol.setCellValueFactory(new PropertyValueFactory("FAIR"));
        this.poorcol.setCellValueFactory(new PropertyValueFactory("POOR"));
        this.roadcol.setCellValueFactory(new PropertyValueFactory("ROAD"));
        this.fencecol.setCellValueFactory(new PropertyValueFactory("FENCE"));
        this.compcol.setCellValueFactory(new PropertyValueFactory("COMP"));
        this.obnonecol.setCellValueFactory(new PropertyValueFactory("OBNONE"));
        this.ob1col.setCellValueFactory(new PropertyValueFactory("OB1"));
        this.obno1hyperlinkcol.setCellValueFactory(new PropertyValueFactory("OB1HYPERLINK"));
        this.ob2col.setCellValueFactory(new PropertyValueFactory("OB2"));
        this.obno2hyperlinkcol.setCellValueFactory(new PropertyValueFactory("OB2HYPERLINK"));
        this.ob3col.setCellValueFactory(new PropertyValueFactory("0B3"));
        this.obno3hyperlinkcol.setCellValueFactory(new PropertyValueFactory("OB3HYPERLINK"));
        this.ob4col.setCellValueFactory(new PropertyValueFactory("OB4"));
        this.obno4hyperlinkcol.setCellValueFactory(new PropertyValueFactory("OB4HYPERLINK"));
        this.noofbathscol.setCellValueFactory(new PropertyValueFactory("BATHS"));
        this.nooftoiletscol.setCellValueFactory(new PropertyValueFactory("TOILETS"));
        this.mblencol.setCellValueFactory(new PropertyValueFactory("MLEN"));
        this.mbwidcol.setCellValueFactory(new PropertyValueFactory("MWID"));
        this.mbareacol.setCellValueFactory(new PropertyValueFactory("MAREA"));
        this.mbredfactcol.setCellValueFactory(new PropertyValueFactory("MREDFACT"));
        this.mbcompfactcol.setCellValueFactory(new PropertyValueFactory("MCOMPFACT"));
        this.mbredfactareacol.setCellValueFactory(new PropertyValueFactory("MREDFACTAREA"));
        this.ob1lencol.setCellValueFactory(new PropertyValueFactory("OB1LEN"));
        this.ob1widcol.setCellValueFactory(new PropertyValueFactory("OB1WID"));
        this.ob1areacol.setCellValueFactory(new PropertyValueFactory("OB1AREA"));
        this.ob1redfactcol.setCellValueFactory(new PropertyValueFactory("OB1REDFACT"));
        this.ob1compfactcol.setCellValueFactory(new PropertyValueFactory("OB1COMPFACT"));
        this.ob1redfactareacol.setCellValueFactory(new PropertyValueFactory("OB1REDFACTAREA"));
        this.ob2lencol.setCellValueFactory(new PropertyValueFactory("OB2LEN"));
        this.ob2widcol.setCellValueFactory(new PropertyValueFactory("OB2WID"));
        this.ob2areacol.setCellValueFactory(new PropertyValueFactory("OB2AREA"));
        this.ob2redfactcol.setCellValueFactory(new PropertyValueFactory("OB2REDFACT"));
        this.ob2compfactcol.setCellValueFactory(new PropertyValueFactory("OB2COMPFACT"));
        this.ob2redfactareacol.setCellValueFactory(new PropertyValueFactory("OB2REDFACTAREA"));
        this.ob3lencol.setCellValueFactory(new PropertyValueFactory("OB3LEN"));
        this.ob3widcol.setCellValueFactory(new PropertyValueFactory("OB3WID"));
        this.ob3areacol.setCellValueFactory(new PropertyValueFactory("OB3AREA"));
        this.ob3redfactcol.setCellValueFactory(new PropertyValueFactory("OB3REDFACT"));
        this.ob3compfactcol.setCellValueFactory(new PropertyValueFactory("OB3COMPFACT"));
        this.ob3redfactareacol.setCellValueFactory(new PropertyValueFactory("OB3REDFACTAREA"));
        this.ob4lencol.setCellValueFactory(new PropertyValueFactory("OB4LEN"));
        this.ob4widcol.setCellValueFactory(new PropertyValueFactory("OB4WID"));
        this.ob4areacol.setCellValueFactory(new PropertyValueFactory("OB4AREA"));
        this.ob4redfactcol.setCellValueFactory(new PropertyValueFactory("OB4REDFACT"));
        this.ob4compfactcol.setCellValueFactory(new PropertyValueFactory("OB4COMPFACT"));
        this.ob4redfactareacol.setCellValueFactory(new PropertyValueFactory("OB4REDFACTAREA"));
        this.totalrfacol.setCellValueFactory(new PropertyValueFactory("TOTALRFA"));
        this.totalrfasqrcol.setCellValueFactory(new PropertyValueFactory("TOTALRFASQR"));
        this.multiplybyallcol.setCellValueFactory(new PropertyValueFactory("MULTIPLYBTALL"));
        this.currentreplacementcostcol.setCellValueFactory(new PropertyValueFactory("CURRENTREPLACEMENT"));
        this.lessdepreccol.setCellValueFactory(new PropertyValueFactory("LESSDEPREC"));
        this.deprecreplacementcostcol.setCellValueFactory(new PropertyValueFactory("DEPRECREPLACEMENT"));
        this.inspectedbycol.setCellValueFactory(new PropertyValueFactory("INSPECTEDBY"));
        this.checkedbycol.setCellValueFactory(new PropertyValueFactory("CHECKEDBY"));
        this.approvedbycol.setCellValueFactory(new PropertyValueFactory("APPROVEDBY"));
        this.companynamecol.setCellValueFactory(new PropertyValueFactory("COMPANYNAME"));
        this.certifieddatecol.setCellValueFactory(new PropertyValueFactory("CERTIFIEDDATE"));


        tableblock.getColumnResizePolicy();
        tableblock.setOnMouseClicked(e -> {
            try {
                TableRecords tableRecords = (TableRecords) tableblock.getSelectionModel().getSelectedItem();

                String query = "SELECT * FROM block where OWNERFN = ? ";
                Connection conn = dbConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, tableRecords.getOWNERFN());
                ResultSet resultSet = pst.executeQuery();

                while (resultSet.next()) {
                    this.tid.setText(resultSet.getString(1));
                    this.tyear.setText(resultSet.getString(2));
                    this.tref.setText(resultSet.getString(3));
                    this.tward.setText(resultSet.getString(5));
                    this.tmtaa.setText(resultSet.getString(6));
                    this.tindivfn.setText(resultSet.getString(18));
                    this.tindivmn.setText(resultSet.getString(19));
                    this.tindivln.setText(resultSet.getString(20));
                    this.transdate.setText(resultSet.getString(43));
                    ((TextField) transactiondate.getEditor()).setText(resultSet.getString(43));

                    Image imgs = new Image(resultSet.getBinaryStream(83));
                    tsketchphoto.setImage(imgs);


                    Image imgb = new Image(resultSet.getBinaryStream(84));
                    tbuildphoto1.setImage(imgb);

                    Image imgc = new Image(resultSet.getBinaryStream(85));
                    tbuildphoto2.setImage(imgc);

                    //cbtenure
                    if (resultSet.getString(40) != null) {
                        tenurelease.setSelected(false);
                        tenureres.setSelected(false);
                        tenurereslic.setSelected(false);
                        tenureuntitled.setSelected(false);
                        System.out.println(resultSet.getString(40));

                        String tenureString = resultSet.getString(40).replace("[", "").replace("]", "");
                        System.out.println(tenureString);

                        List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                        System.out.println(tenuList);
                        for (String tlist : tenuList) {
                            switch (tlist) {

                                case "Untitled":
                                    tenureuntitled.setSelected(true);
                                    break;
                                case "Res/Licensee":
                                    tenurereslic.setSelected(true);
                                    break;
                                case "Res/Occupier":
                                    tenureres.setSelected(true);
                                    break;
                                case "Leasehold":
                                    tenurelease.setSelected(true);
                                    break;
                                default:
                                    tenurelease.setSelected(false);
                                    tenureres.setSelected(false);
                                    tenurereslic.setSelected(false);
                                    tenureuntitled.setSelected(false);
                            }
                        }
                    } else {
                        tenurelease.setSelected(false);
                        tenureres.setSelected(false);
                        tenurereslic.setSelected(false);
                        tenureuntitled.setSelected(false);
                    }

                    //cbland
                    if (resultSet.getString(41) != null) {
                        landcomm.setSelected(false);
                        landcomres.setSelected(false);
                        landindustrial.setSelected(false);
                        landinsti.setSelected(false);
                        landother.setSelected(false);
                        landres.setSelected(false);
                        System.out.println(resultSet.getString(41));

                        String landString = resultSet.getString(41).replace("[", "").replace("]", "");
                        System.out.println(landString);

                        List<String> landList = Arrays.asList(landString.split("\\s*,\\s*"));
                        System.out.println(landList);
                        for (String llist : landList) {
                            switch (llist) {

                                case "Residential":
                                    landres.setSelected(true);
                                    break;
                                case "Other":
                                    landother.setSelected(true);
                                    break;
                                case "Institutional":
                                    landinsti.setSelected(true);
                                    break;
                                case "Industrial":
                                    landindustrial.setSelected(true);
                                    break;
                                case "Comm/Residential":
                                    landcomres.setSelected(true);
                                    break;
                                case "Commercial":
                                    landcomm.setSelected(true);
                                    break;
                                default:
                                    landcomm.setSelected(false);
                                    landcomres.setSelected(false);
                                    landindustrial.setSelected(false);
                                    landinsti.setSelected(false);
                                    landother.setSelected(false);
                                    landres.setSelected(false);
                            }
                        }
                    } else {
                        landcomm.setSelected(false);
                        landcomres.setSelected(false);
                        landindustrial.setSelected(false);
                        landinsti.setSelected(false);
                        landother.setSelected(false);
                        landres.setSelected(false);
                    }

                    //cbsoi
                    if (resultSet.getString(44) != null) {
                        soibank.setSelected(false);
                        soibroker.setSelected(false);
                        soibuyer.setSelected(false);
                        soigovt.setSelected(false);
                        soinotary.setSelected(false);
                        soiother.setSelected(false);
                        soivaluer.setSelected(false);
                        System.out.println(resultSet.getString(44));

                        String soiString = resultSet.getString(44).replace("[", "").replace("]", "");
                        System.out.println(soiString);

                        List<String> soiList = Arrays.asList(soiString.split("\\s*,\\s*"));
                        System.out.println(soiList);
                        for (String slist : soiList) {
                            switch (slist) {

                                case "Valuer":
                                    soivaluer.setSelected(true);
                                    break;
                                case "Other":
                                    soiother.setSelected(true);
                                    break;
                                case "Notary":
                                    soinotary.setSelected(true);
                                    break;
                                case "Gov't Institutional":
                                    soigovt.setSelected(true);
                                    break;
                                case "Buyer/Seller":
                                    soibuyer.setSelected(true);
                                    break;
                                case "Property Broker":
                                    soibroker.setSelected(true);
                                    break;
                                case "Bank":
                                    soibank.setSelected(true);
                                    break;
                                default:
                                    soibank.setSelected(false);
                                    soibroker.setSelected(false);
                                    soibuyer.setSelected(false);
                                    soigovt.setSelected(false);
                                    soinotary.setSelected(false);
                                    soiother.setSelected(false);
                                    soivaluer.setSelected(false);
                            }
                        }
                    } else {
                        soibank.setSelected(false);
                        soibroker.setSelected(false);
                        soibuyer.setSelected(false);
                        soigovt.setSelected(false);
                        soinotary.setSelected(false);
                        soiother.setSelected(false);
                        soivaluer.setSelected(false);
                    }

                }


            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });


        tableblock.setOnKeyReleased(e ->{
            if (e.getCode() == KeyCode.UP || e.getCode() == KeyCode.DOWN){
                try {
                    TableRecords tableRecords = (TableRecords) tableblock.getSelectionModel().getSelectedItem();

                    String query = "SELECT * FROM block where ID = ? ";
                    Connection conn = dbConnection.getConnection();
                    PreparedStatement pst = conn.prepareStatement(query);
                    pst.setString(1, tableRecords.getID());
                    ResultSet resultSet = pst.executeQuery();

                    while (resultSet.next()) {
                        this.tid.setText(resultSet.getString(1));
                        this.tyear.setText(resultSet.getString(2));
                        this.tref.setText(resultSet.getString(3));
                        this.tward.setText(resultSet.getString(5));
                        this.tmtaa.setText(resultSet.getString(6));
                        this.tindivfn.setText(resultSet.getString(18));
                        this.tindivmn.setText(resultSet.getString(19));
                        this.tindivln.setText(resultSet.getString(20));
                        this.transdate.setText(resultSet.getString(43));
                        ((TextField) transactiondate.getEditor()).setText(resultSet.getString(43));

                        //cbtenure
                        if (resultSet.getString(40) != null) {
                            tenurelease.setSelected(false);
                            tenureres.setSelected(false);
                            tenurereslic.setSelected(false);
                            tenureuntitled.setSelected(false);
                            System.out.println(resultSet.getString(40));

                            String tenureString = resultSet.getString(40).replace("[", "").replace("]", "");
                            System.out.println(tenureString);

                            List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                            System.out.println(tenuList);
                            for (String tlist : tenuList) {
                                switch (tlist) {

                                    case "Untitled":
                                        tenureuntitled.setSelected(true);
                                        break;
                                    case "Res/Licensee":
                                        tenurereslic.setSelected(true);
                                        break;
                                    case "Res/Occupier":
                                        tenureres.setSelected(true);
                                        break;
                                    case "Leasehold":
                                        tenurelease.setSelected(true);
                                        break;
                                    default:
                                        tenurelease.setSelected(false);
                                        tenureres.setSelected(false);
                                        tenurereslic.setSelected(false);
                                        tenureuntitled.setSelected(false);
                                }
                            }
                        } else {
                            tenurelease.setSelected(false);
                            tenureres.setSelected(false);
                            tenurereslic.setSelected(false);
                            tenureuntitled.setSelected(false);
                        }

                        //cbland
                        if (resultSet.getString(41) != null) {
                            landcomm.setSelected(false);
                            landcomres.setSelected(false);
                            landindustrial.setSelected(false);
                            landinsti.setSelected(false);
                            landother.setSelected(false);
                            landres.setSelected(false);
                            System.out.println(resultSet.getString(41));

                            String landString = resultSet.getString(41).replace("[", "").replace("]", "");
                            System.out.println(landString);

                            List<String> landList = Arrays.asList(landString.split("\\s*,\\s*"));
                            System.out.println(landList);
                            for (String llist : landList) {
                                switch (llist) {

                                    case "Residential":
                                        landres.setSelected(true);
                                        break;
                                    case "Other":
                                        landother.setSelected(true);
                                        break;
                                    case "Institutional":
                                        landinsti.setSelected(true);
                                        break;
                                    case "Industrial":
                                        landindustrial.setSelected(true);
                                        break;
                                    case "Comm/Residential":
                                        landcomres.setSelected(true);
                                        break;
                                    case "Commercial":
                                        landcomm.setSelected(true);
                                        break;
                                    default:
                                        landcomm.setSelected(false);
                                        landcomres.setSelected(false);
                                        landindustrial.setSelected(false);
                                        landinsti.setSelected(false);
                                        landother.setSelected(false);
                                        landres.setSelected(false);
                                }
                            }
                        } else {
                            landcomm.setSelected(false);
                            landcomres.setSelected(false);
                            landindustrial.setSelected(false);
                            landinsti.setSelected(false);
                            landother.setSelected(false);
                            landres.setSelected(false);
                        }

                        //cbsoi
                        if (resultSet.getString(44) != null) {
                            soibank.setSelected(false);
                            soibroker.setSelected(false);
                            soibuyer.setSelected(false);
                            soigovt.setSelected(false);
                            soinotary.setSelected(false);
                            soiother.setSelected(false);
                            soivaluer.setSelected(false);
                            System.out.println(resultSet.getString(44));

                            String soiString = resultSet.getString(44).replace("[", "").replace("]", "");
                            System.out.println(soiString);

                            List<String> soiList = Arrays.asList(soiString.split("\\s*,\\s*"));
                            System.out.println(soiList);
                            for (String slist : soiList) {
                                switch (slist) {

                                    case "Valuer":
                                        soivaluer.setSelected(true);
                                        break;
                                    case "Other":
                                        soiother.setSelected(true);
                                        break;
                                    case "Notary":
                                        soinotary.setSelected(true);
                                        break;
                                    case "Gov't Institutional":
                                        soigovt.setSelected(true);
                                        break;
                                    case "Buyer/Seller":
                                        soibuyer.setSelected(true);
                                        break;
                                    case "Property Broker":
                                        soibroker.setSelected(true);
                                        break;
                                    case "Bank":
                                        soibank.setSelected(true);
                                        break;
                                    default:
                                        soibank.setSelected(false);
                                        soibroker.setSelected(false);
                                        soibuyer.setSelected(false);
                                        soigovt.setSelected(false);
                                        soinotary.setSelected(false);
                                        soiother.setSelected(false);
                                        soivaluer.setSelected(false);
                                }
                            }
                        } else {
                            soibank.setSelected(false);
                            soibroker.setSelected(false);
                            soibuyer.setSelected(false);
                            soigovt.setSelected(false);
                            soinotary.setSelected(false);
                            soiother.setSelected(false);
                            soivaluer.setSelected(false);
                        }

                    }


                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        this.tableblock.setItems(null);
        this.tableblock.setItems(this.tabledata);

    }

    public void gotoText(ActionEvent event) throws IOException {
        Stage tableStage;
        Parent parent;


        if (event.getSource() == text) {
            tableStage = (Stage) text.getScene().getWindow();
            parent = FXMLLoader.load(getClass().getResource("/superviser/sampleSuperviser.fxml"));

        } else {
            tableStage = (Stage) tquit.getScene().getWindow();
            parent = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        }

        Scene tscene = new Scene(parent);
        tableStage.setScene(tscene);
        tableStage.setResizable(true);
        tableStage.show();


    }

    public void loadText(ActionEvent event) {
        movements();

        try {
            TableRecords tableRecords = (TableRecords) tableblock.getSelectionModel().getSelectedItem();

            String query = "SELECT * FROM block";
            Connection conn = dbConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet trs = pst.executeQuery();
            while (trs.next()) {

                this.tid.setText(trs.getString(1));
                this.tyear.setText(trs.getString(2));
                this.tref.setText(trs.getString(3));
                this.tward.setText(trs.getString(5));
                this.tmtaa.setText(trs.getString(6));
                this.tindivfn.setText(trs.getString(18));
                this.tindivmn.setText(trs.getString(19));
                this.tindivln.setText(trs.getString(20));


                ((TextField) transactiondate.getEditor()).setText(trs.getString(43));
                ((TextField) coyear.getEditor()).setText(trs.getString(50));


                //cbtenure
                if (trs.getString(40) != null) {
                    tenurelease.setSelected(false);
                    tenureres.setSelected(false);
                    tenurereslic.setSelected(false);
                    tenureuntitled.setSelected(false);
                    System.out.println(trs.getString(40));

                    String tenureString = trs.getString(40).replace("[", "]").replace("]", "");
                    System.out.println(tenureString);

                    List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                    System.out.println(tenuList);
                    for (String tlist : tenuList) {
                        switch (tlist) {

                            case "tenureuntitled":
                                tenureuntitled.setSelected(true);
                                break;
                            case "tenurereslic":
                                tenurereslic.setSelected(true);
                                break;
                            case "tenureres":
                                tenureres.setSelected(true);
                                break;
                            case "tenurelease":
                                tenurelease.setSelected(true);
                                break;
                            default:
                                tenurelease.setSelected(false);
                                tenureres.setSelected(false);
                                tenurereslic.setSelected(false);
                                tenureuntitled.setSelected(false);
                        }
                    }
                } else {
                    tenurelease.setSelected(false);
                    tenureres.setSelected(false);
                    tenurereslic.setSelected(false);
                    tenureuntitled.setSelected(false);
                }

                //cbland
                if (trs.getString(41) != null) {
                    landcomm.setSelected(false);
                    landcomres.setSelected(false);
                    landindustrial.setSelected(false);
                    landinsti.setSelected(false);
                    landother.setSelected(false);
                    landres.setSelected(false);
                    System.out.println(trs.getString(41));

                    String tenureString = trs.getString(41).replace("[", "]").replace("]", "");
                    System.out.println(tenureString);

                    List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                    System.out.println(tenuList);
                    for (String tlist : tenuList) {
                        switch (tlist) {

                            case "landres":
                                landres.setSelected(true);
                                break;
                            case "landother":
                                landother.setSelected(true);
                                break;
                            case "landinsti":
                                landinsti.setSelected(true);
                                break;
                            case "landindustrial":
                                landindustrial.setSelected(true);
                                break;
                            case "landcomres":
                                landcomres.setSelected(true);
                                break;
                            case "landcomm":
                                landcomm.setSelected(true);
                                break;
                            default:
                                landcomm.setSelected(false);
                                landcomres.setSelected(false);
                                landindustrial.setSelected(false);
                                landinsti.setSelected(false);
                                landother.setSelected(false);
                                landres.setSelected(false);
                        }
                    }
                } else {
                    landcomm.setSelected(false);
                    landcomres.setSelected(false);
                    landindustrial.setSelected(false);
                    landinsti.setSelected(false);
                    landother.setSelected(false);
                    landres.setSelected(false);
                }

                //cbsoi
                if (trs.getString(44) != null) {
                    soibank.setSelected(false);
                    soibroker.setSelected(false);
                    soibuyer.setSelected(false);
                    soigovt.setSelected(false);
                    soinotary.setSelected(false);
                    soiother.setSelected(false);
                    soivaluer.setSelected(false);
                    System.out.println(trs.getString(44));

                    String tenureString = trs.getString(44).replace("[", "]").replace("]", "");
                    System.out.println(tenureString);

                    List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                    System.out.println(tenuList);
                    for (String tlist : tenuList) {
                        switch (tlist) {

                            case "soivaluer":
                                soivaluer.setSelected(true);
                                break;
                            case "soiother":
                                soiother.setSelected(true);
                                break;
                            case "soinotary":
                                soinotary.setSelected(true);
                                break;
                            case "soigovt":
                                soigovt.setSelected(true);
                                break;
                            case "soibuyer":
                                soibuyer.setSelected(true);
                                break;
                            case "soibroker":
                                soibroker.setSelected(true);
                                break;
                            case "soibank":
                                soibank.setSelected(true);
                                break;
                            default:
                                soibank.setSelected(false);
                                soibroker.setSelected(false);
                                soibuyer.setSelected(false);
                                soigovt.setSelected(false);
                                soinotary.setSelected(false);
                                soiother.setSelected(false);
                                soivaluer.setSelected(false);
                        }
                    }
                } else {
                    soibank.setSelected(false);
                    soibroker.setSelected(false);
                    soibuyer.setSelected(false);
                    soigovt.setSelected(false);
                    soinotary.setSelected(false);
                    soiother.setSelected(false);
                    soivaluer.setSelected(false);
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void update(ActionEvent event) {
        tableblock.setOnMouseClicked(e -> {
            try {
                TableRecords tableRecords = (TableRecords) tableblock.getSelectionModel().getSelectedItem();

                String query = "SELECT * FROM block where ID = ?";
                Connection conn = dbConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, tableRecords.getID());
                ResultSet resultSet = pst.executeQuery();

                while (resultSet.next()) {
                    this.tid.setText(resultSet.getString(1));
                    this.tyear.setText(resultSet.getString(2));
                    this.tref.setText(resultSet.getString(3));
                    this.tward.setText(resultSet.getString(5));
                    this.tmtaa.setText(resultSet.getString(6));
                    this.tindivfn.setText(resultSet.getString(18));
                    this.tindivmn.setText(resultSet.getString(19));
                    this.tindivln.setText(resultSet.getString(20));
                    this.transdate.setText(resultSet.getString(43));
                    ((TextField) transactiondate.getEditor()).setText(resultSet.getString(43));

                    //cbtenure
                    if (resultSet.getString(40) != null) {
                        tenurelease.setSelected(false);
                        tenureres.setSelected(false);
                        tenurereslic.setSelected(false);
                        tenureuntitled.setSelected(false);
                        System.out.println(resultSet.getString(40));

                        String tenureString = resultSet.getString(40).replace("[", "]").replace("]", "");
                        System.out.println(tenureString);

                        List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                        System.out.println(tenuList);
                        for (String tlist : tenuList) {
                            switch (tlist) {

                                case "tenureuntitled":
                                    tenureuntitled.setSelected(true);
                                    break;
                                case "tenurereslic":
                                    tenurereslic.setSelected(true);
                                    break;
                                case "tenureres":
                                    tenureres.setSelected(true);
                                    break;
                                case "tenurelease":
                                    tenurelease.setSelected(true);
                                    break;
                                default:
                                    tenurelease.setSelected(false);
                                    tenureres.setSelected(false);
                                    tenurereslic.setSelected(false);
                                    tenureuntitled.setSelected(false);
                            }
                        }
                    } else {
                        tenurelease.setSelected(false);
                        tenureres.setSelected(false);
                        tenurereslic.setSelected(false);
                        tenureuntitled.setSelected(false);
                    }

                    //cbland
                    if (resultSet.getString(41) != null) {
                        landcomm.setSelected(false);
                        landcomres.setSelected(false);
                        landindustrial.setSelected(false);
                        landinsti.setSelected(false);
                        landother.setSelected(false);
                        landres.setSelected(false);
                        System.out.println(resultSet.getString(41));

                        String tenureString = resultSet.getString(41).replace("[", "]").replace("]", "");
                        System.out.println(tenureString);

                        List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                        System.out.println(tenuList);
                        for (String tlist : tenuList) {
                            switch (tlist) {

                                case "landres":
                                    landres.setSelected(true);
                                    break;
                                case "landother":
                                    landother.setSelected(true);
                                    break;
                                case "landinsti":
                                    landinsti.setSelected(true);
                                    break;
                                case "landindustrial":
                                    landindustrial.setSelected(true);
                                    break;
                                case "landcomres":
                                    landcomres.setSelected(true);
                                    break;
                                case "landcomm":
                                    landcomm.setSelected(true);
                                    break;
                                default:
                                    landcomm.setSelected(false);
                                    landcomres.setSelected(false);
                                    landindustrial.setSelected(false);
                                    landinsti.setSelected(false);
                                    landother.setSelected(false);
                                    landres.setSelected(false);
                            }
                        }
                    } else {
                        landcomm.setSelected(false);
                        landcomres.setSelected(false);
                        landindustrial.setSelected(false);
                        landinsti.setSelected(false);
                        landother.setSelected(false);
                        landres.setSelected(false);
                    }

                    //cbsoi
                    if (resultSet.getString(44) != null) {
                        soibank.setSelected(false);
                        soibroker.setSelected(false);
                        soibuyer.setSelected(false);
                        soigovt.setSelected(false);
                        soinotary.setSelected(false);
                        soiother.setSelected(false);
                        soivaluer.setSelected(false);
                        System.out.println(resultSet.getString(44));

                        String tenureString = resultSet.getString(44).replace("[", "]").replace("]", "");
                        System.out.println(tenureString);

                        List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                        System.out.println(tenuList);
                        for (String tlist : tenuList) {
                            switch (tlist) {

                                case "soivaluer":
                                    soivaluer.setSelected(true);
                                    break;
                                case "soiother":
                                    soiother.setSelected(true);
                                    break;
                                case "soinotary":
                                    soinotary.setSelected(true);
                                    break;
                                case "soigovt":
                                    soigovt.setSelected(true);
                                    break;
                                case "soibuyer":
                                    soibuyer.setSelected(true);
                                    break;
                                case "soibroker":
                                    soibroker.setSelected(true);
                                    break;
                                case "soibank":
                                    soibank.setSelected(true);
                                    break;
                                default:
                                    soibank.setSelected(false);
                                    soibroker.setSelected(false);
                                    soibuyer.setSelected(false);
                                    soigovt.setSelected(false);
                                    soinotary.setSelected(false);
                                    soiother.setSelected(false);
                                    soivaluer.setSelected(false);
                            }
                        }
                    } else {
                        soibank.setSelected(false);
                        soibroker.setSelected(false);
                        soibuyer.setSelected(false);
                        soigovt.setSelected(false);
                        soinotary.setSelected(false);
                        soiother.setSelected(false);
                        soivaluer.setSelected(false);
                    }

                }


            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });
    }

    public static List<TableRecords> BindList() {
        try {
            String query = "SELECT * FROM block";
            Connection conn = dbConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery(query);


            List<TableRecords> list = new ArrayList<TableRecords>();
            while (resultSet.next()) {
                TableRecords tbrecs = new TableRecords(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11), resultSet.getString(12), resultSet.getString(13), resultSet.getString(14), resultSet.getString(15), resultSet.getString(16), resultSet.getString(17), resultSet.getString(18), resultSet.getString(19), resultSet.getString(20),
                        resultSet.getString(21), resultSet.getString(22), resultSet.getString(23), resultSet.getString(24), resultSet.getString(25), resultSet.getString(1), resultSet.getString(26), resultSet.getString(27), resultSet.getString(28), resultSet.getString(29), resultSet.getString(30), resultSet.getString(31), resultSet.getString(32), resultSet.getString(33), resultSet.getString(34), resultSet.getString(35), resultSet.getString(36), resultSet.getString(37), resultSet.getString(38), resultSet.getString(39),
                        resultSet.getString(40), resultSet.getString(41), resultSet.getString(42), resultSet.getString(43), resultSet.getString(44), resultSet.getString(45), resultSet.getString(46), resultSet.getString(47), resultSet.getString(48), resultSet.getString(49), resultSet.getString(50), resultSet.getString(51), resultSet.getString(52), resultSet.getString(53), resultSet.getString(54), resultSet.getString(55), resultSet.getString(56), resultSet.getString(57), resultSet.getString(58), resultSet.getString(59),
                        resultSet.getString(60), resultSet.getString(61), resultSet.getString(62), resultSet.getString(63), resultSet.getString(64), resultSet.getString(65), resultSet.getString(66), resultSet.getString(67), resultSet.getString(68), resultSet.getString(69), resultSet.getString(70), resultSet.getString(71), resultSet.getString(72), resultSet.getString(73), resultSet.getString(74), resultSet.getString(75), resultSet.getString(76), resultSet.getString(77), resultSet.getString(78), resultSet.getString(79),
                        resultSet.getString(80), resultSet.getString(81), resultSet.getString(82), resultSet.getString(83), resultSet.getString(84), resultSet.getString(85), resultSet.getString(86), resultSet.getString(87), resultSet.getString(88), resultSet.getString(89), resultSet.getString(90), resultSet.getString(91), resultSet.getString(92), resultSet.getString(93), resultSet.getString(94), resultSet.getString(95), resultSet.getString(96), resultSet.getString(97), resultSet.getString(98), resultSet.getString(99),
                        resultSet.getString(100), resultSet.getString(101), resultSet.getString(102), resultSet.getString(103), resultSet.getString(104), resultSet.getString(105), resultSet.getString(106), resultSet.getString(107), resultSet.getString(108), resultSet.getString(109), resultSet.getString(110), resultSet.getString(111), resultSet.getString(112), resultSet.getString(113), resultSet.getString(114), resultSet.getString(115), resultSet.getString(116), resultSet.getString(117), resultSet.getString(118), resultSet.getString(119),
                        resultSet.getString(120), resultSet.getString(121), resultSet.getString(123), resultSet.getString(124), resultSet.getString(125), resultSet.getString(126), resultSet.getString(127), resultSet.getString(128), resultSet.getString(129), resultSet.getString(130));
                list.add(tbrecs);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

    @FXML
    public void goNext(int index) throws SQLException {
        String query = "SELECT * FROM block";
        Connection conn = dbConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet resultSet = st.executeQuery(query);


        tid.setText(BindList().get(index).getID());
        tyear.setText(BindList().get(index).getYEAR());
        tref.setText(BindList().get(index).getOBJECTNO());
        tward.setText(BindList().get(index).getPWARD());
        tmtaa.setText(BindList().get(index).getPWARD());
        tindivfn.setText(BindList().get(index).getINDIVFN());
        tindivmn.setText(BindList().get(index).getINDIVMN());
        tindivln.setText(BindList().get(index).getINDIVLN());



        //cbtenure
        if (resultSet.getString(40) != null) {
            tenurelease.setText(BindList().get(index).getTENURE());
            tenureuntitled.setText(BindList().get(index).getTENURE());
            tenurereslic.setText(BindList().get(index).getTENURE());
            tenureres.setText(BindList().get(index).getTENURE());
            System.out.println(resultSet.getString(40));

            String tenureString = resultSet.getString(40).replace("[", "]").replace("]", "");
            System.out.println(tenureString);

            List<String> tenuList = Arrays.asList(tenureString.split("\\s*,\\s*"));
            System.out.println(tenuList);
            for (String tlist : tenuList) {
                switch (tlist) {

                    case "tenureuntitled":
                        tenureuntitled.setText(BindList().get(index).getTENURE());
                        break;
                    case "tenurereslic":
                        tenurereslic.setText(BindList().get(index).getTENURE());
                        break;
                    case "tenureres":
                        tenureres.setText(BindList().get(index).getTENURE());
                        break;
                    case "tenurelease":
                        tenurelease.setText(BindList().get(index).getTENURE());
                        break;
                    default:
                        tenurelease.setText(BindList().get(index).getTENURE());
                        tenureuntitled.setText(BindList().get(index).getTENURE());
                        tenurereslic.setText(BindList().get(index).getTENURE());
                        tenureres.setText(BindList().get(index).getTENURE());
                }
            }
        } else {
            tenurelease.setText(BindList().get(index).getTENURE());
            tenureuntitled.setText(BindList().get(index).getTENURE());
            tenurereslic.setText(BindList().get(index).getTENURE());
            tenureres.setText(BindList().get(index).getTENURE());
        }

        prevButton.setOnAction(e -> {
            count--;
            if (count > 0) {
                try {
                    goNext(count);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } else {
                count = 0;
                try {
                    goNext(count);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("NO MORE");
                alert.setHeaderText(null);
                alert.setContentText("Please there is no more");
                alert.showAndWait();
            }

        });

        nextButton.setOnAction(e->{
            count++;
            if (count < BindList().size()) {
                try {
                    goNext(count);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } else {
                count = BindList().size() - 1;
                try {
                    goNext(count);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("NO MORE");
                alert.setHeaderText(null);
                alert.setContentText("Please there is no more");
                alert.showAndWait();
            }
        });




    }

public void movements() {
        tid.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.UP) || event.getCode().equals(KeyCode.DOWN)) {
                    tid.end();
                    event.consume();
                }
            }
        });
        tyear.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.UP) || event.getCode().equals(KeyCode.DOWN)) {
                    tref.end();
                    event.consume();
                }
            }
        });
        tward.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.UP) || event.getCode().equals(KeyCode.DOWN)) {
                    tward.end();
                    event.consume();
                }
            }
        });




}
public  void  gogo(ActionEvent event){
    nextButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {


            count++;
            if (count < BindList().size()) {
                try {
                    goNext(count);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                count = BindList().size() - 1;
                try {
                    goNext(count);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("NO MORE");
                alert.setHeaderText(null);
                alert.setContentText("Please there is no more");
                alert.showAndWait();
            }
        }

    });
}

    public void delete(ActionEvent event){
        deletebut.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("delete?");
            alert.setHeaderText(null);
            alert.setContentText("deleted");
            Optional <ButtonType> action = alert.showAndWait();

            if (action.get() == ButtonType.OK){
                try {

                    Connection conn = dbConnection.getConnection();
                    String delquery = "delete from block where ID=?";
                    PreparedStatement pr = conn.prepareStatement(delquery);
                    pr.setString(1, tid.getText());
                    pr.executeUpdate();

                    pr.close();


                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

}
