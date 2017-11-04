package superviser;

import dbUtil.dbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;

import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Group;

/**
 * Created by Engnoellemar on 9/9/2017.
 */
public class SuperviserFXMLContoller implements Initializable {
    @FXML
    private Button update111;
    @FXML
    private Button jasper;
    @FXML
    private ListView<String> listnames111;
    @FXML
    private Pane mypane;
    @FXML
    private TextArea path33;
    @FXML
    private WebView web, web1;
    @FXML
    private Button loadmap, loadmap1;
    @FXML
    private ListView maplist, maplist1;
    @FXML
    private ImageView imgview, imgview2;
    @FXML
    private ImageView imgview1, imgview12;
    @FXML
    private ImageView imgview11, imgview111, mainphoto2;
    @FXML
    private Button gotable, gotable1;
    @FXML
    private Button deletebut, deletebut1;
    @FXML
    private Button loadbb, loadbb1, load1;
    @FXML
    private Button update, update1;
    @FXML
    private Button goText;
    @FXML
    private Button quit;
    @FXML
    private Button save, save1;
    @FXML
    private Button nextButton;
    @FXML
    private Button prevButton;
    @FXML
    private Button clearButton, clearButton1;
    @FXML
    private Button browse, browse1;
    @FXML
    private Button build, build1;
    @FXML
    private Button sketchpic, sketchpic1;
    @FXML
    private TextArea docrefyear, docrefyear2;
    @FXML
    private TextArea docrefyear1, docrefyear11;
    @FXML
    private TextArea tin;
    @FXML
    private TextArea id2;
    @FXML
    private TextArea id, id1;
    @FXML
    private TextArea docrefobjectno, docrefobjectno1;
    @FXML
    private TextArea docrefpageno, docrefpageno1;
    @FXML
    private TextArea proprefward, proprefward1;
    @FXML
    private TextArea proprefmtaa, proprefmtaa1;
    @FXML
    private TextArea proprefrateblock, proprefrateblock1;
    @FXML
    private TextArea proprefobjectno, proprefobjectno1;
    @FXML
    private TextArea proprefbuildingno, proprefbuildingno1;
    @FXML
    private CheckBox nonrateable, nonrateable2;
    @FXML
    private CheckBox nonrateable1, nonrateable11;
    @FXML
    private TextArea proplocstreet, proplocstreet1;
    @FXML
    private TextArea proplocplotno, proplocplotno1;
    @FXML
    private TextArea proplocsurveyblock, proplocsurveyblock1;
    @FXML
    private TextArea proplocexistingrefno, proplocexistingrefno1;
    @FXML
    private TextArea proplocmapreference, proplocmapreference1;
    @FXML
    private Hyperlink proplochyperlink, proplochyperlink1;
    @FXML
    private CheckBox individual, individual1;
    @FXML
    private TextArea individualfirstname, individualfirstname1;
    @FXML
    private TextArea individualmiddlename, individualmiddlename1;
    @FXML
    private TextArea individuallastname, individuallastname1;
    @FXML
    private TextArea individualphone1, individualphone11;
    @FXML
    private TextArea individualphone2, individualphone21;
    @FXML
    private CheckBox legalentity, legalentity1;
    @FXML
    private TextArea legalentityfullcompanyname, legalentityfullcompanyname1;
    @FXML
    private TextArea legalentityphone1, legalentityphone11;
    @FXML
    private TextArea legalentityphone2, legalentityphone21, tin1;
    @FXML
    private TextArea ownerinfofirstname, ownerinfofirstname1;
    @FXML
    private TextArea ownerinfomiddlename, ownerinfomiddlename1;
    @FXML
    private TextArea ownerinfolastname, ownerinfolastname1;
    @FXML
    private TextArea ownerinfophone1, ownerinfophone11;
    @FXML
    private TextArea ownerinfophone2, ownerinfophone21;
    @FXML
    private TextArea ownerinfostreet, ownerinfostreet1;
    @FXML
    private TextArea ownerinfoplotno, ownerinfoplotno1;
    @FXML
    private TextArea ownerinfopobox, ownerinfopobox1;
    @FXML
    private TextArea ownerinforegion, ownerinforegion1;
    @FXML
    private TextArea ownerinfodistrict, ownerinfodistrict1;
    @FXML
    private TextArea ownerinfoward, ownerinfoward1;
    @FXML
    private TextArea ownerinfomtaa, ownerinfomtaa1;
    @FXML
    private TextArea ownerinfoemail, ownerinfoemail1;
    @FXML
    private CheckBox tenurelease, tenurelease1;
    @FXML
    private CheckBox tenureresoccupier, tenureresoccupier1;
    @FXML
    private CheckBox tenurereslicensee, tenurereslicensee1;
    @FXML
    private CheckBox tenureuntitled, tenureuntitled1;
    @FXML
    private CheckBox landuseresidential, landuseresidential1;
    @FXML
    private CheckBox landusecommercial, landusecommercial1;
    @FXML
    private CheckBox landusecommres, landusecommres1;
    @FXML
    private CheckBox landuseindustrial, landuseindustrial1;
    @FXML
    private CheckBox landuseinstitution, landuseinstitution1;
    @FXML
    private CheckBox landuseother, landuseother1;
    @FXML
    private TextArea actualtransaction;
    @FXML
    private DatePicker transactiondate, transactiondate1;
    @FXML
    private CheckBox sourceofinfobuyer, sourceofinfobuyer1;
    @FXML
    private CheckBox sourceofinfonotary, sourceofinfonotary1;
    @FXML
    private CheckBox sourceofinfovaluer, sourceofinfovaluer1;
    @FXML
    private CheckBox sourceofinfogovt, sourceofinfogovt1;
    @FXML
    private CheckBox sourceofinfobank, sourceofinfobank1;
    @FXML
    private CheckBox sourceofinfobroker, sourceofinfobroker1;
    @FXML
    private CheckBox sourceofinfoother, sourceofinfoother1;
    @FXML
    private TextArea noofstories;
    @FXML
    private TextArea complete;
    @FXML
    private CheckBox commmallstore, commmallstore1;
    @FXML
    private CheckBox commshopresta, commshopresta1;
    @FXML
    private CheckBox commofficebank, commofficebank1;
    @FXML
    private CheckBox commhotel, commhotel1;
    @FXML
    private CheckBox commpetrolstation, commpetrolstation1;
    @FXML
    private CheckBox commfactorywarehouse, commfactorywarehouse1;
    @FXML
    private CheckBox commstoragetank, commstoragetank1;
    @FXML
    private CheckBox commother, commother1;
    @FXML
    private CheckBox instischool, instischool1;
    @FXML
    private CheckBox instisport, instisport1;
    @FXML
    private CheckBox insticlinical, insticlinical1;
    @FXML
    private CheckBox instiworship, instiworship1;
    @FXML
    private CheckBox instigovt, instigovt1;
    @FXML
    private CheckBox instiother, instiother1;
    @FXML
    private CheckBox resdetatached, resdetatached1;
    @FXML
    private CheckBox ressemidetached, ressemidetached1;
    @FXML
    private CheckBox resapartment, resapartment1;
    @FXML
    private CheckBox resmaisonette, resmaisonette1;
    @FXML
    private CheckBox resvilla, resvilla1;
    @FXML
    private CheckBox resother, resother1;
    @FXML
    private DatePicker coyear, coyear1;
    @FXML
    private DatePicker recoyear, recoyear1;
    @FXML
    private CheckBox roofconcrete, roofharveytiles1, roofconcrete1;
    @FXML
    private CheckBox roofironsheet, roofasbestos1;
    @FXML
    private CheckBox rooftilescement, roofgrass1;
    @FXML
    private CheckBox roofharveytiles, rooftilescement1;
    @FXML
    private CheckBox roofasbestos, roofironsheet1;
    @FXML
    private CheckBox roofgrass, roofother1;
    @FXML
    private CheckBox roofother, roofmangalore;
    @FXML
    private CheckBox exteriorwallconcframe, exteriorwallconcframe1;
    @FXML
    private CheckBox exteriorwallcementblock, exteriorwallglass1;
    @FXML
    private CheckBox exteriorwallglass, exteriorwallhydraform1;
    @FXML
    private CheckBox exteriorwallhydraform, exteriorwallburntbricks1;
    @FXML
    private CheckBox exteriorwallburntbricks, exteriorwallmud1;
    @FXML
    private CheckBox exteriorwallmud, exteriorwalltimber1;
    @FXML
    private CheckBox exteriorwalltimber, exteriorwallother1;
    @FXML
    private CheckBox exteriorwallother, exteriorwallcementblock1;
    @FXML
    private CheckBox exteriorfinishfair, exteriorfinishfair1;
    @FXML
    private CheckBox exteriorfinishtyrolean, exteriorfinishtyrolean1;
    @FXML
    private CheckBox exteriorfinishtiles, exteriorfinishtiles1;
    @FXML
    private CheckBox exteriorfinishglazed, exteriorfinishglazed1;
    @FXML
    private CheckBox exteriorfinishcompact, exteriorfinishcompact1;
    @FXML
    private CheckBox exteriorfinishplaster, exteriorfinishplaster1;
    @FXML
    private CheckBox exteriorfinishother, exteriorfinishother1;
    @FXML
    private CheckBox windowswoodabb, windowswoodabb1;
    @FXML
    private CheckBox windowswoodcasement, windowswoodcasement1;
    @FXML
    private CheckBox windowssteelframe, windowssteelframe1;
    @FXML
    private CheckBox windowsaluframe, windowsaluframe1;
    @FXML
    private CheckBox windowsglass, windowsglass1;
    @FXML
    private CheckBox windowsother, windowsother1;
    @FXML
    private CheckBox doorswoodbattens, doorswoodbattens1;
    @FXML
    private CheckBox doorswoodflush, doorswoodflush1;
    @FXML
    private CheckBox doorssteelshutters, doorssteelshutters1;
    @FXML
    private CheckBox doorssteelsheets, doorssteelsheets1;
    @FXML
    private CheckBox doorsalu, doorsalu1;
    @FXML
    private CheckBox doorsother, doorsother1;
    @FXML
    private CheckBox floormarble, floormarble1;
    @FXML
    private CheckBox floortiles, floortiles1;
    @FXML
    private CheckBox floorinsitu, floorinsitu1;
    @FXML
    private CheckBox floorcement, floorcement1;
    @FXML
    private CheckBox floorwood, floorwood1;
    @FXML
    private CheckBox floorcompact, floorcompact1;
    @FXML
    private CheckBox floorother, floorother1;
    @FXML
    private CheckBox ceilingplaster, ceilingplaster1;
    @FXML
    private CheckBox ceilingsoftboard, ceilingchipboard1;
    @FXML
    private CheckBox ceilingwood, ceilinggypsum1;
    @FXML
    private CheckBox ceilingchipboard, ceilingsuspended1;
    @FXML
    private CheckBox ceilinggypsum, ceilingother1;
    @FXML
    private CheckBox ceilingsuspended, ceilingsoftboard1;
    @FXML
    private CheckBox ceilingother, ceilingwood1;
    @FXML
    private TextArea nofloor;
    @FXML
    private TextArea noroom;
    @FXML
    private CheckBox watermains, watermains1;
    @FXML
    private CheckBox waterstandtap, waterstandtap1;
    @FXML
    private CheckBox waterborehole, waterborehole1;
    @FXML
    private CheckBox waterrain, waterrain1;
    @FXML
    private CheckBox waterriver, waterriver1;
    @FXML
    private CheckBox waternone, waternone1;
    @FXML
    private CheckBox drainagesewer, drainagesewer1;
    @FXML
    private CheckBox drainageptictank, drainageptictank1;
    @FXML
    private CheckBox drainagepitlatrine, drainagepitlatrine1;
    @FXML
    private CheckBox drainageother, drainageother1;
    @FXML
    private CheckBox drainagenone, drainagenone1;
    @FXML
    private CheckBox electricitymains, electricitymains1;
    @FXML
    private CheckBox electricitysolar, electricitysolar1;
    @FXML
    private CheckBox electricitynone, electricitynone1;
    @FXML
    private CheckBox hqwashhand, hqwashhand1;
    @FXML
    private CheckBox hqhighpowder, hqhighpowder1;
    @FXML
    private CheckBox hqjacuzzi, hqjacuzzi1;
    @FXML
    private CheckBox hqkitchencabinet, hqkitchencabinet1;
    @FXML
    private CheckBox hqbuiltin, hqbuiltin1;
    @FXML
    private CheckBox hqnone, hqnone1;
    @FXML
    private CheckBox gqbathtubs, gqbathtubs1;
    @FXML
    private CheckBox gqwesterntoilet, gqwesterntoilet1;
    @FXML
    private CheckBox gqwashhand, gqwashhand1;
    @FXML
    private CheckBox gqkitchen, gqkitchen1;
    @FXML
    private CheckBox gqbuiltin, gqbuiltin1;
    @FXML
    private CheckBox gqnone, gqnone1;
    @FXML
    private CheckBox amenitieslift, amenitieslift1;
    @FXML
    private CheckBox amenitiespool, amenitiespool1;
    @FXML
    private CheckBox amenitiescentralcooling, amenitiescentralcooling1;
    @FXML
    private CheckBox amenitiesfire, amenitiesfire1;
    @FXML
    private CheckBox amenitiesnone, amenitiesnone1;
    @FXML
    private ChoiceBox exllent, exllent1;
    @FXML
    private ChoiceBox good, good1;
    @FXML
    private ChoiceBox fair, fair1;
    @FXML
    private ChoiceBox poor, poor1;
    @FXML
    private CheckBox roadtarmac;
    @FXML
    private CheckBox roadmurram;
    @FXML
    private CheckBox roadearth, roadtarmac1;
    @FXML
    private CheckBox roadfootpath, roadmurram1;
    @FXML
    private CheckBox roadother, roadearth1;
    @FXML
    private CheckBox roadnone, roadfootpath1;
    @FXML
    private CheckBox fencechainlink, roadother1;
    @FXML
    private CheckBox fencecement, roadnone1;
    @FXML
    private CheckBox fencesteel, fencechainlink1;
    @FXML
    private CheckBox fencetimber, fencecement1;
    @FXML
    private CheckBox fenceplant, fencesteel1;
    @FXML
    private CheckBox fencehydraform, fencetimber1;
    @FXML
    private CheckBox fencenone, fenceplant1;
    @FXML
    private CheckBox compoundinterblocks, fencehydraform1;
    @FXML
    private CheckBox compoundconcrete, fencenone1;
    @FXML
    private CheckBox compoundtarmac, compoundinterblocks1;
    @FXML
    private CheckBox compoundlawn, compoundconcrete1;
    @FXML
    private CheckBox compoundother, compoundtarmac1;
    @FXML
    private CheckBox compoundnone, compoundlawn1;
    @FXML
    private CheckBox obnone, compoundother1;
    @FXML
    private CheckBox obno1garage, compoundnone1;
    @FXML
    private CheckBox obno1servants, obnone1;
    @FXML
    private CheckBox obno1workshop, obno1garage1;
    @FXML
    private CheckBox obno1store, obno1servants1;
    @FXML
    private CheckBox obno1other, obno1workshop1;
    @FXML
    private Hyperlink obno1hyperlink;
    @FXML
    private CheckBox obno2garage, obno1store1;
    @FXML
    private CheckBox obno2servants, obno1other1;
    @FXML
    private CheckBox obno2workshop, obno2garage1;
    @FXML
    private CheckBox obno2store, obno2servants1;
    @FXML
    private CheckBox obno2other, obno2store1;
    @FXML
    private Hyperlink obno2hyperlink;
    @FXML
    private CheckBox obno3garage, obno2other1;
    @FXML
    private CheckBox obno3servants, obno3garage1;
    @FXML
    private CheckBox obno3workshop, obno3servants1;
    @FXML
    private CheckBox obno3store, obno3workshop1;
    @FXML
    private CheckBox obno3other, obno3store1;
    @FXML
    private Hyperlink obno3hyperlink, obno2hyperlink1;
    @FXML
    private CheckBox obno4garage, obno3other1;
    @FXML
    private CheckBox obno4servants, obno4garage1;
    @FXML
    private CheckBox obno4workshop, obno4servants1, obno2workshop1;
    @FXML
    private CheckBox obno4store, obno4workshop1;
    @FXML
    private CheckBox obno4other, obno4store1, obno4other1;
    @FXML
    private Hyperlink obno4hyperlink, obno4hyperlink1, obno1hyperlink1, obno3hyperlink1;
    @FXML
    private ImageView sketchphoto, sketchphoto1;
    @FXML
    private ImageView buildphoto1, buildphoto11;
    @FXML
    private ImageView buildphoto2, buildphoto21;
    @FXML
    private TextArea noofbaths, noofbaths1, nofloor1, noroom1, complete1, noofstories1, actualtransaction1;
    @FXML
    private TextArea nooftoilets, nooftoilets1;
    @FXML
    private TextArea mblen, ob4redfactarea1;
    @FXML
    private TextArea mbwid, mblen1;
    @FXML
    private TextArea mbarea, mbwid1;
    @FXML
    private TextArea mbredfact, mbarea1;
    @FXML
    private TextArea mbcompfact, mbredfact1;
    @FXML
    private TextArea mbredfactarea, mbcompfact1;
    @FXML
    private TextArea ob1len, mbredfactarea1;
    @FXML
    private TextArea ob1wid, ob1len1;
    @FXML
    private TextArea ob1area, ob2len1;
    @FXML
    private TextArea ob1redfact, ob3len1;
    @FXML
    private TextArea ob1compfact, ob4len1;
    @FXML
    private TextArea ob1redfactarea, ob1wid1;
    @FXML
    private TextArea ob2len, ob2wid1;
    @FXML
    private TextArea ob2wid, ob3wid1;
    @FXML
    private TextArea ob2area, ob4wid1;
    @FXML
    private TextArea ob2redfact, ob1area1;
    @FXML
    private TextArea ob2compfact, ob2area1;
    @FXML
    private TextArea ob2redfactarea, ob3area1;
    @FXML
    private TextArea ob3len, ob4area1;
    @FXML
    private TextArea ob3wid, ob1redfact1;
    @FXML
    private TextArea ob3area, ob2redfact1;
    @FXML
    private TextArea ob3redfact, ob3redfact1;
    @FXML
    private TextArea ob3compfact, ob4redfact1;
    @FXML
    private TextArea ob3redfactarea, ob1compfact1;
    @FXML
    private TextArea ob4len, ob2compfact1;
    @FXML
    private TextArea ob4wid, ob3compfact1;
    @FXML
    private TextArea ob4area, ob4compfact1;
    @FXML
    private TextArea ob4redfact, ob1redfactarea1;
    @FXML
    private TextArea ob4compfact, ob2redfactarea1;
    @FXML
    private TextArea ob4redfactarea, ob3redfactarea1;
    @FXML
    private TextArea totalrfa, totalrfa1;
    @FXML
    private TextArea totalrfasqr, totalrfasqr1;
    @FXML
    private TextArea multiplybyall, multiplybyall1;
    @FXML
    private TextArea currentreplacementcost, currentreplacementcost1;
    @FXML
    private TextArea lessdeprec, lessdeprec1;
    @FXML
    private TextArea deprecreplacementcost, deprecreplacementcost1;
    @FXML
    private TextArea inspectedby, inspectedby1;
    @FXML
    private TextArea checkedby, checkedby1;
    @FXML
    private TextArea approvedby, approvedby1;
    @FXML
    private TextArea companyname, companyname1;
    @FXML
    private TextArea companystamp, companystamp1,path331,path3311;
    @FXML
    private ComboBox combobb;
    @FXML
    private TextArea path, path1, path2, path11, path13, path111;
    @FXML
    private TextArea path12, path121, path121111, path1211, path12111, path122, path1212, path12112, checkarea;
    @FXML
    private DatePicker certifieddate, certifieddate1;
    @FXML
    private File filesketch, filebuild1, filebuild2;
    @FXML
    private FileChooser fileChooser1, fileChooser2, fileChooser3;
    @FXML
    private Desktop desktop = Desktop.getDesktop();
    @FXML
    private FileInputStream fisChoose1, fisChoose2, fisChoose3;
    @FXML
    private Image imgpath, imgway, imggate;
    @FXML
    private ListView<String> listnames, listnames1;
    @FXML
    private TextArea areaprint;
    @FXML
    final ObservableList<String> glist = FXCollections.observableArrayList();
    final ObservableList<String> namesList = FXCollections.observableArrayList();
    final ObservableList<String> namesList1 = FXCollections.observableArrayList();
    final ObservableList<String> namesList2 = FXCollections.observableArrayList();
    final ObservableList<String> namesList3 = FXCollections.observableArrayList();
    final ObservableList<String> checkTenure = FXCollections.observableArrayList();
    final ObservableList<String> checkRate = FXCollections.observableArrayList();
    final ObservableList<String> checkIndiv = FXCollections.observableArrayList();
    final ObservableList<String> checkLegal = FXCollections.observableArrayList();
    final ObservableList<String> checkLand = FXCollections.observableArrayList();
    final ObservableList<String> checkSoi = FXCollections.observableArrayList();
    final ObservableList<String> checkComind = FXCollections.observableArrayList();
    final ObservableList<String> checkInsti = FXCollections.observableArrayList();
    final ObservableList<String> checkRes = FXCollections.observableArrayList();
    final ObservableList<String> checkRoof = FXCollections.observableArrayList();
    final ObservableList<String> checkExtwall = FXCollections.observableArrayList();
    final ObservableList<String> checkExtfin = FXCollections.observableArrayList();
    final ObservableList<String> checkWin = FXCollections.observableArrayList();
    final ObservableList<String> checkDor = FXCollections.observableArrayList();
    final ObservableList<String> checkFlor = FXCollections.observableArrayList();
    final ObservableList<String> checkCel = FXCollections.observableArrayList();
    final ObservableList<String> checkDrainage = FXCollections.observableArrayList();
    final ObservableList<String> checkWater = FXCollections.observableArrayList();
    final ObservableList<String> checkElectricity = FXCollections.observableArrayList();
    final ObservableList<String> checkHq = FXCollections.observableArrayList();
    final ObservableList<String> checkGq = FXCollections.observableArrayList();
    final ObservableList<String> checkAmenit = FXCollections.observableArrayList();
    final ObservableList<String> checkRoad = FXCollections.observableArrayList();
    final ObservableList<String> checkFence = FXCollections.observableArrayList();
    final ObservableList<String> checkComp = FXCollections.observableArrayList();
    final ObservableList<String> checkObnone = FXCollections.observableArrayList();
    final ObservableList<String> checkOb1 = FXCollections.observableArrayList();
    final ObservableList<String> checkOb2 = FXCollections.observableArrayList();
    final ObservableList<String> checkOb3 = FXCollections.observableArrayList();
    final ObservableList<String> checkOb4 = FXCollections.observableArrayList();
    int count = 0;


    @Override
    public void initialize(URL location, ResourceBundle rb) {
        dbConnection dc = new dbConnection();
        myCombo();
        myRelease();
        areaLoad();
        mapView();
        myCheck1();
        myCheck2();
        myCheck3();
        myCheck4();
        myCheck11();
        myCheck22();
        myCheck33();
        myCheck44();
        mySimple();
    }

    @FXML
    private void loadBlockRecords(ActionEvent event) {
        reFresh();
    }

    @FXML
    private void reFresh() {

        try {
            String query = "SELECT * FROM block";
            Connection conn = dbConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                this.id.setText(rs.getString(23));
                this.docrefyear.setText(rs.getString(2));
                this.docrefobjectno.setText(rs.getString(3));
                this.docrefpageno.setText(rs.getString(4));
                this.proprefward.setText(rs.getString(5));
                this.proprefmtaa.setText(rs.getString(6));
                this.proprefrateblock.setText(rs.getString(7));
                this.proprefobjectno.setText(rs.getString(8));
                this.proprefbuildingno.setText(rs.getString(9));

                this.proplocstreet.setText(rs.getString(10));
                this.proplocplotno.setText(rs.getString(11));
                this.proplocsurveyblock.setText(rs.getString(12));
                this.proplocexistingrefno.setText(rs.getString(13));
                this.proplocmapreference.setText(rs.getString(14));

                String value = rs.getString(14);
                proplochyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                                 @Override
                                                 public void handle(ActionEvent e) {
                                                     try {
                                                         Desktop.getDesktop().browse(new URI(value));
                                                     } catch (IOException e1) {
                                                         e1.printStackTrace();
                                                     } catch (URISyntaxException e1) {
                                                         e1.printStackTrace();
                                                     }
                                                 }
                                             }
                );


                this.individualfirstname.setText(rs.getString(15));
                this.individualmiddlename.setText(rs.getString(16));
                this.individuallastname.setText(rs.getString(17));
                this.individualphone1.setText(rs.getString(18));
                this.individualphone2.setText(rs.getString(19));

                this.legalentityfullcompanyname.setText(rs.getString(20));
                this.legalentityphone1.setText(rs.getString(21));
                this.legalentityphone2.setText(rs.getString(22));
                this.ownerinfofirstname.setText(rs.getString(1));
                this.ownerinfomiddlename.setText(rs.getString(24));
                this.ownerinfolastname.setText(rs.getString(25));
                this.ownerinfophone1.setText(rs.getString(26));
                this.ownerinfophone2.setText(rs.getString(27));
                this.ownerinfostreet.setText(rs.getString(28));
                this.ownerinfoplotno.setText(rs.getString(29));
                this.ownerinfopobox.setText(rs.getString(30));
                this.ownerinforegion.setText(rs.getString(31));
                this.ownerinfodistrict.setText(rs.getString(32));
                this.ownerinfoward.setText(rs.getString(33));
                this.ownerinfomtaa.setText(rs.getString(34));
                this.ownerinfoemail.setText(rs.getString(35));

                if (rs.getString(127) != null) {
                    nonrateable.setSelected(false);
                    nonrateable1.setSelected(false);
                    System.out.println(rs.getString(127));

                    String nonrateString = rs.getString(127).replace("[", "").replace("]", "");
                    System.out.println(nonrateString);

                    List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                    System.out.println(noneList);
                    for (String non : noneList) {
                        switch (non) {
                            case "Rateable":
                                nonrateable.setSelected(true);
                                break;
                            case "Non-\n" +
                                    "Rateable":
                                nonrateable1.setSelected(true);
                                break;
                            default:
                                nonrateable.setSelected(false);
                                nonrateable1.setSelected(false);
                        }
                    }
                } else {
                    nonrateable.setSelected(false);
                    nonrateable1.setSelected(false);
                }

                if (rs.getString(128) != null) {
                    individual.setSelected(false);
                    System.out.println(rs.getString(128));

                    String nonrateString = rs.getString(128).replace("[", "").replace("]", "");
                    System.out.println(nonrateString);

                    List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                    System.out.println(noneList);
                    for (String non : noneList) {
                        switch (non) {
                            case "Individual":
                                individual.setSelected(true);
                                break;
                            default:
                                individual.setSelected(false);
                        }
                    }
                } else {
                    individual.setSelected(false);
                }

                if (rs.getString(129) != null) {
                    legalentity.setSelected(false);
                    System.out.println(rs.getString(129));

                    String nonrateString = rs.getString(129).replace("[", "").replace("]", "");
                    System.out.println(nonrateString);

                    List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                    System.out.println(noneList);
                    for (String non : noneList) {
                        switch (non) {
                            case "Legal\n" +
                                    "Entity":
                                legalentity.setSelected(true);
                                break;
                            default:
                                legalentity.setSelected(false);
                        }
                    }
                } else {
                    legalentity.setSelected(false);
                }


                //cbtenure
                if (rs.getString(36) != null) {
                    tenureuntitled.setSelected(false);
                    tenureresoccupier.setSelected(false);
                    tenurelease.setSelected(false);
                    tenurereslicensee.setSelected(false);
                    System.out.println(rs.getString(36));

                    String tenureString = rs.getString(36).replace("[", "").replace("]", "");
                    System.out.println(tenureString);

                    List<String> tenureList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                    System.out.println(tenureList);

                    for (String tenu : tenureList) {
                        switch (tenu) {
                            case "Leasehold":
                                tenurelease.setSelected(true);
                                break;
                            case "Res/Occupier":
                                tenureresoccupier.setSelected(true);
                                break;
                            case "Res/Licensee":
                                tenureresoccupier.setSelected(true);
                                break;
                            case "Untitled":
                                tenureuntitled.setSelected(true);
                                break;
                            default:
                                tenureuntitled.setSelected(false);
                                tenureresoccupier.setSelected(false);
                                tenurelease.setSelected(false);
                                tenurereslicensee.setSelected(false);
                        }
                    }
                } else {
                    tenureuntitled.setSelected(false);
                    tenureresoccupier.setSelected(false);
                    tenurelease.setSelected(false);
                    tenurereslicensee.setSelected(false);
                }

                //cbland
                if (rs.getString(37) != null) {
                    landuseother.setSelected(false);
                    landuseinstitution.setSelected(false);
                    landuseindustrial.setSelected(false);
                    landusecommres.setSelected(false);
                    landusecommercial.setSelected(false);
                    landuseresidential.setSelected(false);
                    System.out.println(rs.getString(37));

                    String landString = rs.getString(37).replace("[", "").replace("]", "");
                    System.out.println(landString);

                    List<String> landList = Arrays.asList(landString.split("\\s*,\\s*"));
                    System.out.println(landList);

                    for (String land : landList) {
                        switch (land) {
                            case "Residential":
                                landuseresidential.setSelected(true);
                                break;
                            case "Commercial":
                                landusecommercial.setSelected(true);
                                break;
                            case "Comm/Residential":
                                landusecommres.setSelected(true);
                                break;
                            case "Industrial":
                                landuseindustrial.setSelected(true);
                                break;
                            case "institutional":
                                landuseinstitution.setSelected(true);
                                break;
                            case "other":
                                landuseother.setSelected(true);
                                break;
                            default:
                                landuseother.setSelected(false);
                                landuseinstitution.setSelected(false);
                                landuseindustrial.setSelected(false);
                                landusecommres.setSelected(false);
                                landusecommercial.setSelected(false);
                                landuseresidential.setSelected(false);
                        }
                    }
                } else {
                    landuseother.setSelected(false);
                    landuseinstitution.setSelected(false);
                    landuseindustrial.setSelected(false);
                    landusecommres.setSelected(false);
                    landusecommercial.setSelected(false);
                    landuseresidential.setSelected(false);
                }

                this.actualtransaction.setText(rs.getString(38) + "/= Tsh");
                ((TextField) transactiondate.getEditor()).setText(rs.getString(39));


                //cbsoi
                if (rs.getString(40) != null) {
                    sourceofinfoother.setSelected(false);
                    sourceofinfobroker.setSelected(false);
                    sourceofinfobank.setSelected(false);
                    sourceofinfogovt.setSelected(false);
                    sourceofinfovaluer.setSelected(false);
                    sourceofinfonotary.setSelected(false);
                    sourceofinfobuyer.setSelected(false);
                    System.out.println(rs.getString(40));

                    String soiString = rs.getString(40).replace("[", "").replace("]", "");
                    System.out.println(soiString);

                    List<String> soiList = Arrays.asList(soiString.split("\\s*,\\s*"));
                    System.out.println(soiList);

                    for (String soi : soiList) {
                        switch (soi) {
                            case "Buyer/Seller":
                                sourceofinfobuyer.setSelected(true);
                                break;
                            case "Notary":
                                sourceofinfonotary.setSelected(true);
                                break;
                            case "Valuer":
                                sourceofinfovaluer.setSelected(true);
                                break;
                            case "Gov't Institution":
                                sourceofinfogovt.setSelected(true);
                                break;
                            case "Bank":
                                sourceofinfobank.setSelected(true);
                                break;
                            case "Property Broker":
                                sourceofinfoother.setSelected(true);
                                break;
                            case "Other":
                                sourceofinfobroker.setSelected(true);
                                break;
                            default:
                                sourceofinfoother.setSelected(false);
                                sourceofinfobroker.setSelected(false);
                                sourceofinfobank.setSelected(false);
                                sourceofinfogovt.setSelected(false);
                                sourceofinfovaluer.setSelected(false);
                                sourceofinfonotary.setSelected(false);
                                sourceofinfobuyer.setSelected(false);
                        }
                    }
                } else {
                    sourceofinfoother.setSelected(false);
                    sourceofinfobroker.setSelected(false);
                    sourceofinfobank.setSelected(false);
                    sourceofinfogovt.setSelected(false);
                    sourceofinfovaluer.setSelected(false);
                    sourceofinfonotary.setSelected(false);
                    sourceofinfobuyer.setSelected(false);
                }
                this.noofstories.setText(rs.getString(41));
                this.complete.setText(rs.getString(42) + "%");

                //cbcomm
                if (rs.getString(43) != null) {
                    commstoragetank.setSelected(false);
                    commshopresta.setSelected(false);
                    commpetrolstation.setSelected(false);
                    commother.setSelected(false);
                    commofficebank.setSelected(false);
                    commmallstore.setSelected(false);
                    commhotel.setSelected(false);
                    commfactorywarehouse.setSelected(false);
                    System.out.println(rs.getString(43));

                    String commString = rs.getString(43).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Factory/\n" +
                                    "Warehouse":
                                commfactorywarehouse.setSelected(true);
                                break;
                            case "Hotel":
                                commhotel.setSelected(true);
                                break;
                            case "Shopping Malll/\n" +
                                    "Dept. Store":
                                commmallstore.setSelected(true);
                                break;
                            case "Office/Bank":
                                commofficebank.setSelected(true);
                                break;
                            case "Other":
                                commother.setSelected(true);
                                break;
                            case "Petrol Station":
                                commpetrolstation.setSelected(true);
                                break;
                            case "Shop/Restaurant/\n" +
                                    "bar":
                                commshopresta.setSelected(true);
                                break;
                            case "Storage Tank":
                                commstoragetank.setSelected(true);
                                break;
                            default:
                                commstoragetank.setSelected(false);
                                commshopresta.setSelected(false);
                                commpetrolstation.setSelected(false);
                                commother.setSelected(false);
                                commofficebank.setSelected(false);
                                commmallstore.setSelected(false);
                                commhotel.setSelected(false);
                                commfactorywarehouse.setSelected(false);
                        }
                    }
                } else {
                    commstoragetank.setSelected(false);
                    commshopresta.setSelected(false);
                    commpetrolstation.setSelected(false);
                    commother.setSelected(false);
                    commofficebank.setSelected(false);
                    commmallstore.setSelected(false);
                    commhotel.setSelected(false);
                    commfactorywarehouse.setSelected(false);
                }

                //cbcinsti
                if (rs.getString(44) != null) {
                    instiworship.setSelected(false);
                    instischool.setSelected(false);
                    instisport.setSelected(false);
                    instiother.setSelected(false);
                    instigovt.setSelected(false);
                    insticlinical.setSelected(false);
                    System.out.println(rs.getString(44));

                    String commString = rs.getString(44).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Clinical/Hospital":
                                insticlinical.setSelected(true);
                                break;
                            case "Government":
                                instigovt.setSelected(true);
                                break;
                            case "Other":
                                instiother.setSelected(true);
                                break;
                            case "Sport/Recreation":
                                instisport.setSelected(true);
                                break;
                            case "School":
                                instischool.setSelected(true);
                                break;
                            case "Worship":
                                instiworship.setSelected(true);
                                break;
                            default:
                                instiworship.setSelected(false);
                                instischool.setSelected(false);
                                instisport.setSelected(false);
                                instiother.setSelected(false);
                                instigovt.setSelected(false);
                        }
                    }
                } else {
                    instiworship.setSelected(false);
                    instischool.setSelected(false);
                    instisport.setSelected(false);
                    instiother.setSelected(false);
                    instigovt.setSelected(false);
                }

                //cbres
                if (rs.getString(45) != null) {
                    resvilla.setSelected(false);
                    ressemidetached.setSelected(false);
                    resother.setSelected(false);
                    resmaisonette.setSelected(false);
                    resdetatached.setSelected(false);
                    resapartment.setSelected(false);
                    System.out.println(rs.getString(45));

                    String commString = rs.getString(45).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Apartment":
                                resapartment.setSelected(true);
                                break;
                            case "Detached House":
                                resdetatached.setSelected(true);
                                break;
                            case "Maisonette":
                                resmaisonette.setSelected(true);
                                break;
                            case "Other":
                                resother.setSelected(true);
                                break;
                            case "Villa":
                                resvilla.setSelected(true);
                                break;
                            case "Semi-Detached":
                                ressemidetached.setSelected(true);
                                break;
                            default:
                                resvilla.setSelected(false);
                                ressemidetached.setSelected(false);
                                resother.setSelected(false);
                                resmaisonette.setSelected(false);
                                resdetatached.setSelected(false);
                                resapartment.setSelected(false);
                        }
                    }
                } else {
                    resvilla.setSelected(false);
                    ressemidetached.setSelected(false);
                    resother.setSelected(false);
                    resmaisonette.setSelected(false);
                    resdetatached.setSelected(false);
                    resapartment.setSelected(false);
                }

                ((TextField) coyear.getEditor()).setText(rs.getString(46));
                ((TextField) recoyear.getEditor()).setText(rs.getString(47));


                //cbroof
                if (rs.getString(48) != null) {
                    rooftilescement.setSelected(false);
                    roofother.setSelected(false);
                    roofironsheet.setSelected(false);
                    roofharveytiles.setSelected(false);
                    roofgrass.setSelected(false);
                    roofconcrete.setSelected(false);
                    roofasbestos.setSelected(false);
                    System.out.println(rs.getString(48));

                    String commString = rs.getString(48).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Asbestos":
                                roofasbestos.setSelected(true);
                                break;
                            case "Concrete":
                                roofconcrete.setSelected(true);
                                break;
                            case "Grass/Palm":
                                roofgrass.setSelected(true);
                                break;
                            case "Harvey Tiles":
                                roofharveytiles.setSelected(true);
                                break;
                            case "Iron Sheet":
                                roofironsheet.setSelected(true);
                                break;
                            case "Tiles/Cement":
                                rooftilescement.setSelected(true);
                                break;
                            case "Mangalore":
                                roofother.setSelected(true);
                                break;
                            default:
                                rooftilescement.setSelected(false);
                                roofother.setSelected(false);
                                roofironsheet.setSelected(false);
                                roofharveytiles.setSelected(false);
                                roofgrass.setSelected(false);
                                roofconcrete.setSelected(false);
                                roofasbestos.setSelected(false);
                        }
                    }
                } else {
                    rooftilescement.setSelected(false);
                    roofother.setSelected(false);
                    roofironsheet.setSelected(false);
                    roofharveytiles.setSelected(false);
                    roofgrass.setSelected(false);
                    roofconcrete.setSelected(false);
                    roofasbestos.setSelected(false);
                }

                //cbextwa
                if (rs.getString(49) != null) {
                    exteriorwallother.setSelected(false);
                    exteriorwallmud.setSelected(false);
                    exteriorwallhydraform.setSelected(false);
                    exteriorwalltimber.setSelected(false);
                    exteriorwallglass.setSelected(false);
                    exteriorwallconcframe.setSelected(false);
                    exteriorwallcementblock.setSelected(false);
                    exteriorwallburntbricks.setSelected(false);
                    System.out.println(rs.getString(49));

                    String commString = rs.getString(49).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Burnt Bricks":
                                exteriorwallburntbricks.setSelected(true);
                                break;
                            case "Cement Block":
                                exteriorwallcementblock.setSelected(true);
                                break;
                            case "R/Conc Frame":
                                exteriorwallconcframe.setSelected(true);
                                break;
                            case "Glass":
                                exteriorwallglass.setSelected(true);
                                break;
                            case "Timber":
                                exteriorwalltimber.setSelected(true);
                                break;
                            case "Hydraform":
                                exteriorwallhydraform.setSelected(true);
                                break;
                            case "Mud":
                                exteriorwallmud.setSelected(true);
                                break;
                            case "Other":
                                exteriorwallother.setSelected(true);
                                break;
                            default:
                                exteriorwallother.setSelected(false);
                                exteriorwallmud.setSelected(false);
                                exteriorwallhydraform.setSelected(false);
                                exteriorwalltimber.setSelected(false);
                                exteriorwallglass.setSelected(false);
                                exteriorwallconcframe.setSelected(false);
                                exteriorwallcementblock.setSelected(false);
                                exteriorwallburntbricks.setSelected(false);
                        }
                    }
                } else {
                    exteriorwallother.setSelected(false);
                    exteriorwallmud.setSelected(false);
                    exteriorwallhydraform.setSelected(false);
                    exteriorwalltimber.setSelected(false);
                    exteriorwallglass.setSelected(false);
                    exteriorwallconcframe.setSelected(false);
                    exteriorwallcementblock.setSelected(false);
                    exteriorwallburntbricks.setSelected(false);
                }

                //cbextfin
                if (rs.getString(50) != null) {
                    exteriorfinishcompact.setSelected(false);
                    exteriorfinishglazed.setSelected(false);
                    exteriorfinishfair.setSelected(false);
                    exteriorfinishother.setSelected(false);
                    exteriorfinishplaster.setSelected(false);
                    exteriorfinishtiles.setSelected(false);
                    exteriorfinishtyrolean.setSelected(false);
                    System.out.println(rs.getString(50));

                    String commString = rs.getString(50).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Tyrolean":
                                exteriorfinishtyrolean.setSelected(true);
                                break;
                            case "Tiles":
                                exteriorfinishtiles.setSelected(true);
                                break;
                            case "Plaster/Paint":
                                exteriorfinishplaster.setSelected(true);
                                break;
                            case "Other":
                                exteriorfinishother.setSelected(true);
                                break;
                            case "Fair Finish":
                                exteriorfinishfair.setSelected(true);
                                break;
                            case "Glazed":
                                exteriorfinishglazed.setSelected(true);
                                break;
                            case "Compact Earth":
                                exteriorfinishcompact.setSelected(true);
                                break;
                            default:
                                exteriorfinishcompact.setSelected(false);
                                exteriorfinishglazed.setSelected(false);
                                exteriorfinishfair.setSelected(false);
                                exteriorfinishother.setSelected(false);
                                exteriorfinishplaster.setSelected(false);
                                exteriorfinishtiles.setSelected(false);
                                exteriorfinishtyrolean.setSelected(false);
                        }
                    }
                } else {
                    exteriorfinishcompact.setSelected(false);
                    exteriorfinishglazed.setSelected(false);
                    exteriorfinishfair.setSelected(false);
                    exteriorfinishother.setSelected(false);
                    exteriorfinishplaster.setSelected(false);
                    exteriorfinishtiles.setSelected(false);
                    exteriorfinishtyrolean.setSelected(false);
                }

                //cbwindows
                if (rs.getString(51) != null) {
                    windowswoodcasement.setSelected(false);
                    windowswoodabb.setSelected(false);
                    windowssteelframe.setSelected(false);
                    windowsother.setSelected(false);
                    windowsglass.setSelected(false);
                    windowsaluframe.setSelected(false);
                    System.out.println(rs.getString(51));

                    String commString = rs.getString(51).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Tyrolean":
                                windowsaluframe.setSelected(true);
                                break;
                            case "Tiles":
                                windowsglass.setSelected(true);
                                break;
                            case "Plaster/Paint":
                                windowsother.setSelected(true);
                                break;
                            case "Other":
                                windowssteelframe.setSelected(true);
                                break;
                            case "Fair Finish":
                                windowswoodabb.setSelected(true);
                                break;
                            case "Glazed":
                                windowswoodcasement.setSelected(true);
                                break;
                            default:
                                windowswoodcasement.setSelected(false);
                                windowswoodabb.setSelected(false);
                                windowssteelframe.setSelected(false);
                                windowsother.setSelected(false);
                                windowsglass.setSelected(false);
                                windowsaluframe.setSelected(false);
                        }
                    }
                } else {
                    windowswoodcasement.setSelected(false);
                    windowswoodabb.setSelected(false);
                    windowssteelframe.setSelected(false);
                    windowsother.setSelected(false);
                    windowsglass.setSelected(false);
                    windowsaluframe.setSelected(false);
                }

                //cbdoors
                if (rs.getString(52) != null) {
                    doorssteelshutters.setSelected(false);
                    doorswoodflush.setSelected(false);
                    doorswoodbattens.setSelected(false);
                    doorssteelsheets.setSelected(false);
                    doorsother.setSelected(false);
                    doorsalu.setSelected(false);
                    System.out.println(rs.getString(52));

                    String commString = rs.getString(52).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Alluminium":
                                doorsalu.setSelected(true);
                                break;
                            case "other":
                                doorsother.setSelected(true);
                                break;
                            case "Steel Sheets":
                                doorssteelsheets.setSelected(true);
                                break;
                            case "Wood Battens":
                                doorswoodbattens.setSelected(true);
                                break;
                            case "Wood Flush":
                                doorswoodflush.setSelected(true);
                                break;
                            case "Steel Shutters":
                                doorssteelshutters.setSelected(true);
                                break;
                            default:
                                doorssteelshutters.setSelected(false);
                                doorswoodflush.setSelected(false);
                                doorswoodbattens.setSelected(false);
                                doorssteelsheets.setSelected(false);
                                doorsother.setSelected(false);
                                doorsalu.setSelected(false);
                        }
                    }
                } else {
                    doorssteelshutters.setSelected(false);
                    doorswoodflush.setSelected(false);
                    doorswoodbattens.setSelected(false);
                    doorssteelsheets.setSelected(false);
                    doorsother.setSelected(false);
                    doorsalu.setSelected(false);
                }
                //cbfloor
                if (rs.getString(53) != null) {
                    floorwood.setSelected(false);
                    floortiles.setSelected(false);
                    floorother.setSelected(false);
                    floormarble.setSelected(false);
                    floorinsitu.setSelected(false);
                    floorcompact.setSelected(false);
                    floorcement.setSelected(false);
                    System.out.println(rs.getString(53));

                    String commString = rs.getString(53).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Cement Screed":
                                floorcement.setSelected(true);
                                break;
                            case "Compact Earth":
                                floorcompact.setSelected(true);
                                break;
                            case "In situ  Terazzo":
                                floorinsitu.setSelected(true);
                                break;
                            case "Marble/Granite":
                                floormarble.setSelected(true);
                                break;
                            case "Other":
                                floorother.setSelected(true);
                                break;
                            case "Tiles":
                                floortiles.setSelected(true);
                                break;
                            case "Wood /Parquet":
                                floorwood.setSelected(true);
                                break;
                            default:
                                floorwood.setSelected(false);
                                floortiles.setSelected(false);
                                floorother.setSelected(false);
                                floormarble.setSelected(false);
                                floorinsitu.setSelected(false);
                                floorcompact.setSelected(false);
                                floorcement.setSelected(false);
                        }
                    }
                } else {
                    floorwood.setSelected(false);
                    floortiles.setSelected(false);
                    floorother.setSelected(false);
                    floormarble.setSelected(false);
                    floorinsitu.setSelected(false);
                    floorcompact.setSelected(false);
                    floorcement.setSelected(false);
                }

                //cbceiling
                if (rs.getString(54) != null) {
                    ceilingsuspended.setSelected(false);
                    ceilingsoftboard.setSelected(false);
                    ceilingplaster.setSelected(false);
                    ceilingother.setSelected(false);
                    ceilinggypsum.setSelected(false);
                    ceilingchipboard.setSelected(false);
                    ceilingwood.setSelected(false);
                    System.out.println(rs.getString(54));

                    String commString = rs.getString(54).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Wood tongue & grooved":
                                ceilingwood.setSelected(true);
                                break;
                            case "chipboard":
                                ceilingchipboard.setSelected(true);
                                break;
                            case "Gypsum":
                                ceilinggypsum.setSelected(true);
                                break;
                            case "Other":
                                ceilingother.setSelected(true);
                                break;
                            case "Plastered/Concrete":
                                ceilingplaster.setSelected(true);
                                break;
                            case "Softboard/Hardboard":
                                ceilingsoftboard.setSelected(true);
                                break;
                            case "Suspended/Acoustic":
                                ceilingsuspended.setSelected(true);
                                break;
                            default:
                                ceilingsuspended.setSelected(false);
                                ceilingsoftboard.setSelected(false);
                                ceilingplaster.setSelected(false);
                                ceilingother.setSelected(false);
                                ceilinggypsum.setSelected(false);
                                ceilingchipboard.setSelected(false);
                                ceilingwood.setSelected(false);
                        }
                    }
                } else {
                    ceilingsuspended.setSelected(false);
                    ceilingsoftboard.setSelected(false);
                    ceilingplaster.setSelected(false);
                    ceilingother.setSelected(false);
                    ceilinggypsum.setSelected(false);
                    ceilingchipboard.setSelected(false);
                    ceilingwood.setSelected(false);
                }

                this.nofloor.setText(rs.getString(55));
                this.noroom.setText(rs.getString(56));


                //cbwater
                if (rs.getString(57) != null) {
                    waterriver.setSelected(false);
                    waterstandtap.setSelected(false);
                    waterrain.setSelected(false);
                    waternone.setSelected(false);
                    watermains.setSelected(false);
                    waterborehole.setSelected(false);
                    System.out.println(rs.getString(57));

                    String commString = rs.getString(57).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Borehole":
                                waterborehole.setSelected(true);
                                break;
                            case "Mains":
                                watermains.setSelected(true);
                                break;
                            case "None":
                                waternone.setSelected(true);
                                break;
                            case "Rain":
                                waterrain.setSelected(true);
                                break;
                            case "Stand Tap":
                                waterstandtap.setSelected(true);
                                break;
                            case "River/Stream":
                                waterriver.setSelected(true);
                                break;
                            default:
                                waterriver.setSelected(false);
                                waterstandtap.setSelected(false);
                                waterrain.setSelected(false);
                                waternone.setSelected(false);
                                watermains.setSelected(false);
                                waterborehole.setSelected(false);
                        }
                    }
                } else {
                    waterriver.setSelected(false);
                    waterstandtap.setSelected(false);
                    waterrain.setSelected(false);
                    waternone.setSelected(false);
                    watermains.setSelected(false);
                    waterborehole.setSelected(false);
                }

                //cbdrainage
                if (rs.getString(58) != null) {
                    drainagesewer.setSelected(false);
                    drainageptictank.setSelected(false);
                    drainagepitlatrine.setSelected(false);
                    drainageother.setSelected(false);
                    drainagenone.setSelected(false);
                    ceilingwood.setSelected(false);
                    System.out.println(rs.getString(58));

                    String commString = rs.getString(58).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "None":
                                drainagenone.setSelected(true);
                                break;
                            case "Other":
                                drainageother.setSelected(true);
                                break;
                            case "Pit Latrine":
                                drainagepitlatrine.setSelected(true);
                                break;
                            case "Septic Tank":
                                drainageptictank.setSelected(true);
                                break;
                            case "Sewer":
                                drainagesewer.setSelected(true);
                                break;
                            default:
                                drainagesewer.setSelected(false);
                                drainageptictank.setSelected(false);
                                drainagepitlatrine.setSelected(false);
                                drainageother.setSelected(false);
                                drainagenone.setSelected(false);
                                ceilingwood.setSelected(false);
                        }
                    }
                } else {
                    drainagesewer.setSelected(false);
                    drainageptictank.setSelected(false);
                    drainagepitlatrine.setSelected(false);
                    drainageother.setSelected(false);
                    drainagenone.setSelected(false);
                    ceilingwood.setSelected(false);
                }

                //cbelectricity
                if (rs.getString(59) != null) {
                    electricitysolar.setSelected(false);
                    electricitynone.setSelected(false);
                    electricitymains.setSelected(false);
                    System.out.println(rs.getString(59));

                    String commString = rs.getString(59).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "None":
                                electricitynone.setSelected(true);
                                break;
                            case "Mains":
                                electricitymains.setSelected(true);
                                break;
                            case "Solar":
                                electricitysolar.setSelected(true);
                                break;
                            default:
                                electricitysolar.setSelected(false);
                                electricitynone.setSelected(false);
                                electricitymains.setSelected(false);
                        }
                    }
                } else {
                    electricitysolar.setSelected(false);
                    electricitynone.setSelected(false);
                    electricitymains.setSelected(false);
                }

                //cbhq
                if (rs.getString(60) != null) {
                    hqwashhand.setSelected(false);
                    hqnone.setSelected(false);
                    hqkitchencabinet.setSelected(false);
                    hqjacuzzi.setSelected(false);
                    hqhighpowder.setSelected(false);
                    hqbuiltin.setSelected(false);
                    System.out.println(rs.getString(60));

                    String commString = rs.getString(60).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Built-in \n" +
                                    "Wardrobe":
                                hqbuiltin.setSelected(true);
                                break;
                            case "High-Powder\n" +
                                    "WC":
                                hqhighpowder.setSelected(true);
                                break;
                            case "Jacuzzi/\n" +
                                    "Sauna":
                                hqjacuzzi.setSelected(true);
                                break;
                            case "Kitchen \n" +
                                    "Cabinet":
                                hqkitchencabinet.setSelected(true);
                                break;
                            case "None":
                                hqnone.setSelected(true);
                                break;
                            case "Wash hand\n" +
                                    "Basin":
                                hqwashhand.setSelected(true);
                                break;
                            default:
                                hqwashhand.setSelected(false);
                                hqnone.setSelected(false);
                                hqkitchencabinet.setSelected(false);
                                hqjacuzzi.setSelected(false);
                                hqhighpowder.setSelected(false);
                                hqbuiltin.setSelected(false);
                        }
                    }
                } else {
                    hqwashhand.setSelected(false);
                    hqnone.setSelected(false);
                    hqkitchencabinet.setSelected(false);
                    hqjacuzzi.setSelected(false);
                    hqhighpowder.setSelected(false);
                    hqbuiltin.setSelected(false);
                }
                //cbgq
                if (rs.getString(61) != null) {
                    gqwesterntoilet.setSelected(false);
                    gqwashhand.setSelected(false);
                    gqnone.setSelected(false);
                    gqkitchen.setSelected(false);
                    gqbuiltin.setSelected(false);
                    gqbathtubs.setSelected(false);
                    System.out.println(rs.getString(61));

                    String commString = rs.getString(61).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Bath Tubs":
                                gqbathtubs.setSelected(true);
                                break;
                            case "Built-in \n" +
                                    "Wardrobe":
                                gqbuiltin.setSelected(true);
                                break;
                            case "Kitchen \n" +
                                    "Cupboards":
                                gqkitchen.setSelected(true);
                                break;
                            case "None":
                                gqnone.setSelected(true);
                                break;
                            case "Wash hand\n" +
                                    "Basin":
                                gqwashhand.setSelected(true);
                                break;
                            case "Western Toilet/\n" +
                                    "Eastern WC":
                                gqwesterntoilet.setSelected(true);
                                break;
                            default:
                                gqwesterntoilet.setSelected(false);
                                gqwashhand.setSelected(false);
                                gqnone.setSelected(false);
                                gqkitchen.setSelected(false);
                                gqbuiltin.setSelected(false);
                                gqbathtubs.setSelected(false);
                        }
                    }
                } else {
                    gqwesterntoilet.setSelected(false);
                    gqwashhand.setSelected(false);
                    gqnone.setSelected(false);
                    gqkitchen.setSelected(false);
                    gqbuiltin.setSelected(false);
                    gqbathtubs.setSelected(false);
                }

                //cbamenit
                if (rs.getString(62) != null) {
                    amenitiespool.setSelected(false);
                    amenitiesnone.setSelected(false);
                    amenitieslift.setSelected(false);
                    amenitiesfire.setSelected(false);
                    amenitiescentralcooling.setSelected(false);
                    System.out.println(rs.getString(62));

                    String commString = rs.getString(62).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Central Cooling\n" +
                                    "System":
                                amenitiescentralcooling.setSelected(true);
                                break;
                            case "Fire Fighting\n" +
                                    "System":
                                amenitiesfire.setSelected(true);
                                break;
                            case "Lift/\n" +
                                    "Escalator":
                                amenitieslift.setSelected(true);
                                break;
                            case "None":
                                amenitiesnone.setSelected(true);
                                break;
                            case "Swimming Pool":
                                amenitiespool.setSelected(true);
                                break;
                            default:
                                amenitiespool.setSelected(false);
                                amenitiesnone.setSelected(false);
                                amenitieslift.setSelected(false);
                                amenitiesfire.setSelected(false);
                                amenitiescentralcooling.setSelected(false);
                        }
                    }
                } else {
                    amenitiespool.setSelected(false);
                    amenitiesnone.setSelected(false);
                    amenitieslift.setSelected(false);
                    amenitiesfire.setSelected(false);
                    amenitiescentralcooling.setSelected(false);
                }

                this.exllent.setValue(rs.getString(63));
                this.good.setValue(rs.getString(64));
                this.fair.setValue(rs.getString(65));
                this.poor.setValue(rs.getString(66));

                //cbroad
                if (rs.getString(67) != null) {
                    roadtarmac.setSelected(false);
                    roadother.setSelected(false);
                    roadnone.setSelected(false);
                    roadmurram.setSelected(false);
                    roadfootpath.setSelected(false);
                    roadearth.setSelected(false);
                    System.out.println(rs.getString(67));

                    String commString = rs.getString(67).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Earth":
                                roadearth.setSelected(true);
                                break;
                            case "Footpath":
                                roadfootpath.setSelected(true);
                                break;
                            case "Murram/Gravel":
                                roadmurram.setSelected(true);
                                break;
                            case "None":
                                roadnone.setSelected(true);
                                break;
                            case "Other":
                                roadother.setSelected(true);
                                break;
                            case "Tarmac":
                                roadtarmac.setSelected(true);
                                break;
                            default:
                                roadtarmac.setSelected(false);
                                roadother.setSelected(false);
                                roadnone.setSelected(false);
                                roadmurram.setSelected(false);
                                roadfootpath.setSelected(false);
                                roadearth.setSelected(false);
                        }
                    }
                } else {
                    roadtarmac.setSelected(false);
                    roadother.setSelected(false);
                    roadnone.setSelected(false);
                    roadmurram.setSelected(false);
                    roadfootpath.setSelected(false);
                    roadearth.setSelected(false);
                }

                //cbroad
                if (rs.getString(68) != null) {
                    fencetimber.setSelected(false);
                    fencesteel.setSelected(false);
                    fenceplant.setSelected(false);
                    fencenone.setSelected(false);
                    fencehydraform.setSelected(false);
                    fencechainlink.setSelected(false);
                    fencecement.setSelected(false);
                    System.out.println(rs.getString(68));

                    String commString = rs.getString(68).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Cement Blocks":
                                fencecement.setSelected(true);
                                break;
                            case "Chain Link":
                                fencechainlink.setSelected(true);
                                break;
                            case "Hydraform":
                                fencehydraform.setSelected(true);
                                break;
                            case "None":
                                fencenone.setSelected(true);
                                break;
                            case "Plant/Hedge":
                                fenceplant.setSelected(true);
                                break;
                            case "Steel":
                                fencesteel.setSelected(true);
                                break;
                            case "Timber":
                                fencetimber.setSelected(true);
                                break;
                            default:
                                fencetimber.setSelected(false);
                                fencesteel.setSelected(false);
                                fenceplant.setSelected(false);
                                fencenone.setSelected(false);
                                fencehydraform.setSelected(false);
                                fencechainlink.setSelected(false);
                                fencecement.setSelected(false);
                        }
                    }
                } else {
                    fencetimber.setSelected(false);
                    fencesteel.setSelected(false);
                    fenceplant.setSelected(false);
                    fencenone.setSelected(false);
                    fencehydraform.setSelected(false);
                    fencechainlink.setSelected(false);
                    fencecement.setSelected(false);
                }

                //cbcomp
                if (rs.getString(69) != null) {
                    compoundother.setSelected(false);
                    compoundtarmac.setSelected(false);
                    compoundnone.setSelected(false);
                    compoundlawn.setSelected(false);
                    compoundinterblocks.setSelected(false);
                    compoundconcrete.setSelected(false);
                    System.out.println(rs.getString(69));

                    String commString = rs.getString(69).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Concrete/Slabs":
                                compoundconcrete.setSelected(true);
                                break;
                            case "Interlocking Blocks":
                                compoundinterblocks.setSelected(true);
                                break;
                            case "Lawn/Garden":
                                compoundlawn.setSelected(true);
                                break;
                            case "None":
                                compoundnone.setSelected(true);
                                break;
                            case "Tarmac":
                                compoundtarmac.setSelected(true);
                                break;
                            case "Other":
                                compoundother.setSelected(true);
                                break;
                            default:
                                compoundother.setSelected(false);
                                compoundtarmac.setSelected(false);
                                compoundnone.setSelected(false);
                                compoundlawn.setSelected(false);
                                compoundinterblocks.setSelected(false);
                                compoundconcrete.setSelected(false);
                        }
                    }
                } else {
                    compoundother.setSelected(false);
                    compoundtarmac.setSelected(false);
                    compoundnone.setSelected(false);
                    compoundlawn.setSelected(false);
                    compoundinterblocks.setSelected(false);
                    compoundconcrete.setSelected(false);
                }
                //cbobno1
                if (rs.getString(71) != null) {
                    obno1workshop.setSelected(false);
                    obno1store.setSelected(false);
                    obno1servants.setSelected(false);
                    obno1other.setSelected(false);
                    obno1garage.setSelected(false);
                    System.out.println(rs.getString(71));

                    String commString = rs.getString(71).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Garage":
                                obno1garage.setSelected(true);
                                break;
                            case "Other":
                                obno1other.setSelected(true);
                                break;
                            case "Servants Qtrs":
                                obno1servants.setSelected(true);
                                break;
                            case "Store":
                                obno1store.setSelected(true);
                                break;
                            case "Workshop":
                                obno1workshop.setSelected(true);
                                break;
                            default:
                                obno1workshop.setSelected(false);
                                obno1store.setSelected(false);
                                obno1servants.setSelected(false);
                                obno1other.setSelected(false);
                                obno1garage.setSelected(false);
                        }
                    }
                } else {
                    obno1workshop.setSelected(false);
                    obno1store.setSelected(false);
                    obno1servants.setSelected(false);
                    obno1other.setSelected(false);
                    obno1garage.setSelected(false);
                }
                //cbobnone
                if (rs.getString(70) != null) {
                    obnone.setSelected(false);
                    System.out.println(rs.getString(70));

                    String commString = rs.getString(70).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "None":
                                obnone.setSelected(true);
                                break;
                            default:
                                obnone.setSelected(false);
                        }
                    }
                } else {
                    obnone.setSelected(false);
                }

                String ob1 = rs.getString(72);
                obno1hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                               @Override
                                               public void handle(ActionEvent e) {
                                                   try {
                                                       Desktop.getDesktop().browse(new URI(ob1));
                                                   } catch (IOException e1) {
                                                       e1.printStackTrace();
                                                   } catch (URISyntaxException e1) {
                                                       e1.printStackTrace();
                                                   }
                                               }
                                           }
                );

                //cbobno2
                if (rs.getString(73) != null) {
                    obno2workshop.setSelected(false);
                    obno2store.setSelected(false);
                    obno2servants.setSelected(false);
                    obno2other.setSelected(false);
                    obno2garage.setSelected(false);
                    System.out.println(rs.getString(73));

                    String commString = rs.getString(73).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Garage":
                                obno2garage.setSelected(true);
                                break;
                            case "Other":
                                obno2other.setSelected(true);
                                break;
                            case "Servants Qtrs":
                                obno2servants.setSelected(true);
                                break;
                            case "Store":
                                obno2store.setSelected(true);
                                break;
                            case "Workshop":
                                obno2workshop.setSelected(true);
                                break;
                            default:
                                obno2workshop.setSelected(false);
                                obno2store.setSelected(false);
                                obno2servants.setSelected(false);
                                obno2other.setSelected(false);
                                obno2garage.setSelected(false);
                        }
                    }
                } else {
                    obno2workshop.setSelected(false);
                    obno2store.setSelected(false);
                    obno2servants.setSelected(false);
                    obno2other.setSelected(false);
                    obno2garage.setSelected(false);
                }

                String ob2 = rs.getString(74);
                obno2hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                               @Override
                                               public void handle(ActionEvent e) {
                                                   try {
                                                       Desktop.getDesktop().browse(new URI(ob2));
                                                   } catch (IOException e1) {
                                                       e1.printStackTrace();
                                                   } catch (URISyntaxException e1) {
                                                       e1.printStackTrace();
                                                   }
                                               }
                                           }
                );

                //cbobno3
                if (rs.getString(75) != null) {
                    obno3workshop.setSelected(false);
                    obno3store.setSelected(false);
                    obno3servants.setSelected(false);
                    obno3other.setSelected(false);
                    obno3garage.setSelected(false);
                    System.out.println(rs.getString(75));

                    String commString = rs.getString(75).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Garage":
                                obno3garage.setSelected(true);
                                break;
                            case "Other":
                                obno3other.setSelected(true);
                                break;
                            case "Servants Qtrs":
                                obno3servants.setSelected(true);
                                break;
                            case "Store":
                                obno3store.setSelected(true);
                                break;
                            case "Workshop":
                                obno3workshop.setSelected(true);
                                break;
                            default:
                                obno3workshop.setSelected(false);
                                obno3store.setSelected(false);
                                obno3servants.setSelected(false);
                                obno3other.setSelected(false);
                                obno3garage.setSelected(false);
                        }
                    }
                } else {
                    obno3workshop.setSelected(false);
                    obno3store.setSelected(false);
                    obno3servants.setSelected(false);
                    obno3other.setSelected(false);
                    obno3garage.setSelected(false);
                }

                String ob3 = rs.getString(76);
                obno3hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                               @Override
                                               public void handle(ActionEvent e) {
                                                   try {
                                                       Desktop.getDesktop().browse(new URI(ob3));
                                                   } catch (IOException e1) {
                                                       e1.printStackTrace();
                                                   } catch (URISyntaxException e1) {
                                                       e1.printStackTrace();
                                                   }
                                               }
                                           }
                );

                //cbobno4
                if (rs.getString(77) != null) {
                    obno4workshop.setSelected(false);
                    obno4store.setSelected(false);
                    obno4servants.setSelected(false);
                    obno4other.setSelected(false);
                    obno4garage.setSelected(false);
                    System.out.println(rs.getString(77));

                    String commString = rs.getString(77).replace("[", "").replace("]", "");
                    System.out.println(commString);

                    List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                    System.out.println(commList);

                    for (String comm : commList) {
                        switch (comm) {
                            case "Garage":
                                obno4garage.setSelected(true);
                                break;
                            case "Other":
                                obno4other.setSelected(true);
                                break;
                            case "Servants Qtrs":
                                obno4servants.setSelected(true);
                                break;
                            case "Store":
                                obno4store.setSelected(true);
                                break;
                            case "Workshop":
                                obno4workshop.setSelected(true);
                                break;
                            default:
                                obno4workshop.setSelected(false);
                                obno4store.setSelected(false);
                                obno4servants.setSelected(false);
                                obno4other.setSelected(false);
                                obno4garage.setSelected(false);
                        }
                    }
                } else {
                    obno4workshop.setSelected(false);
                    obno4store.setSelected(false);
                    obno4servants.setSelected(false);
                    obno4other.setSelected(false);
                    obno4garage.setSelected(false);
                }

                String ob4 = rs.getString(78);
                obno4hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                               @Override
                                               public void handle(ActionEvent e) {
                                                   try {
                                                       Desktop.getDesktop().browse(new URI(ob4));
                                                   } catch (IOException e1) {
                                                       e1.printStackTrace();
                                                   } catch (URISyntaxException e1) {
                                                       e1.printStackTrace();
                                                   }
                                               }
                                           }
                );

                Image image1 = new Image(rs.getBinaryStream(79));
                sketchphoto.setImage(image1);


                Image image2 = new Image(rs.getBinaryStream(80));
                buildphoto1.setImage(image2);

                Image image3 = new Image(rs.getBinaryStream(81));
                buildphoto2.setImage(image3);

                this.noofbaths.setText(rs.getString(82));
                this.nooftoilets.setText(rs.getString(83));
                this.mblen.setText(rs.getString(84));
                this.mbwid.setText(rs.getString(85));
                this.mbarea.setText(rs.getString(86));
                this.mbredfact.setText(rs.getString(87));
                this.mbcompfact.setText(rs.getString(88));
                this.mbredfactarea.setText(rs.getString(89));
                this.ob1len.setText(rs.getString(90));
                this.ob1wid.setText(rs.getString(91));
                this.ob1area.setText(rs.getString(92));
                this.ob1redfact.setText(rs.getString(93));
                this.ob1compfact.setText(rs.getString(94));
                this.ob1redfactarea.setText(rs.getString(95));
                this.ob2len.setText(rs.getString(96));
                this.ob2wid.setText(rs.getString(97));
                this.ob2area.setText(rs.getString(98));
                this.ob2redfact.setText(rs.getString(99));
                this.ob2compfact.setText(rs.getString(100));
                this.ob2redfactarea.setText(rs.getString(101));
                this.ob3len.setText(rs.getString(102));
                this.ob3wid.setText(rs.getString(103));
                this.ob3area.setText(rs.getString(104));
                this.ob3redfact.setText(rs.getString(105));
                this.ob3compfact.setText(rs.getString(106));
                this.ob3redfactarea.setText(rs.getString(107));
                this.ob4len.setText(rs.getString(108));
                this.ob4wid.setText(rs.getString(109));
                this.ob4area.setText(rs.getString(110));
                this.ob4redfact.setText(rs.getString(111));
                this.ob4compfact.setText(rs.getString(112));
                this.ob4redfactarea.setText(rs.getString(113));
                this.totalrfa.setText(rs.getString(114));
                this.totalrfasqr.setText(rs.getString(115));
                this.multiplybyall.setText(rs.getString(116));
                this.currentreplacementcost.setText(rs.getString(117));
                this.lessdeprec.setText(rs.getString(118));
                this.deprecreplacementcost.setText(rs.getString(119));
                this.inspectedby.setText(rs.getString(120));
                this.checkedby.setText(rs.getString(121));
                this.approvedby.setText(rs.getString(122));
                this.companyname.setText(rs.getString(123));
                this.companystamp.setText(rs.getString(124));
                ((TextField) certifieddate.getEditor()).setText(rs.getString(125));
                this.tin.setText(rs.getString(126));
                this.docrefyear1.setText(rs.getString(1) + "   " + rs.getString(24) + "   " + rs.getString(25));
                path.setText(rs.getString(79));
                path1.setText(rs.getString(80));
                path11.setText(rs.getString(81));
            }
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println("Error occured " + e);
        }
    }

    @FXML
    public void addBlock(ActionEvent event) {

        String sql = "INSERT INTO `block`(`OWNERFN`, `YEAR`, `OBJECTNO`, `PAGENO`, `PWARD`, `PMTAA`, `PRATEBLOCK`, `POBJECT`, `PBUILDINGNO`, `PLSTREET`, `PLPLOTNO`, `PLSURVEYBLOCK`, `PLEXISTINGPROP`, `PLMAPREF`, `INDIVFN`, `INDIVMN`, `INDIVLN`, `INDIVPH1`, `INDIVPH2`, `LEGALFCN`, `LEGALPH1`, `LEGALPH2`, `ID`, `OWNERMN`, `OWNERLN`, `OWNERPH1`, `OWNERPH2`, `OWNERPSTREET`, `OWNERPLOTNO`, `OWNERPOBOX`, `OWNERREGION`, `OWNERDISTRICT`, `OWNERWARD`, `OWNERMTAA`, `OWNEREMAIL`, `TENURE`, `LAND`, `ACTUALTRANSACTION`, `TRANSACTIONDATE`, `SOI`, `NOSTORIES`, `COMPLETE`, `COMIND`, `INSTI`, `RES`, `COYEAR`, `RECOYEAR`, `ROOF`, `EXTWALL`, `EXTFIN`, `WINDOWS`, `DOORS`, `FLOOR`, `CEILING`, `NOFLOOR`, `NOROOM`, `WATER`, `DRAINAGE`, `ELECTRICITY`, `HQ`, `GQ`, `AMENIT`, `EXLLENT`, `GOOD`, `FAIR`, `POOR`, `ROAD`, `FENCE`, `COMP`, `OBNONE`, `OB1`, `OB1HYPERLINK`, `OB2`, `OB2HYPERLINK`, `OB3`, `OB3HYPERLINK`, `OB4`, `OB4HYPERLINK`, `SKETCH`, `BULDHPHOTO1`, `BULDHPHOTO2`, `BATHS`, `TOILETS`, `MLEN`, `MWID`, `MAREA`, `MREDFACT`, `MCOMPFACT`, `MREDFACTAREA`, `OB1LEN`, `OB1WID`, `OB1AREA`, `OB1REDFACT`, `OB1COMPFACT`, `OB1REDFACTAREA`, `OB2LEN`, `OB2WID`, `OB2AREA`, `OB2REDFACT`, `OB2COMPFACT`, `OB2REDFACTAREA`, `OB3LEN`, `OB3WID`, `OB3AREA`, `OB3REDFACT`, `OB3COMPFACT`, `OB3REDFACTAREA`, `OB4LEN`, `OB4WID`, `OB4AREA`, `OB4REDFACT`, `OB4COMPFACT`, `OB4REDFACTAREA`, `TOTALRFA`, `TOTALRFASQR`, `MULTIPLYBTALL`, `CURRENTREPLACEMENT`, `LESSDEPREC`, `DEPRECREPLACEMENT`, `INSPECTEDBY`, `CHECKEDBY`, `APPROVEDBY`, `COMPANYNAME`, `COMPANYSTAMP`, `CERTIFIEDDATE`, `TIN`, `NonRateable`, `INDIVIDUAL`, `LegalEntity`, `DATANO`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, this.ownerinfofirstname.getText());
            stmt.setString(2, this.docrefyear.getText());
            stmt.setString(3, this.docrefobjectno.getText());
            stmt.setString(4, this.docrefpageno.getText());
            stmt.setString(5, this.proprefward.getText());
            stmt.setString(6, this.proprefmtaa.getText());
            stmt.setString(7, this.proprefrateblock.getText());
            stmt.setString(8, this.proprefobjectno.getText());
            stmt.setString(9, this.proprefbuildingno.getText());


            stmt.setString(10, this.proplocstreet.getText());
            stmt.setString(11, this.proplocplotno.getText());
            stmt.setString(12, this.proplocsurveyblock.getText());
            stmt.setString(13, this.proplocexistingrefno.getText());
            stmt.setString(14, this.proplocmapreference.getText());

            stmt.setString(15, this.individualfirstname.getText());
            stmt.setString(16, this.individualmiddlename.getText());
            stmt.setString(17, this.individuallastname.getText());
            stmt.setString(18, this.individualphone1.getText());
            stmt.setString(19, this.individualphone2.getText());

            stmt.setString(20, this.legalentityfullcompanyname.getText());
            stmt.setString(21, this.legalentityphone1.getText());
            stmt.setString(22, this.legalentityphone2.getText());
            stmt.setString(23, this.id.getText());
            stmt.setString(24, this.ownerinfomiddlename.getText());
            stmt.setString(25, this.ownerinfolastname.getText());
            stmt.setString(26, this.ownerinfophone1.getText());
            stmt.setString(27, this.ownerinfophone2.getText());
            stmt.setString(28, this.ownerinfostreet.getText());
            stmt.setString(29, this.ownerinfoplotno.getText());
            stmt.setString(30, this.ownerinfopobox.getText());
            stmt.setString(31, this.ownerinforegion.getText());
            stmt.setString(32, this.ownerinfodistrict.getText());
            stmt.setString(33, this.ownerinfoward.getText());
            stmt.setString(34, this.ownerinfomtaa.getText());
            stmt.setString(35, this.ownerinfoemail.getText());
            if (tenurelease.isSelected()){
                checkTenure.add(tenurelease.getText());
            }
            if (tenureresoccupier.isSelected()){
                checkTenure.add(tenureresoccupier.getText());
            }
            if (tenurereslicensee.isSelected()){
                checkTenure.add(tenurereslicensee.getText());
            }
            if (tenureuntitled.isSelected()){
                checkTenure.add(tenureuntitled.getText());
            }

            stmt.setString(36, checkTenure.toString());

            if (landuseindustrial.isSelected()){
                checkLand.add(landuseindustrial.getText());
            }
            if (landuseinstitution.isSelected()){
                checkLand.add(landuseinstitution.getText());
            }
            if (landusecommres.isSelected()){
                checkLand.add(landusecommres.getText());
            }
            if (landusecommercial.isSelected()){
                checkLand.add(landusecommercial.getText());
            }
            if (landuseresidential.isSelected()){
                checkLand.add(landuseresidential.getText());
            }
            if (landuseother.isSelected()){
                checkLand.add(landuseother.getText());
            }
            stmt.setString(37, checkLand.toString());

            stmt.setString(38, this.actualtransaction.getText());
            stmt.setString(39, this.transactiondate.getEditor().getText());

            if (sourceofinfogovt.isSelected()){
                checkSoi.add(sourceofinfogovt.getText());
            }
            if (sourceofinfobuyer.isSelected()){
                checkSoi.add(sourceofinfobuyer.getText());
            }
            if (sourceofinfonotary.isSelected()){
                checkSoi.add(sourceofinfonotary.getText());
            }
            if (sourceofinfovaluer.isSelected()){
                checkSoi.add(sourceofinfovaluer.getText());
            }
            if (sourceofinfobank.isSelected()){
                checkSoi.add(sourceofinfobank.getText());
            }
            if (sourceofinfoother.isSelected()){
                checkSoi.add(sourceofinfoother.getText());
            }
            if (sourceofinfobroker.isSelected()){
                checkSoi.add(sourceofinfobroker.getText());
            }
            stmt.setString(40, checkSoi.toString());

            stmt.setString(41, this.noofstories.getText());
            stmt.setString(42, this.complete.getText());

            if (commstoragetank.isSelected()){
                checkComind.add(commstoragetank.getText());
            }
            if (commshopresta.isSelected()){
                checkComind.add(commshopresta.getText());
            }
            if (commpetrolstation.isSelected()){
                checkComind.add(commpetrolstation.getText());
            }
            if (commother.isSelected()){
                checkComind.add(commother.getText());
            }
            if (commofficebank.isSelected()){
                checkComind.add(commofficebank.getText());
            }
            if (commmallstore.isSelected()){
                checkComind.add(commmallstore.getText());
            }
            if (commhotel.isSelected()){
                checkComind.add(commhotel.getText());
            }
            if (commfactorywarehouse.isSelected()){
                checkComind.add(commfactorywarehouse.getText());
            }
            stmt.setString(43, checkComind.toString());

            if (instischool.isSelected()){
                checkInsti.add(instischool.getText());
            }
            if (instisport.isSelected()){
                checkInsti.add(instisport.getText());
            }
            if (instigovt.isSelected()){
                checkInsti.add(instigovt.getText());
            }
            if (instiworship.isSelected()){
                checkInsti.add(instiworship.getText());
            }
            if (instiother.isSelected()){
                checkInsti.add(instiother.getText());
            }
            if (insticlinical.isSelected()){
                checkInsti.add(insticlinical.getText());
            }

            stmt.setString(44, checkInsti.toString());
            if (resvilla.isSelected()){
                checkRes.add(resvilla.getText());
            }
            if (ressemidetached.isSelected()){
                checkRes.add(ressemidetached.getText());
            }
            if (resother.isSelected()){
                checkRes.add(resother.getText());
            }
            if (resmaisonette.isSelected()){
                checkRes.add(resmaisonette.getText());
            }
            if (resdetatached.isSelected()){
                checkRes.add(resdetatached.getText());
            }
            if (resapartment.isSelected()){
                checkRes.add(resapartment.getText());
            }
            stmt.setString(45, checkRes.toString());

            stmt.setString(46, this.coyear.getEditor().getText());
            stmt.setString(47, this.recoyear.getEditor().getText());

            if (roofgrass.isSelected()){
                checkRoof.add(roofgrass.getText());
            }
            if (roofother.isSelected()){
                checkRoof.add(roofother.getText());
            }
            if (rooftilescement.isSelected()){
                checkRoof.add(rooftilescement.getText());
            }
            if (roofironsheet.isSelected()){
                checkRoof.add(roofironsheet.getText());
            }
            if (roofharveytiles.isSelected()){
                checkRoof.add(roofharveytiles.getText());
            }
            if (roofconcrete.isSelected()){
                checkRoof.add(roofconcrete.getText());
            }if (roofasbestos.isSelected()){
                checkRoof.add(roofasbestos.getText());
            }
            stmt.setString(48, checkRoof.toString());

            if (exteriorwallother.isSelected()){
                checkExtwall.add(exteriorwallother.getText());
            }
            if (exteriorwallmud.isSelected()){
                checkExtwall.add(exteriorwallmud.getText());
            }
            if (exteriorwallhydraform.isSelected()){
                checkExtwall.add(exteriorwallhydraform.getText());
            }
            if (exteriorwalltimber.isSelected()){
                checkExtwall.add(exteriorwalltimber.getText());
            }
            if (exteriorwallglass.isSelected()){
                checkExtwall.add(exteriorwallglass.getText());
            }
            if (exteriorwallconcframe.isSelected()){
                checkExtwall.add(exteriorwallconcframe.getText());
            }if (exteriorwallconcframe.isSelected()){
                checkExtwall.add(exteriorwallconcframe.getText());
            }
            if (exteriorwallburntbricks.isSelected()){
                checkExtwall.add(exteriorwallburntbricks.getText());
            }

            stmt.setString(49, checkExtwall.toString());
            if (exteriorfinishglazed.isSelected()){
                checkExtfin.add(exteriorfinishglazed.getText());
            }
            if (exteriorfinishcompact.isSelected()){
                checkExtfin.add(exteriorfinishcompact.getText());
            }
            if (exteriorfinishfair.isSelected()){
                checkExtfin.add(exteriorfinishfair.getText());
            }
            if (exteriorfinishother.isSelected()){
                checkExtfin.add(exteriorfinishother.getText());
            }
            if (exteriorfinishplaster.isSelected()){
                checkExtfin.add(exteriorfinishplaster.getText());
            }
            if (exteriorfinishtiles.isSelected()){
                checkExtfin.add(exteriorfinishtiles.getText());
            }if (exteriorfinishtyrolean.isSelected()){
                checkExtfin.add(exteriorfinishtyrolean.getText());
            }

            stmt.setString(50, checkExtfin.toString());

            if (windowswoodcasement.isSelected()){
                checkWin.add(windowswoodcasement.getText());
            }
            if (windowswoodabb.isSelected()){
                checkWin.add(windowswoodabb.getText());
            }
            if (windowssteelframe.isSelected()){
                checkWin.add(windowssteelframe.getText());
            }
            if (windowsother.isSelected()){
                checkWin.add(windowsother.getText());
            }
            if (windowsglass.isSelected()){
                checkWin.add(windowsglass.getText());
            }
            if (windowsaluframe.isSelected()){
                checkWin.add(windowsaluframe.getText());
            }

            stmt.setString(51, checkWin.toString());
            if (doorssteelshutters.isSelected()){
                checkDor.add(doorssteelshutters.getText());
            }
            if (doorswoodflush.isSelected()){
                checkDor.add(doorssteelshutters.getText());
            }
            if (doorswoodbattens.isSelected()){
                checkDor.add(doorswoodbattens.getText());
            }
            if (doorssteelsheets.isSelected()){
                checkDor.add(doorssteelsheets.getText());
            }
            if (doorsother.isSelected()){
                checkDor.add(doorsother.getText());
            }
            if (doorsalu.isSelected()){
                checkDor.add(doorsalu.getText());
            }

            stmt.setString(52, checkDor.toString());
            if (floorwood.isSelected()){
                checkDor.add(floorwood.getText());
            }
            if (floortiles.isSelected()){
                checkFlor.add(floortiles.getText());
            }
            if (floorother.isSelected()){
                checkFlor.add(floorother.getText());
            }
            if (floormarble.isSelected()){
                checkFlor.add(floormarble.getText());
            }
            if (floorinsitu.isSelected()){
                checkFlor.add(floorinsitu.getText());
            }
            if (floorcompact.isSelected()){
                checkFlor.add(floorcompact.getText());
            }
            if (floorcement.isSelected()){
                checkFlor.add(floorcement.getText());
            }
            stmt.setString(53, checkFlor.toString());
            if (ceilingsuspended.isSelected()){
                checkCel.add(ceilingsuspended.getText());
            }
            if (ceilingsoftboard.isSelected()){
                checkCel.add(ceilingsoftboard.getText());
            }
            if (ceilingplaster.isSelected()){
                checkCel.add(ceilingplaster.getText());
            }
            if (ceilingother.isSelected()){
                checkCel.add(ceilingother.getText());
            }
            if (ceilinggypsum.isSelected()){
                checkCel.add(ceilinggypsum.getText());
            }
            if (ceilingchipboard.isSelected()){
                checkCel.add(ceilingchipboard.getText());
            }
            if (ceilingwood.isSelected()){
                checkCel.add(ceilingwood.getText());
            }
            stmt.setString(54, checkCel.toString());

            stmt.setString(55, this.nofloor.getText());
            stmt.setString(56, this.noroom.getText());

            if (waterriver.isSelected()){
                checkWater.add(waterriver.getText());
            }
            if (waterstandtap.isSelected()){
                checkWater.add(waterstandtap.getText());
            }
            if (waterrain.isSelected()){
                checkWater.add(waterrain.getText());
            }
            if (waternone.isSelected()){
                checkWater.add(waternone.getText());
            }
            if (watermains.isSelected()){
                checkWater.add(watermains.getText());
            }
            if (waterborehole.isSelected()){
                checkWater.add(waterborehole.getText());
            }

            stmt.setString(57, checkWater.toString());
            if (drainagesewer.isSelected()){
                checkDrainage.add(drainagesewer.getText());
            }
            if (drainageptictank.isSelected()){
                checkDrainage.add(drainageptictank.getText());
            }
            if (drainagepitlatrine.isSelected()){
                checkDrainage.add(drainagepitlatrine.getText());
            }
            if (drainageother.isSelected()){
                checkDrainage.add(drainageother.getText());
            }
            if (drainagenone.isSelected()){
                checkDrainage.add(drainagenone.getText());
            }
            stmt.setString(58, checkDrainage.toString());
            if (electricitymains.isSelected()){
                checkElectricity.add(electricitymains.getText());
            }
            if (electricitynone.isSelected()){
                checkElectricity.add(electricitynone.getText());
            }
            if (electricitysolar.isSelected()){
                checkElectricity.add(electricitysolar.getText());
            }

            stmt.setString(59, checkElectricity.toString());
            if (hqwashhand.isSelected()){
                checkHq.add(hqwashhand.getText());
            }
            if (hqnone.isSelected()){
                checkHq.add(hqnone.getText());
            }
            if (hqkitchencabinet.isSelected()){
                checkHq.add(hqkitchencabinet.getText());
            }
            if (hqjacuzzi.isSelected()){
                checkHq.add(hqjacuzzi.getText());
            }
            if (hqhighpowder.isSelected()){
                checkHq.add(hqhighpowder.getText());
            }if (hqbuiltin.isSelected()){
                checkHq.add(hqbuiltin.getText());
            }

            stmt.setString(60, checkHq.toString());
            if (gqwesterntoilet.isSelected()){
                checkGq.add(gqwesterntoilet.getText());
            }
            if (gqwashhand.isSelected()){
                checkGq.add(gqwashhand.getText());
            }
            if (gqnone.isSelected()){
                checkGq.add(gqnone.getText());
            }
            if (gqkitchen.isSelected()){
                checkGq.add(gqkitchen.getText());
            }
            if (gqbuiltin.isSelected()){
                checkGq.add(gqbuiltin.getText());
            }if (gqbathtubs.isSelected()){
                checkGq.add(gqbathtubs.getText());
            }

            stmt.setString(61, checkGq.toString());
            if (amenitiespool.isSelected()){
                checkGq.add(amenitiespool.getText());
            }
            if (amenitiesnone.isSelected()){
                checkGq.add(amenitiesnone.getText());
            }
            if (amenitieslift.isSelected()){
                checkGq.add(amenitieslift.getText());
            }
            if (amenitiesfire.isSelected()){
                checkGq.add(amenitiesfire.getText());
            }
            if (amenitiescentralcooling.isSelected()){
                checkGq.add(amenitiescentralcooling.getText());
            }
            stmt.setString(62, checkAmenit.toString());

            if (roadearth.isSelected()){
                checkRoad.add(roadearth.getText());
            }
            if (roadtarmac.isSelected()){
                checkRoad.add(roadtarmac.getText());
            }
            if (roadother.isSelected()){
                checkRoad.add(roadother.getText());
            }
            if (roadnone.isSelected()){
                checkRoad.add(roadnone.getText());
            }
            if (roadmurram.isSelected()){
                checkRoad.add(roadmurram.getText());
            }if (roadfootpath.isSelected()){
                checkRoad.add(roadfootpath.getText());
            }
            stmt.setString(67, checkRoad.toString());
            if (fencetimber.isSelected()){
                checkFence.add(fencetimber.getText());
            }
            if (fencesteel.isSelected()){
                checkFence.add(fencesteel.getText());
            }
            if (fenceplant.isSelected()){
                checkFence.add(fenceplant.getText());
            }
            if (fencenone.isSelected()){
                checkFence.add(fencenone.getText());
            }
            if (fencehydraform.isSelected()){
                checkFence.add(fencehydraform.getText());
            }if (fencechainlink.isSelected()){
                checkFence.add(fencechainlink.getText());
            }if (fencecement.isSelected()){
                checkFence.add(fencecement.getText());
            }
            stmt.setString(68, checkFence.toString());
            if (compoundother.isSelected()){
                checkComp.add(compoundother.getText());
            }
            if (compoundtarmac.isSelected()){
                checkComp.add(compoundtarmac.getText());
            }
            if (compoundnone.isSelected()){
                checkComp.add(compoundnone.getText());
            }
            if (compoundlawn.isSelected()){
                checkComp.add(compoundlawn.getText());
            }
            if (compoundinterblocks.isSelected()){
                checkComp.add(compoundinterblocks.getText());
            }if (compoundconcrete.isSelected()){
                checkComp.add(compoundconcrete.getText());
            }
            stmt.setString(69, checkComp.toString());

            if (obnone.isSelected()){
                checkObnone.add(obnone.getText());
            }
            stmt.setString(70, checkObnone.toString());

            if (obno1workshop.isSelected()){
                checkOb1.add(obno1workshop.getText());
            }
            if (obno1store.isSelected()){
                checkOb1.add(obno1store.getText());
            }
            if (obno1servants.isSelected()){
                checkOb1.add(obno1servants.getText());
            }
            if (obno1other.isSelected()){
                checkOb1.add(obno1other.getText());
            }
            if (obno1garage.isSelected()){
                checkOb1.add(obno1garage.getText());
            }
            stmt.setString(71, checkOb1.toString());

            stmt.setString(76, this.path12.getText());
            stmt.setString(78, this.path121.getText());
            stmt.setString(80, this.path1211.getText());
            stmt.setString(82, this.path12111.getText());

            if (obno2workshop.isSelected()){
                checkOb2.add(obno2workshop.getText());
            }
            if (obno2store.isSelected()){
                checkOb2.add(obno2store.getText());
            }
            if (obno2servants.isSelected()){
                checkOb2.add(obno2servants.getText());
            }
            if (obno2other.isSelected()){
                checkOb2.add(obno2other.getText());
            }
            if (obno2garage.isSelected()){
                checkOb2.add(obno2garage.getText());
            }
            stmt.setString(73, checkOb2.toString());

            if (obno3workshop.isSelected()){
                checkOb3.add(obno3workshop.getText());
            }
            if (obno3store.isSelected()){
                checkOb3.add(obno3store.getText());
            }
            if (obno3servants.isSelected()){
                checkOb3.add(obno3servants.getText());
            }
            if (obno3other.isSelected()){
                checkOb3.add(obno3other.getText());
            }
            if (obno3garage.isSelected()){
                checkOb3.add(obno3garage.getText());
            }
            stmt.setString(75, checkOb3.toString());

            if (obno4workshop.isSelected()){
                checkOb4.add(obno4workshop.getText());
            }
            if (obno4store.isSelected()){
                checkOb4.add(obno4store.getText());
            }
            if (obno4servants.isSelected()){
                checkOb4.add(obno4servants.getText());
            }
            if (obno4other.isSelected()){
                checkOb4.add(obno4other.getText());
            }
            if (obno4garage.isSelected()){
                checkOb4.add(obno4garage.getText());
            }
            stmt.setString(77, checkOb4.toString());

            browse.setOnAction(e -> {
                try {
                    Stage chooseStage = new Stage();

                    fileChooser1 = new FileChooser();
                    fileChooser1.getExtensionFilters().addAll(
                            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"),
                            new FileChooser.ExtensionFilter("Text Files", "*txt"),
                            new FileChooser.ExtensionFilter("Pdf Files", "*.pdf"),
                            new FileChooser.ExtensionFilter("All Files", "*.*")
                    );

                    filesketch = fileChooser1.showOpenDialog(chooseStage);
                    if (filesketch != null) {
                        desktop.open(filesketch);

                        path.setText(filesketch.getAbsolutePath());
                    }
                } catch (IOException e1) {
                    Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
                }
            });

            fisChoose1 = new FileInputStream(filesketch);
            stmt.setBinaryStream(79, (InputStream) fisChoose1, (int) filesketch.length());

            build.setOnAction(e -> {
                try {
                    Stage chooseStage = new Stage();

                    fileChooser2 = new FileChooser();
                    fileChooser2.getExtensionFilters().addAll(
                            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"),
                            new FileChooser.ExtensionFilter("Text Files", "*txt"),
                            new FileChooser.ExtensionFilter("Pdf Files", "*.pdf"),
                            new FileChooser.ExtensionFilter("All Files", "*.*")
                    );

                    filebuild1 = fileChooser2.showOpenDialog(chooseStage);
                    if (filebuild1 != null) {
                        desktop.open(filebuild1);
                        path1.setText(filebuild1.getAbsolutePath());
                    }
                } catch (IOException e1) {
                    Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
                }
            });

            fisChoose2 = new FileInputStream(filebuild1);
            stmt.setBinaryStream(80, (InputStream) fisChoose2, (int) filebuild1.length());

            sketchpic.setOnAction(e -> {
                try {
                    Stage chooseStage = new Stage();

                    fileChooser3 = new FileChooser();
                    fileChooser3.getExtensionFilters().addAll(
                            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"),
                            new FileChooser.ExtensionFilter("Text Files", "*txt"),
                            new FileChooser.ExtensionFilter("Pdf Files", "*.pdf"),
                            new FileChooser.ExtensionFilter("All Files", "*.*")
                    );

                    filebuild2 = fileChooser3.showOpenDialog(chooseStage);
                    if (filebuild2 != null) {
                        desktop.open(filebuild2);
                        path11.setText(filebuild2.getAbsolutePath());
                    }
                } catch (IOException e1) {
                    Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
                }
            });

            fisChoose3 = new FileInputStream(filebuild2);
            stmt.setBinaryStream(81, (InputStream) fisChoose3, (int) filebuild2.length());

            stmt.setString(82, this.noofbaths.getText());
            stmt.setString(83, this.nooftoilets.getText());
            stmt.setString(84, this.mblen.getText());
            stmt.setString(85, this.mbwid.getText());
            stmt.setString(86, this.mbarea.getText());
            stmt.setString(87, this.mbredfact.getText());
            stmt.setString(88, this.mbcompfact.getText());
            stmt.setString(89, this.mbredfactarea.getText());
            stmt.setString(90, this.ob1len.getText());
            stmt.setString(91, this.ob1wid.getText());
            stmt.setString(92, this.ob1area.getText());
            stmt.setString(93, this.ob1redfact.getText());
            stmt.setString(94, this.ob1compfact.getText());
            stmt.setString(95, this.ob1redfactarea.getText());
            stmt.setString(96, this.ob2len.getText());
            stmt.setString(97, this.ob2wid.getText());
            stmt.setString(98, this.ob2area.getText());
            stmt.setString(99, this.ob2redfact.getText());
            stmt.setString(100, this.ob2compfact.getText());
            stmt.setString(101, this.ob2redfactarea.getText());
            stmt.setString(102, this.ob3len.getText());
            stmt.setString(103, this.ob3wid.getText());
            stmt.setString(104, this.ob3area.getText());
            stmt.setString(105, this.ob3redfact.getText());
            stmt.setString(106, this.ob3compfact.getText());
            stmt.setString(107, this.ob3redfactarea.getText());
            stmt.setString(108, this.ob4len.getText());
            stmt.setString(109, this.ob4wid.getText());
            stmt.setString(110, this.ob4area.getText());
            stmt.setString(111, this.ob4redfact.getText());
            stmt.setString(112, this.ob4compfact.getText());
            stmt.setString(113, this.ob4redfactarea.getText());
            stmt.setString(114, this.totalrfa.getText());
            stmt.setString(115, this.totalrfasqr.getText());
            stmt.setString(116, this.multiplybyall.getText());
            stmt.setString(117, this.currentreplacementcost.getText());
            stmt.setString(118, this.lessdeprec.getText());
            stmt.setString(119, this.deprecreplacementcost.getText());
            stmt.setString(120, this.inspectedby.getText());
            stmt.setString(121, this.checkedby.getText());
            stmt.setString(122, this.approvedby.getText());
            stmt.setString(123, this.companyname.getText());
            stmt.setString(124, this.companystamp.getText());
            stmt.setString(125, this.certifieddate.getEditor().getText());
            stmt.setString(126, this.tin.getText());
            stmt.setString(130, this.id2.getText());

            if (nonrateable.isSelected()){
                checkRate.add(nonrateable.getText());
            }
            if (nonrateable1.isSelected()){
                checkRate.add(nonrateable1.getText());
            }
            stmt.setString(127, checkRate.toString());

            if (individual.isSelected()){
                checkIndiv.add(individual.getText());
            }
            stmt.setString(128, checkIndiv.toString());

            if (legalentity.isSelected()){
                checkLegal.add(legalentity.getText());
            }
            stmt.setString(129, checkLegal.toString());


            String value1 = (String) exllent.getValue();
            stmt.setString(63, value1);

            String value2 = (String) good.getValue();
            stmt.setString(64, value2);

            String value3 = (String) fair.getValue();
            stmt.setString(65, value3);

            String value4 = (String) poor.getValue();
            stmt.setString(66, value4);


            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Oooooooooops!!!");
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("added");
        alert.setHeaderText(null);
        alert.setContentText("Record have been added Successfully");
        alert.showAndWait();

        clearFields();
        myCombo();

    }

    public void choose(ActionEvent event) {
        String sql = "INSERT INTO `block`(`OWNERFN`, `YEAR`, `OBJECTNO`, `PAGENO`, `PWARD`, `PMTAA`, `PRATEBLOCK`, `POBJECT`, `PBUILDINGNO`, `PLSTREET`, `PLPLOTNO`, `PLSURVEYBLOCK`, `PLEXISTINGPROP`, `PLMAPREF`, `INDIVFN`, `INDIVMN`, `INDIVLN`, `INDIVPH1`, `INDIVPH2`, `LEGALFCN`, `LEGALPH1`, `LEGALPH2`, `ID`, `OWNERMN`, `OWNERLN`, `OWNERPH1`, `OWNERPH2`, `OWNERPSTREET`, `OWNERPLOTNO`, `OWNERPOBOX`, `OWNERREGION`, `OWNERDISTRICT`, `OWNERWARD`, `OWNERMTAA`, `OWNEREMAIL`, `TENURE`, `LAND`, `ACTUALTRANSACTION`, `TRANSACTIONDATE`, `SOI`, `NOSTORIES`, `COMPLETE`, `COMIND`, `INSTI`, `RES`, `COYEAR`, `RECOYEAR`, `ROOF`, `EXTWALL`, `EXTFIN`, `WINDOWS`, `DOORS`, `FLOOR`, `CEILING`, `NOFLOOR`, `NOROOM`, `WATER`, `DRAINAGE`, `ELECTRICITY`, `HQ`, `GQ`, `AMENIT`, `EXLLENT`, `GOOD`, `FAIR`, `POOR`, `ROAD`, `FENCE`, `COMP`, `OBNONE`, `OB1`, `OB1HYPERLINK`, `OB2`, `OB2HYPERLINK`, `OB3`, `OB3HYPERLINK`, `OB4`, `OB4HYPERLINK`, `SKETCH`, `BULDHPHOTO1`, `BULDHPHOTO2`, `BATHS`, `TOILETS`, `MLEN`, `MWID`, `MAREA`, `MREDFACT`, `MCOMPFACT`, `MREDFACTAREA`, `OB1LEN`, `OB1WID`, `OB1AREA`, `OB1REDFACT`, `OB1COMPFACT`, `OB1REDFACTAREA`, `OB2LEN`, `OB2WID`, `OB2AREA`, `OB2REDFACT`, `OB2COMPFACT`, `OB2REDFACTAREA`, `OB3LEN`, `OB3WID`, `OB3AREA`, `OB3REDFACT`, `OB3COMPFACT`, `OB3REDFACTAREA`, `OB4LEN`, `OB4WID`, `OB4AREA`, `OB4REDFACT`, `OB4COMPFACT`, `OB4REDFACTAREA`, `TOTALRFA`, `TOTALRFASQR`, `MULTIPLYBTALL`, `CURRENTREPLACEMENT`, `LESSDEPREC`, `DEPRECREPLACEMENT`, `INSPECTEDBY`, `CHECKEDBY`, `APPROVEDBY`, `COMPANYNAME`, `COMPANYSTAMP`, `CERTIFIEDDATE`, `TIN`, `NonRateable`, `INDIVIDUAL`, `LegalEntity`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            Stage chooseStage = new Stage();

            fileChooser1 = new FileChooser();
            fileChooser1.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*.PNG", "*.JPG", "*.JPEG"),
                    new FileChooser.ExtensionFilter("Text Files", "*txt"),
                    new FileChooser.ExtensionFilter("All Files", "*.*")
            );

            filesketch = fileChooser1.showOpenDialog(chooseStage);
            if (filesketch != null) {
                desktop.open(filesketch);
                path.setText(filesketch.getAbsolutePath());

                fisChoose1 = new FileInputStream(filesketch);
                stmt.setBinaryStream(79, (InputStream) fisChoose1, (int) filesketch.length());

                imgpath = new Image(filesketch.toURI().toString());
                imgview.setImage(imgpath);
            }
        } catch (IOException e1) {
            Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void chooseBuild(ActionEvent event) {
        String sql = "INSERT INTO `block`(`OWNERFN`, `YEAR`, `OBJECTNO`, `PAGENO`, `PWARD`, `PMTAA`, `PRATEBLOCK`, `POBJECT`, `PBUILDINGNO`, `PLSTREET`, `PLPLOTNO`, `PLSURVEYBLOCK`, `PLEXISTINGPROP`, `PLMAPREF`, `INDIVFN`, `INDIVMN`, `INDIVLN`, `INDIVPH1`, `INDIVPH2`, `LEGALFCN`, `LEGALPH1`, `LEGALPH2`, `ID`, `OWNERMN`, `OWNERLN`, `OWNERPH1`, `OWNERPH2`, `OWNERPSTREET`, `OWNERPLOTNO`, `OWNERPOBOX`, `OWNERREGION`, `OWNERDISTRICT`, `OWNERWARD`, `OWNERMTAA`, `OWNEREMAIL`, `TENURE`, `LAND`, `ACTUALTRANSACTION`, `TRANSACTIONDATE`, `SOI`, `NOSTORIES`, `COMPLETE`, `COMIND`, `INSTI`, `RES`, `COYEAR`, `RECOYEAR`, `ROOF`, `EXTWALL`, `EXTFIN`, `WINDOWS`, `DOORS`, `FLOOR`, `CEILING`, `NOFLOOR`, `NOROOM`, `WATER`, `DRAINAGE`, `ELECTRICITY`, `HQ`, `GQ`, `AMENIT`, `EXLLENT`, `GOOD`, `FAIR`, `POOR`, `ROAD`, `FENCE`, `COMP`, `OBNONE`, `OB1`, `OB1HYPERLINK`, `OB2`, `OB2HYPERLINK`, `OB3`, `OB3HYPERLINK`, `OB4`, `OB4HYPERLINK`, `SKETCH`, `BULDHPHOTO1`, `BULDHPHOTO2`, `BATHS`, `TOILETS`, `MLEN`, `MWID`, `MAREA`, `MREDFACT`, `MCOMPFACT`, `MREDFACTAREA`, `OB1LEN`, `OB1WID`, `OB1AREA`, `OB1REDFACT`, `OB1COMPFACT`, `OB1REDFACTAREA`, `OB2LEN`, `OB2WID`, `OB2AREA`, `OB2REDFACT`, `OB2COMPFACT`, `OB2REDFACTAREA`, `OB3LEN`, `OB3WID`, `OB3AREA`, `OB3REDFACT`, `OB3COMPFACT`, `OB3REDFACTAREA`, `OB4LEN`, `OB4WID`, `OB4AREA`, `OB4REDFACT`, `OB4COMPFACT`, `OB4REDFACTAREA`, `TOTALRFA`, `TOTALRFASQR`, `MULTIPLYBTALL`, `CURRENTREPLACEMENT`, `LESSDEPREC`, `DEPRECREPLACEMENT`, `INSPECTEDBY`, `CHECKEDBY`, `APPROVEDBY`, `COMPANYNAME`, `COMPANYSTAMP`, `CERTIFIEDDATE`, `TIN`, `NonRateable`, `INDIVIDUAL`, `LegalEntity`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            Stage chooseStage = new Stage();


            fileChooser2 = new FileChooser();
            fileChooser2.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*.PNG", "*.JPG", "*.JPEG"),
                    new FileChooser.ExtensionFilter("Text Files", "*txt"),
                    new FileChooser.ExtensionFilter("All Files", "*.*")
            );

            filebuild1 = fileChooser2.showOpenDialog(chooseStage);
            if (filebuild1 != null) {
                desktop.open(filebuild1);
                path1.setText(filebuild1.getAbsolutePath());

                fisChoose2 = new FileInputStream(filebuild1);
                stmt.setBinaryStream(80, (InputStream) fisChoose2, (int) filebuild1.length());

                imgway = new Image(filebuild1.toURI().toString());
                imgview1.setImage(imgway);
            }
        } catch (IOException e1) {
            Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void chooseSketch(ActionEvent event) {
        String sql = "INSERT INTO `block`(`OWNERFN`, `YEAR`, `OBJECTNO`, `PAGENO`, `PWARD`, `PMTAA`, `PRATEBLOCK`, `POBJECT`, `PBUILDINGNO`, `PLSTREET`, `PLPLOTNO`, `PLSURVEYBLOCK`, `PLEXISTINGPROP`, `PLMAPREF`, `INDIVFN`, `INDIVMN`, `INDIVLN`, `INDIVPH1`, `INDIVPH2`, `LEGALFCN`, `LEGALPH1`, `LEGALPH2`, `ID`, `OWNERMN`, `OWNERLN`, `OWNERPH1`, `OWNERPH2`, `OWNERPSTREET`, `OWNERPLOTNO`, `OWNERPOBOX`, `OWNERREGION`, `OWNERDISTRICT`, `OWNERWARD`, `OWNERMTAA`, `OWNEREMAIL`, `TENURE`, `LAND`, `ACTUALTRANSACTION`, `TRANSACTIONDATE`, `SOI`, `NOSTORIES`, `COMPLETE`, `COMIND`, `INSTI`, `RES`, `COYEAR`, `RECOYEAR`, `ROOF`, `EXTWALL`, `EXTFIN`, `WINDOWS`, `DOORS`, `FLOOR`, `CEILING`, `NOFLOOR`, `NOROOM`, `WATER`, `DRAINAGE`, `ELECTRICITY`, `HQ`, `GQ`, `AMENIT`, `EXLLENT`, `GOOD`, `FAIR`, `POOR`, `ROAD`, `FENCE`, `COMP`, `OBNONE`, `OB1`, `OB1HYPERLINK`, `OB2`, `OB2HYPERLINK`, `OB3`, `OB3HYPERLINK`, `OB4`, `OB4HYPERLINK`, `SKETCH`, `BULDHPHOTO1`, `BULDHPHOTO2`, `BATHS`, `TOILETS`, `MLEN`, `MWID`, `MAREA`, `MREDFACT`, `MCOMPFACT`, `MREDFACTAREA`, `OB1LEN`, `OB1WID`, `OB1AREA`, `OB1REDFACT`, `OB1COMPFACT`, `OB1REDFACTAREA`, `OB2LEN`, `OB2WID`, `OB2AREA`, `OB2REDFACT`, `OB2COMPFACT`, `OB2REDFACTAREA`, `OB3LEN`, `OB3WID`, `OB3AREA`, `OB3REDFACT`, `OB3COMPFACT`, `OB3REDFACTAREA`, `OB4LEN`, `OB4WID`, `OB4AREA`, `OB4REDFACT`, `OB4COMPFACT`, `OB4REDFACTAREA`, `TOTALRFA`, `TOTALRFASQR`, `MULTIPLYBTALL`, `CURRENTREPLACEMENT`, `LESSDEPREC`, `DEPRECREPLACEMENT`, `INSPECTEDBY`, `CHECKEDBY`, `APPROVEDBY`, `COMPANYNAME`, `COMPANYSTAMP`, `CERTIFIEDDATE`, `TIN`, `NonRateable`, `INDIVIDUAL`, `LegalEntity`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            Stage chooseStage = new Stage();


            fileChooser3 = new FileChooser();
            fileChooser3.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*.PNG", "*.JPG", "*.JPEG"),
                    new FileChooser.ExtensionFilter("Text Files", "*txt"),
                    new FileChooser.ExtensionFilter("All Files", "*.*")
            );

            filebuild2 = fileChooser3.showOpenDialog(chooseStage);
            if (filebuild2 != null) {
                desktop.open(filebuild2);
                path11.setText(filebuild2.getAbsolutePath());

                fisChoose3 = new FileInputStream(filebuild2);
                stmt.setBinaryStream(81, (InputStream) fisChoose3, (int) filebuild2.length());

                imggate = new Image(filebuild2.toURI().toString());
                imgview11.setImage(imggate);
            }
        } catch (IOException e1) {
            Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void myCheck1() {
        exllent.getItems().addAll("1", "2", "3", "4", "5");
    }


    public void myCheck2() {
        good.getItems().addAll("6", "7", "8", "9", "10");
    }

    public void myCheck3() {
        fair.getItems().addAll("11", "12", "13", "14", "15");
    }


    public void myCheck4() {
        poor.getItems().addAll("16", "17", "18", "19", "20");
    }

    public void myCheck11() {
        exllent1.getItems().addAll("1", "2", "3", "4", "5");
    }


    public void myCheck22() {
        good1.getItems().addAll("6", "7", "8", "9", "10");
    }

    public void myCheck33() {
        fair1.getItems().addAll("11", "12", "13", "14", "15");
    }


    public void myCheck44() {
        poor1.getItems().addAll("16", "17", "18", "19", "20");
    }


    public void gotoTable(ActionEvent event) throws IOException {
        Stage tableStage;
        ScrollPane scrollPane;

        if (event.getSource() == gotable) {
            tableStage = (Stage) gotable.getScene().getWindow();
            scrollPane = (ScrollPane) FXMLLoader.load(getClass().getResource("/tableway/tablefxml.fxml"));

        } else {
            tableStage = (Stage) quit.getScene().getWindow();
            scrollPane = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        }
        Scene tscene = new Scene(scrollPane);
        tableStage.setScene(tscene);
        tableStage.setResizable(true);
        tableStage.show();

    }

    private void clearFields() {
        id.clear();
        docrefyear.clear();
        docrefobjectno.clear();
        docrefpageno.clear();
        proprefward.clear();
        proprefmtaa.clear();
        proprefrateblock.clear();
        proprefobjectno.clear();
        proprefbuildingno.clear();
        nonrateable.setSelected(false);
        nonrateable1.setSelected(false);
        proplocstreet.clear();
        proplocplotno.clear();
        proplocsurveyblock.clear();
        proplocexistingrefno.clear();
        proplocmapreference.clear();

        individual.setSelected(false);
        individualfirstname.clear();
        individualmiddlename.clear();
        individuallastname.clear();
        individualphone1.clear();
        individualphone2.clear();
        legalentity.setSelected(false);
        legalentityfullcompanyname.clear();
        legalentityphone1.clear();
        legalentityphone2.clear();
        ownerinfofirstname.clear();
        ownerinfomiddlename.clear();
        ownerinfolastname.clear();
        ownerinfophone1.clear();
        ownerinfophone2.clear();
        ownerinfostreet.clear();
        ownerinfoplotno.clear();
        ownerinfopobox.clear();
        ownerinforegion.clear();
        ownerinfodistrict.clear();
        ownerinfoward.clear();
        ownerinfomtaa.clear();
        ownerinfoemail.clear();

        //te-land
        tenurelease.setSelected(false);
        tenureresoccupier.setSelected(false);
        tenurereslicensee.setSelected(false);
        tenureuntitled.setSelected(false);
        landuseresidential.setSelected(false);
        landusecommercial.setSelected(false);
        landusecommres.setSelected(false);
        landuseindustrial.setSelected(false);
        landuseinstitution.setSelected(false);
        landuseother.setSelected(false);

        actualtransaction.clear();
        transactiondate.getEditor().setText(null);
        //soi
        sourceofinfobuyer.setSelected(false);
        sourceofinfonotary.setSelected(false);
        sourceofinfovaluer.setSelected(false);
        sourceofinfogovt.setSelected(false);
        sourceofinfobank.setSelected(false);
        sourceofinfobroker.setSelected(false);
        sourceofinfoother.setSelected(false);

        noofstories.clear();
        complete.clear();

        //com-res
        commmallstore.setSelected(false);
        commshopresta.setSelected(false);
        commofficebank.setSelected(false);
        commhotel.setSelected(false);
        commpetrolstation.setSelected(false);
        commfactorywarehouse.setSelected(false);
        commstoragetank.setSelected(false);
        commother.setSelected(false);
        instischool.setSelected(false);
        instisport.setSelected(false);
        insticlinical.setSelected(false);
        instiworship.setSelected(false);
        instigovt.setSelected(false);
        instiother.setSelected(false);
        resdetatached.setSelected(false);
        ressemidetached.setSelected(false);
        resapartment.setSelected(false);
        resmaisonette.setSelected(false);
        resvilla.setSelected(false);
        resother.setSelected(false);


        coyear.getEditor().setText(null);
        recoyear.getEditor().setText(null);

        //roof-ob4
        roofconcrete.setSelected(false);
        roofironsheet.setSelected(false);
        rooftilescement.setSelected(false);
        roofharveytiles.setSelected(false);
        roofasbestos.setSelected(false);
        roofgrass.setSelected(false);
        roofother.setSelected(false);
        exteriorwallconcframe.setSelected(false);
        exteriorwallcementblock.setSelected(false);
        exteriorwallglass.setSelected(false);
        exteriorwallhydraform.setSelected(false);
        exteriorwallburntbricks.setSelected(false);
        exteriorwallmud.setSelected(false);
        exteriorwalltimber.setSelected(false);
        exteriorwallother.setSelected(false);
        exteriorfinishfair.setSelected(false);
        exteriorfinishtyrolean.setSelected(false);
        exteriorfinishtiles.setSelected(false);
        exteriorfinishglazed.setSelected(false);
        exteriorfinishcompact.setSelected(false);
        exteriorfinishplaster.setSelected(false);
        exteriorfinishother.setSelected(false);
        windowswoodabb.setSelected(false);
        windowswoodcasement.setSelected(false);
        windowssteelframe.setSelected(false);
        windowsaluframe.setSelected(false);
        windowsglass.setSelected(false);
        windowsother.setSelected(false);
        doorswoodbattens.setSelected(false);
        doorswoodflush.setSelected(false);
        doorssteelshutters.setSelected(false);
        doorssteelsheets.setSelected(false);
        doorsalu.setSelected(false);
        doorsother.setSelected(false);
        floormarble.setSelected(false);
        floortiles.setSelected(false);
        floorinsitu.setSelected(false);
        floorcement.setSelected(false);
        floorwood.setSelected(false);
        floorcompact.setSelected(false);
        floorother.setSelected(false);
        ceilingplaster.setSelected(false);
        ceilingsoftboard.setSelected(false);
        ceilingwood.setSelected(false);
        ceilingchipboard.setSelected(false);
        ceilinggypsum.setSelected(false);
        ceilingsuspended.setSelected(false);
        ceilingother.setSelected(false);
        watermains.setSelected(false);
        waterstandtap.setSelected(false);
        waterborehole.setSelected(false);
        waterrain.setSelected(false);
        waterriver.setSelected(false);
        waternone.setSelected(false);
        drainagesewer.setSelected(false);
        drainageptictank.setSelected(false);
        drainagepitlatrine.setSelected(false);
        drainageother.setSelected(false);
        drainagenone.setSelected(false);
        electricitymains.setSelected(false);
        electricitysolar.setSelected(false);
        electricitynone.setSelected(false);
        hqwashhand.setSelected(false);
        hqhighpowder.setSelected(false);
        hqjacuzzi.setSelected(false);
        hqkitchencabinet.setSelected(false);
        hqbuiltin.setSelected(false);
        hqnone.setSelected(false);
        gqbathtubs.setSelected(false);
        gqwesterntoilet.setSelected(false);
        gqwashhand.setSelected(false);
        gqkitchen.setSelected(false);
        gqbuiltin.setSelected(false);
        gqnone.setSelected(false);
        amenitieslift.setSelected(false);
        amenitiespool.setSelected(false);
        amenitiescentralcooling.setSelected(false);
        amenitiesfire.setSelected(false);
        amenitiesnone.setSelected(false);
        roadtarmac.setSelected(false);
        roadmurram.setSelected(false);
        roadearth.setSelected(false);
        roadfootpath.setSelected(false);
        roadother.setSelected(false);
        roadnone.setSelected(false);
        fencechainlink.setSelected(false);
        fencecement.setSelected(false);
        fencesteel.setSelected(false);
        fencetimber.setSelected(false);
        fenceplant.setSelected(false);
        fencehydraform.setSelected(false);
        fencenone.setSelected(false);
        compoundinterblocks.setSelected(false);
        compoundconcrete.setSelected(false);
        compoundtarmac.setSelected(false);
        compoundlawn.setSelected(false);
        compoundother.setSelected(false);
        compoundnone.setSelected(false);
        obnone.setSelected(false);
        obno1garage.setSelected(false);
        obno1servants.setSelected(false);
        obno1workshop.setSelected(false);
        obno1store.setSelected(false);
        obno1other.setSelected(false);
        obno2garage.setSelected(false);
        obno2servants.setSelected(false);
        obno2workshop.setSelected(false);
        obno2store.setSelected(false);
        obno2other.setSelected(false);
        obno3garage.setSelected(false);
        obno3servants.setSelected(false);
        obno3workshop.setSelected(false);
        obno3store.setSelected(false);
        obno3other.setSelected(false);
        obno4garage.setSelected(false);
        obno4servants.setSelected(false);
        obno4workshop.setSelected(false);
        obno4store.setSelected(false);
        obno4other.setSelected(false);

        sketchphoto.setImage(null);
        buildphoto1.setImage(null);
        buildphoto2.setImage(null);

        noofbaths.clear();
        nooftoilets.clear();
        mblen.clear();
        mbwid.clear();
        mbarea.clear();
        mbredfact.clear();
        mbcompfact.clear();
        mbredfactarea.clear();
        ob1len.clear();
        ob1wid.clear();
        ob1area.clear();
        ob1redfact.clear();
        ob1compfact.clear();
        ob1redfactarea.clear();
        ob2len.clear();
        ob2wid.clear();
        ob2area.clear();
        ob2redfact.clear();
        ob2compfact.clear();
        ob2redfactarea.clear();
        ob3len.clear();
        ob3wid.clear();
        ob3area.clear();
        ob3redfact.clear();
        ob3compfact.clear();
        ob3redfactarea.clear();
        ob4len.clear();
        ob4wid.clear();
        ob4area.clear();
        ob4redfact.clear();
        ob4compfact.clear();
        ob4redfactarea.clear();
        totalrfa.clear();
        totalrfasqr.clear();
        multiplybyall.clear();
        currentreplacementcost.clear();
        lessdeprec.clear();
        deprecreplacementcost.clear();
        companyname.clear();
        companystamp.clear();
        certifieddate.getEditor().setText(null);
        imgview.setImage(null);
        imgview1.setImage(null);
        imgview11.setImage(null);
        path.clear();
        path1.clear();
        path11.clear();
        path12.clear();
        path121.clear();
        path1211.clear();
        path12111.clear();
        inspectedby.clear();
        checkedby.clear();
        approvedby.clear();
        docrefyear1.clear();
        exllent.setValue(null);
        good.setValue(null);
        fair.setValue(null);
        poor.setValue(null);
        tin.clear();
        noroom.clear();
        nofloor.clear();
        glist.clear();
        namesList.clear();
        namesList1.clear();
        namesList2.clear();
        checkTenure.clear();
        checkRate.clear();
        checkIndiv.clear();
        checkLegal.clear();
        checkLand.clear();
        checkSoi.clear();
        checkComind.clear();
        checkInsti.clear();
        checkRes.clear();
        checkRoof.clear();
        checkExtwall.clear();
        checkExtfin.clear();
        checkWin.clear();
        checkDor.clear();
        checkFlor.clear();
        checkCel.clear();
        checkDrainage.clear();
        checkWater.clear();
        checkElectricity.clear();
        checkHq.clear();
        checkGq.clear();
        checkAmenit.clear();
        checkRoad.clear();
        checkFence.clear();
        checkComp.clear();
        checkObnone.clear();
        checkOb1.clear();
        checkOb2.clear();
        checkOb3.clear();
        checkOb4.clear();
        id2.clear();

    }

    public void clearAll(ActionEvent event) {
        clearFields();
    }

    @FXML
    public void updateBlock(ActionEvent event) {

        try {

            String sql = "UPDATE block set OWNERFN=?, YEAR=?, OBJECTNO=?, PAGENO=?, PWARD=?, PMTAA=?, PRATEBLOCK=?, POBJECT=?, PBUILDINGNO=?, PLSTREET=?, PLPLOTNO=?, PLSURVEYBLOCK=?, PLEXISTINGPROP=?, PLMAPREF=?, INDIVFN=?, INDIVMN=?, INDIVLN=?, INDIVPH1=?, INDIVPH2=?, LEGALFCN=?, LEGALPH1=?, LEGALPH2=?, ID=?, OWNERMN=?, OWNERLN=?, OWNERPH1=?, OWNERPH2=?, OWNERPSTREET=?, OWNERPLOTNO=?, OWNERPOBOX=?, OWNERREGION=?, OWNERDISTRICT=?, OWNERWARD=?, OWNERMTAA=?, OWNEREMAIL=?, TENURE=?, LAND=?, ACTUALTRANSACTION=?, TRANSACTIONDATE=?, SOI=?, NOSTORIES=?, COMPLETE=?, COMIND=?, INSTI=?, RES=?, COYEAR=?, RECOYEAR=?, ROOF=?, EXTWALL=?, EXTFIN=?, WINDOWS=?, DOORS=?, FLOOR=?, CEILING=?, NOFLOOR=?, NOROOM=?, WATER=?, DRAINAGE=?, ELECTRICITY=?, HQ=?, GQ=?, AMENIT=?, EXLLENT=?, GOOD=?, FAIR=?, POOR=?, ROAD=?, FENCE=?, COMP=?, OBNONE=?, OB1=?, OB1HYPERLINK=?, OB2=?, OB2HYPERLINK=?, OB3=?, OB3HYPERLINK=?, OB4=?, OB4HYPERLINK=?, SKETCH=?, BULDHPHOTO1=?, BULDHPHOTO2=?, BATHS=?, TOILETS=?, MLEN=?, MWID=?, MAREA=?, MREDFACT=?, MCOMPFACT=?, MREDFACTAREA=?, OB1LEN=?, OB1WID=?, OB1AREA=?, OB1REDFACT=?, OB1COMPFACT=?, OB1REDFACTAREA=?, OB2LEN=?, OB2WID=?, OB2AREA=?, OB2REDFACT=?, OB2COMPFACT=?, OB2REDFACTAREA=?, OB3LEN=?, OB3WID=?, OB3AREA=?, OB3REDFACT=?, OB3COMPFACT=?, OB3REDFACTAREA=?, OB4LEN=?, OB4WID=?, OB4AREA=?, OB4REDFACT=?, OB4COMPFACT=?, OB4REDFACTAREA=?, TOTALRFA=?, TOTALRFASQR=?, MULTIPLYBTALL=?, CURRENTREPLACEMENT=?, LESSDEPREC=?, DEPRECREPLACEMENT=?, INSPECTEDBY=?, CHECKEDBY=?, APPROVEDBY=?, COMPANYNAME=?, COMPANYSTAMP=?, CERTIFIEDDATE=?,  TIN=?, NonRateable = ?, INDIVIDUAL = ?, LegalEntity=?, DATANO=? where OWNERFN='"+ownerinfofirstname.getText()+"' ";
            Connection conn = dbConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, this.ownerinfofirstname.getText());
            stmt.setString(2, this.docrefyear.getText());
            stmt.setString(3, this.docrefobjectno.getText());
            stmt.setString(4, this.docrefpageno.getText());
            stmt.setString(5, this.proprefward.getText());
            stmt.setString(6, this.proprefmtaa.getText());
            stmt.setString(7, this.proprefrateblock.getText());
            stmt.setString(8, this.proprefobjectno.getText());
            stmt.setString(9, this.proprefbuildingno.getText());


            stmt.setString(10, this.proplocstreet.getText());
            stmt.setString(11, this.proplocplotno.getText());
            stmt.setString(12, this.proplocsurveyblock.getText());
            stmt.setString(13, this.proplocexistingrefno.getText());
            stmt.setString(14, this.proplocmapreference.getText());

            stmt.setString(15, this.individualfirstname.getText());
            stmt.setString(16, this.individualmiddlename.getText());
            stmt.setString(17, this.individuallastname.getText());
            stmt.setString(18, this.individualphone1.getText());
            stmt.setString(19, this.individualphone2.getText());

            stmt.setString(20, this.legalentityfullcompanyname.getText());
            stmt.setString(21, this.legalentityphone1.getText());
            stmt.setString(22, this.legalentityphone2.getText());
            stmt.setString(23, this.id.getText());
            stmt.setString(24, this.ownerinfomiddlename.getText());
            stmt.setString(25, this.ownerinfolastname.getText());
            stmt.setString(26, this.ownerinfophone1.getText());
            stmt.setString(27, this.ownerinfophone2.getText());
            stmt.setString(28, this.ownerinfostreet.getText());
            stmt.setString(29, this.ownerinfoplotno.getText());
            stmt.setString(30, this.ownerinfopobox.getText());
            stmt.setString(31, this.ownerinforegion.getText());
            stmt.setString(32, this.ownerinfodistrict.getText());
            stmt.setString(33, this.ownerinfoward.getText());
            stmt.setString(34, this.ownerinfomtaa.getText());
            stmt.setString(35, this.ownerinfoemail.getText());
            if (tenurelease.isSelected()){
                checkTenure.add(tenurelease.getText());
            }
            if (tenureresoccupier.isSelected()){
                checkTenure.add(tenureresoccupier.getText());
            }
            if (tenurereslicensee.isSelected()){
                checkTenure.add(tenurereslicensee.getText());
            }
            if (tenureuntitled.isSelected()){
                checkTenure.add(tenureuntitled.getText());
            }

            stmt.setString(36, checkTenure.toString());

            if (landuseindustrial.isSelected()){
                checkLand.add(landuseindustrial.getText());
            }
            if (landuseinstitution.isSelected()){
                checkLand.add(landuseinstitution.getText());
            }
            if (landusecommres.isSelected()){
                checkLand.add(landusecommres.getText());
            }
            if (landusecommercial.isSelected()){
                checkLand.add(landusecommercial.getText());
            }
            if (landuseresidential.isSelected()){
                checkLand.add(landuseresidential.getText());
            }
            if (landuseother.isSelected()){
                checkLand.add(landuseother.getText());
            }
            stmt.setString(37, checkLand.toString());

            stmt.setString(38, this.actualtransaction.getText());
            stmt.setString(39, this.transactiondate.getEditor().getText());

            if (sourceofinfogovt.isSelected()){
                checkSoi.add(sourceofinfogovt.getText());
            }
            if (sourceofinfobuyer.isSelected()){
                checkSoi.add(sourceofinfobuyer.getText());
            }
            if (sourceofinfonotary.isSelected()){
                checkSoi.add(sourceofinfonotary.getText());
            }
            if (sourceofinfovaluer.isSelected()){
                checkSoi.add(sourceofinfovaluer.getText());
            }
            if (sourceofinfobank.isSelected()){
                checkSoi.add(sourceofinfobank.getText());
            }
            if (sourceofinfoother.isSelected()){
                checkSoi.add(sourceofinfoother.getText());
            }
            if (sourceofinfobroker.isSelected()){
                checkSoi.add(sourceofinfobroker.getText());
            }
            stmt.setString(40, checkSoi.toString());

            stmt.setString(41, this.noofstories.getText());
            stmt.setString(42, this.complete.getText());

            if (commstoragetank.isSelected()){
                checkComind.add(commstoragetank.getText());
            }
            if (commshopresta.isSelected()){
                checkComind.add(commshopresta.getText());
            }
            if (commpetrolstation.isSelected()){
                checkComind.add(commpetrolstation.getText());
            }
            if (commother.isSelected()){
                checkComind.add(commother.getText());
            }
            if (commofficebank.isSelected()){
                checkComind.add(commofficebank.getText());
            }
            if (commmallstore.isSelected()){
                checkComind.add(commmallstore.getText());
            }
            if (commhotel.isSelected()){
                checkComind.add(commhotel.getText());
            }
            if (commfactorywarehouse.isSelected()){
                checkComind.add(commfactorywarehouse.getText());
            }
            stmt.setString(43, checkComind.toString());

            if (instischool.isSelected()){
                checkInsti.add(instischool.getText());
            }
            if (instisport.isSelected()){
                checkInsti.add(instisport.getText());
            }
            if (instigovt.isSelected()){
                checkInsti.add(instigovt.getText());
            }
            if (instiworship.isSelected()){
                checkInsti.add(instiworship.getText());
            }
            if (instiother.isSelected()){
                checkInsti.add(instiother.getText());
            }
            if (insticlinical.isSelected()){
                checkInsti.add(insticlinical.getText());
            }

            stmt.setString(44, checkInsti.toString());
            if (resvilla.isSelected()){
                checkRes.add(resvilla.getText());
            }
            if (ressemidetached.isSelected()){
                checkRes.add(ressemidetached.getText());
            }
            if (resother.isSelected()){
                checkRes.add(resother.getText());
            }
            if (resmaisonette.isSelected()){
                checkRes.add(resmaisonette.getText());
            }
            if (resdetatached.isSelected()){
                checkRes.add(resdetatached.getText());
            }
            if (resapartment.isSelected()){
                checkRes.add(resapartment.getText());
            }
            stmt.setString(45, checkRes.toString());

            stmt.setString(46, this.coyear.getEditor().getText());
            stmt.setString(47, this.recoyear.getEditor().getText());

            if (roofgrass.isSelected()){
                checkRoof.add(roofgrass.getText());
            }
            if (roofother.isSelected()){
                checkRoof.add(roofother.getText());
            }
            if (rooftilescement.isSelected()){
                checkRoof.add(rooftilescement.getText());
            }
            if (roofironsheet.isSelected()){
                checkRoof.add(roofironsheet.getText());
            }
            if (roofharveytiles.isSelected()){
                checkRoof.add(roofharveytiles.getText());
            }
            if (roofconcrete.isSelected()){
                checkRoof.add(roofconcrete.getText());
            }if (roofasbestos.isSelected()){
                checkRoof.add(roofasbestos.getText());
            }
            stmt.setString(48, checkRoof.toString());

            if (exteriorwallother.isSelected()){
                checkExtwall.add(exteriorwallother.getText());
            }
            if (exteriorwallmud.isSelected()){
                checkExtwall.add(exteriorwallmud.getText());
            }
            if (exteriorwallhydraform.isSelected()){
                checkExtwall.add(exteriorwallhydraform.getText());
            }
            if (exteriorwalltimber.isSelected()){
                checkExtwall.add(exteriorwalltimber.getText());
            }
            if (exteriorwallglass.isSelected()){
                checkExtwall.add(exteriorwallglass.getText());
            }
            if (exteriorwallconcframe.isSelected()){
                checkExtwall.add(exteriorwallconcframe.getText());
            }if (exteriorwallconcframe.isSelected()){
                checkExtwall.add(exteriorwallconcframe.getText());
            }
            if (exteriorwallburntbricks.isSelected()){
                checkExtwall.add(exteriorwallburntbricks.getText());
            }

            stmt.setString(49, checkExtwall.toString());
            if (exteriorfinishglazed.isSelected()){
                checkExtfin.add(exteriorfinishglazed.getText());
            }
            if (exteriorfinishcompact.isSelected()){
                checkExtfin.add(exteriorfinishcompact.getText());
            }
            if (exteriorfinishfair.isSelected()){
                checkExtfin.add(exteriorfinishfair.getText());
            }
            if (exteriorfinishother.isSelected()){
                checkExtfin.add(exteriorfinishother.getText());
            }
            if (exteriorfinishplaster.isSelected()){
                checkExtfin.add(exteriorfinishplaster.getText());
            }
            if (exteriorfinishtiles.isSelected()){
                checkExtfin.add(exteriorfinishtiles.getText());
            }if (exteriorfinishtyrolean.isSelected()){
                checkExtfin.add(exteriorfinishtyrolean.getText());
            }

            stmt.setString(50, checkExtfin.toString());

            if (windowswoodcasement.isSelected()){
                checkWin.add(windowswoodcasement.getText());
            }
            if (windowswoodabb.isSelected()){
                checkWin.add(windowswoodabb.getText());
            }
            if (windowssteelframe.isSelected()){
                checkWin.add(windowssteelframe.getText());
            }
            if (windowsother.isSelected()){
                checkWin.add(windowsother.getText());
            }
            if (windowsglass.isSelected()){
                checkWin.add(windowsglass.getText());
            }
            if (windowsaluframe.isSelected()){
                checkWin.add(windowsaluframe.getText());
            }

            stmt.setString(51, checkWin.toString());
            if (doorssteelshutters.isSelected()){
                checkDor.add(doorssteelshutters.getText());
            }
            if (doorswoodflush.isSelected()){
                checkDor.add(doorssteelshutters.getText());
            }
            if (doorswoodbattens.isSelected()){
                checkDor.add(doorswoodbattens.getText());
            }
            if (doorssteelsheets.isSelected()){
                checkDor.add(doorssteelsheets.getText());
            }
            if (doorsother.isSelected()){
                checkDor.add(doorsother.getText());
            }
            if (doorsalu.isSelected()){
                checkDor.add(doorsalu.getText());
            }

            stmt.setString(52, checkDor.toString());
            if (floorwood.isSelected()){
                checkDor.add(floorwood.getText());
            }
            if (floortiles.isSelected()){
                checkFlor.add(floortiles.getText());
            }
            if (floorother.isSelected()){
                checkFlor.add(floorother.getText());
            }
            if (floormarble.isSelected()){
                checkFlor.add(floormarble.getText());
            }
            if (floorinsitu.isSelected()){
                checkFlor.add(floorinsitu.getText());
            }
            if (floorcompact.isSelected()){
                checkFlor.add(floorcompact.getText());
            }
            if (floorcement.isSelected()){
                checkFlor.add(floorcement.getText());
            }
            stmt.setString(53, checkFlor.toString());
            if (ceilingsuspended.isSelected()){
                checkCel.add(ceilingsuspended.getText());
            }
            if (ceilingsoftboard.isSelected()){
                checkCel.add(ceilingsoftboard.getText());
            }
            if (ceilingplaster.isSelected()){
                checkCel.add(ceilingplaster.getText());
            }
            if (ceilingother.isSelected()){
                checkCel.add(ceilingother.getText());
            }
            if (ceilinggypsum.isSelected()){
                checkCel.add(ceilinggypsum.getText());
            }
            if (ceilingchipboard.isSelected()){
                checkCel.add(ceilingchipboard.getText());
            }
            if (ceilingwood.isSelected()){
                checkCel.add(ceilingwood.getText());
            }
            stmt.setString(54, checkCel.toString());

            stmt.setString(55, this.nofloor.getText());
            stmt.setString(56, this.noroom.getText());

            if (waterriver.isSelected()){
                checkWater.add(waterriver.getText());
            }
            if (waterstandtap.isSelected()){
                checkWater.add(waterstandtap.getText());
            }
            if (waterrain.isSelected()){
                checkWater.add(waterrain.getText());
            }
            if (waternone.isSelected()){
                checkWater.add(waternone.getText());
            }
            if (watermains.isSelected()){
                checkWater.add(watermains.getText());
            }
            if (waterborehole.isSelected()){
                checkWater.add(waterborehole.getText());
            }

            stmt.setString(57, checkWater.toString());
            if (drainagesewer.isSelected()){
                checkDrainage.add(drainagesewer.getText());
            }
            if (drainageptictank.isSelected()){
                checkDrainage.add(drainageptictank.getText());
            }
            if (drainagepitlatrine.isSelected()){
                checkDrainage.add(drainagepitlatrine.getText());
            }
            if (drainageother.isSelected()){
                checkDrainage.add(drainageother.getText());
            }
            if (drainagenone.isSelected()){
                checkDrainage.add(drainagenone.getText());
            }
            stmt.setString(58, checkDrainage.toString());
            if (electricitymains.isSelected()){
                checkElectricity.add(electricitymains.getText());
            }
            if (electricitynone.isSelected()){
                checkElectricity.add(electricitynone.getText());
            }
            if (electricitysolar.isSelected()){
                checkElectricity.add(electricitysolar.getText());
            }

            stmt.setString(59, checkElectricity.toString());
            if (hqwashhand.isSelected()){
                checkHq.add(hqwashhand.getText());
            }
            if (hqnone.isSelected()){
                checkHq.add(hqnone.getText());
            }
            if (hqkitchencabinet.isSelected()){
                checkHq.add(hqkitchencabinet.getText());
            }
            if (hqjacuzzi.isSelected()){
                checkHq.add(hqjacuzzi.getText());
            }
            if (hqhighpowder.isSelected()){
                checkHq.add(hqhighpowder.getText());
            }if (hqbuiltin.isSelected()){
                checkHq.add(hqbuiltin.getText());
            }

            stmt.setString(60, checkHq.toString());
            if (gqwesterntoilet.isSelected()){
                checkGq.add(gqwesterntoilet.getText());
            }
            if (gqwashhand.isSelected()){
                checkGq.add(gqwashhand.getText());
            }
            if (gqnone.isSelected()){
                checkGq.add(gqnone.getText());
            }
            if (gqkitchen.isSelected()){
                checkGq.add(gqkitchen.getText());
            }
            if (gqbuiltin.isSelected()){
                checkGq.add(gqbuiltin.getText());
            }if (gqbathtubs.isSelected()){
                checkGq.add(gqbathtubs.getText());
            }

            stmt.setString(61, checkGq.toString());
            if (amenitiespool.isSelected()){
                checkGq.add(amenitiespool.getText());
            }
            if (amenitiesnone.isSelected()){
                checkGq.add(amenitiesnone.getText());
            }
            if (amenitieslift.isSelected()){
                checkGq.add(amenitieslift.getText());
            }
            if (amenitiesfire.isSelected()){
                checkGq.add(amenitiesfire.getText());
            }
            if (amenitiescentralcooling.isSelected()){
                checkGq.add(amenitiescentralcooling.getText());
            }
            stmt.setString(62, checkAmenit.toString());

            if (roadearth.isSelected()){
                checkRoad.add(roadearth.getText());
            }
            if (roadtarmac.isSelected()){
                checkRoad.add(roadtarmac.getText());
            }
            if (roadother.isSelected()){
                checkRoad.add(roadother.getText());
            }
            if (roadnone.isSelected()){
                checkRoad.add(roadnone.getText());
            }
            if (roadmurram.isSelected()){
                checkRoad.add(roadmurram.getText());
            }if (roadfootpath.isSelected()){
                checkRoad.add(roadfootpath.getText());
            }
            stmt.setString(67, checkRoad.toString());
            if (fencetimber.isSelected()){
                checkFence.add(fencetimber.getText());
            }
            if (fencesteel.isSelected()){
                checkFence.add(fencesteel.getText());
            }
            if (fenceplant.isSelected()){
                checkFence.add(fenceplant.getText());
            }
            if (fencenone.isSelected()){
                checkFence.add(fencenone.getText());
            }
            if (fencehydraform.isSelected()){
                checkFence.add(fencehydraform.getText());
            }if (fencechainlink.isSelected()){
                checkFence.add(fencechainlink.getText());
            }if (fencecement.isSelected()){
                checkFence.add(fencecement.getText());
            }
            stmt.setString(68, checkFence.toString());
            if (compoundother.isSelected()){
                checkComp.add(compoundother.getText());
            }
            if (compoundtarmac.isSelected()){
                checkComp.add(compoundtarmac.getText());
            }
            if (compoundnone.isSelected()){
                checkComp.add(compoundnone.getText());
            }
            if (compoundlawn.isSelected()){
                checkComp.add(compoundlawn.getText());
            }
            if (compoundinterblocks.isSelected()){
                checkComp.add(compoundinterblocks.getText());
            }if (compoundconcrete.isSelected()){
                checkComp.add(compoundconcrete.getText());
            }
            stmt.setString(69, checkComp.toString());

            if (obnone.isSelected()){
                checkObnone.add(obnone.getText());
            }
            stmt.setString(70, checkObnone.toString());

            if (obno1workshop.isSelected()){
                checkOb1.add(obno1workshop.getText());
            }
            if (obno1store.isSelected()){
                checkOb1.add(obno1store.getText());
            }
            if (obno1servants.isSelected()){
                checkOb1.add(obno1servants.getText());
            }
            if (obno1other.isSelected()){
                checkOb1.add(obno1other.getText());
            }
            if (obno1garage.isSelected()){
                checkOb1.add(obno1garage.getText());
            }
            stmt.setString(71, checkOb1.toString());

            stmt.setString(76, this.path12.getText());
            stmt.setString(78, this.path121.getText());
            stmt.setString(80, this.path1211.getText());
            stmt.setString(82, this.path12111.getText());

            if (obno2workshop.isSelected()){
                checkOb2.add(obno2workshop.getText());
            }
            if (obno2store.isSelected()){
                checkOb2.add(obno2store.getText());
            }
            if (obno2servants.isSelected()){
                checkOb2.add(obno2servants.getText());
            }
            if (obno2other.isSelected()){
                checkOb2.add(obno2other.getText());
            }
            if (obno2garage.isSelected()){
                checkOb2.add(obno2garage.getText());
            }
            stmt.setString(73, checkOb2.toString());

            if (obno3workshop.isSelected()){
                checkOb3.add(obno3workshop.getText());
            }
            if (obno3store.isSelected()){
                checkOb3.add(obno3store.getText());
            }
            if (obno3servants.isSelected()){
                checkOb3.add(obno3servants.getText());
            }
            if (obno3other.isSelected()){
                checkOb3.add(obno3other.getText());
            }
            if (obno3garage.isSelected()){
                checkOb3.add(obno3garage.getText());
            }
            stmt.setString(75, checkOb3.toString());

            if (obno4workshop.isSelected()){
                checkOb4.add(obno4workshop.getText());
            }
            if (obno4store.isSelected()){
                checkOb4.add(obno4store.getText());
            }
            if (obno4servants.isSelected()){
                checkOb4.add(obno4servants.getText());
            }
            if (obno4other.isSelected()){
                checkOb4.add(obno4other.getText());
            }
            if (obno4garage.isSelected()){
                checkOb4.add(obno4garage.getText());
            }
            stmt.setString(77, checkOb4.toString());


            browse.setOnAction(e -> {
                try {
                    Stage chooseStage = new Stage();

                    fileChooser1 = new FileChooser();
                    fileChooser1.getExtensionFilters().addAll(
                            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"),
                            new FileChooser.ExtensionFilter("Text Files", "*txt"),
                            new FileChooser.ExtensionFilter("Pdf Files", "*.pdf"),
                            new FileChooser.ExtensionFilter("All Files", "*.*")
                    );

                    filesketch = fileChooser1.showOpenDialog(chooseStage);
                    if (filesketch != null) {
                        desktop.open(filesketch);

                        path.setText(filesketch.getAbsolutePath());
                    }
                } catch (IOException e1) {
                    Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
                }
            });

            fisChoose1 = new FileInputStream(filesketch);
            stmt.setBinaryStream(79, (InputStream) fisChoose1, (int) filesketch.length());

            build.setOnAction(e -> {
                try {
                    Stage chooseStage = new Stage();

                    fileChooser2 = new FileChooser();
                    fileChooser2.getExtensionFilters().addAll(
                            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"),
                            new FileChooser.ExtensionFilter("Text Files", "*txt"),
                            new FileChooser.ExtensionFilter("Pdf Files", "*.pdf"),
                            new FileChooser.ExtensionFilter("All Files", "*.*")
                    );

                    filebuild1 = fileChooser2.showOpenDialog(chooseStage);
                    if (filebuild1 != null) {
                        desktop.open(filebuild1);
                        path1.setText(filebuild1.getAbsolutePath());
                    }
                } catch (IOException e1) {
                    Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
                }
            });

            fisChoose2 = new FileInputStream(filebuild1);
            stmt.setBinaryStream(80, (InputStream) fisChoose2, (int) filebuild1.length());

            sketchpic.setOnAction(e -> {
                try {
                    Stage chooseStage = new Stage();

                    fileChooser3 = new FileChooser();
                    fileChooser3.getExtensionFilters().addAll(
                            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg"),
                            new FileChooser.ExtensionFilter("Text Files", "*txt"),
                            new FileChooser.ExtensionFilter("Pdf Files", "*.pdf"),
                            new FileChooser.ExtensionFilter("All Files", "*.*")
                    );

                    filebuild2 = fileChooser3.showOpenDialog(chooseStage);
                    if (filebuild2 != null) {
                        desktop.open(filebuild2);
                        path11.setText(filebuild2.getAbsolutePath());
                    }
                } catch (IOException e1) {
                    Logger.getLogger(SuperviserFXMLContoller.class.getName()).log(Level.SEVERE, null, e1);
                }
            });

            fisChoose3 = new FileInputStream(filebuild2);
            stmt.setBinaryStream(81, (InputStream) fisChoose3, (int) filebuild2.length());
            stmt.setString(82, this.noofbaths.getText());
            stmt.setString(83, this.nooftoilets.getText());
            stmt.setString(84, this.mblen.getText());
            stmt.setString(85, this.mbwid.getText());
            stmt.setString(86, this.mbarea.getText());
            stmt.setString(87, this.mbredfact.getText());
            stmt.setString(88, this.mbcompfact.getText());
            stmt.setString(89, this.mbredfactarea.getText());
            stmt.setString(90, this.ob1len.getText());
            stmt.setString(91, this.ob1wid.getText());
            stmt.setString(92, this.ob1area.getText());
            stmt.setString(93, this.ob1redfact.getText());
            stmt.setString(94, this.ob1compfact.getText());
            stmt.setString(95, this.ob1redfactarea.getText());
            stmt.setString(96, this.ob2len.getText());
            stmt.setString(97, this.ob2wid.getText());
            stmt.setString(98, this.ob2area.getText());
            stmt.setString(99, this.ob2redfact.getText());
            stmt.setString(100, this.ob2compfact.getText());
            stmt.setString(101, this.ob2redfactarea.getText());
            stmt.setString(102, this.ob3len.getText());
            stmt.setString(103, this.ob3wid.getText());
            stmt.setString(104, this.ob3area.getText());
            stmt.setString(105, this.ob3redfact.getText());
            stmt.setString(106, this.ob3compfact.getText());
            stmt.setString(107, this.ob3redfactarea.getText());
            stmt.setString(108, this.ob4len.getText());
            stmt.setString(109, this.ob4wid.getText());
            stmt.setString(110, this.ob4area.getText());
            stmt.setString(111, this.ob4redfact.getText());
            stmt.setString(112, this.ob4compfact.getText());
            stmt.setString(113, this.ob4redfactarea.getText());
            stmt.setString(114, this.totalrfa.getText());
            stmt.setString(115, this.totalrfasqr.getText());
            stmt.setString(116, this.multiplybyall.getText());
            stmt.setString(117, this.currentreplacementcost.getText());
            stmt.setString(118, this.lessdeprec.getText());
            stmt.setString(119, this.deprecreplacementcost.getText());
            stmt.setString(120, this.inspectedby.getText());
            stmt.setString(121, this.checkedby.getText());
            stmt.setString(122, this.approvedby.getText());
            stmt.setString(123, this.companyname.getText());
            stmt.setString(124, this.companystamp.getText());
            stmt.setString(125, this.certifieddate.getEditor().getText());
            stmt.setString(126, this.tin.getText());

            if (nonrateable.isSelected()){
                checkRate.add(nonrateable.getText());
            }
            if (nonrateable1.isSelected()){
                checkRate.add(nonrateable1.getText());
            }
            stmt.setString(127, checkRate.toString());

            if (individual.isSelected()){
                checkIndiv.add(individual.getText());
            }
            stmt.setString(128, checkIndiv.toString());

            if (legalentity.isSelected()){
                checkLegal.add(legalentity.getText());
            }
            stmt.setString(129, checkLegal.toString());

            stmt.setString(130, this.id2.getText());
            String value1 = (String) exllent.getValue();
            stmt.setString(63, value1);

            String value2 = (String) good.getValue();
            stmt.setString(64, value2);

            String value3 = (String) fair.getValue();
            stmt.setString(65, value3);

            String value4 = (String) poor.getValue();
            stmt.setString(66, value4);


            stmt.execute();
            stmt.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Updated");
            alert.setHeaderText(null);
            alert.setContentText("Data Has Been Successfully Updated");
            alert.showAndWait();

        } catch (SQLException e) {
            System.err.println("Oooooooooops!!!");
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        clearFields();
        myCombo();
    }

    public void delete(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete?");
        alert.setHeaderText(null);
        alert.setContentText("Are You Sure To Delete?");
        Optional<ButtonType> action = alert.showAndWait();

        if (action.get() == ButtonType.OK) {
            try {

                Connection conn = dbConnection.getConnection();
                String delquery = "delete from block where OWNERFN = ?";
                PreparedStatement pr = conn.prepareStatement(delquery);
                pr.setString(1, ownerinfofirstname.getText());
                choose(null);
                chooseBuild(null);
                chooseSketch(null);
                pr.executeUpdate();

                pr.close();


            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        clearFields();
        listnames.setItems(null);
        myCombo();
    }

    private void myCombo() {
        listnames.setItems(namesList);
        try {
            Connection connection = dbConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM block");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                namesList.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        listnames.setOnMouseClicked((MouseEvent e) -> {
            try {
                String query = "SELECT * FROM block where OWNERFN = ?";
                Connection conn = dbConnection.getConnection();
                ResultSet rs;
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, listnames.getSelectionModel().getSelectedItem());
                rs = pst.executeQuery();

                while (rs.next()) {
                    this.id.setText(rs.getString(23));
                    this.docrefyear.setText(rs.getString(2));
                    this.id2.setText(rs.getString(130));
                    this.docrefobjectno.setText(rs.getString(3));
                    this.docrefpageno.setText(rs.getString(4));
                    this.proprefward.setText(rs.getString(5));
                    this.proprefmtaa.setText(rs.getString(6));
                    this.proprefrateblock.setText(rs.getString(7));
                    this.proprefobjectno.setText(rs.getString(8));
                    this.proprefbuildingno.setText(rs.getString(9));

                    this.proplocstreet.setText(rs.getString(10));
                    this.proplocplotno.setText(rs.getString(11));
                    this.proplocsurveyblock.setText(rs.getString(12));
                    this.proplocexistingrefno.setText(rs.getString(13));
                    this.proplocmapreference.setText(rs.getString(14));

                    String value = rs.getString(14);
                    proplochyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                                     @Override
                                                     public void handle(ActionEvent e) {
                                                         try {
                                                             Desktop.getDesktop().browse(new URI(value));
                                                         } catch (IOException e1) {
                                                             e1.printStackTrace();
                                                         } catch (URISyntaxException e1) {
                                                             e1.printStackTrace();
                                                         }
                                                     }
                                                 }
                    );


                    this.individualfirstname.setText(rs.getString(15));
                    this.individualmiddlename.setText(rs.getString(16));
                    this.individuallastname.setText(rs.getString(17));
                    this.individualphone1.setText(rs.getString(18));
                    this.individualphone2.setText(rs.getString(19));

                    this.legalentityfullcompanyname.setText(rs.getString(20));
                    this.legalentityphone1.setText(rs.getString(21));
                    this.legalentityphone2.setText(rs.getString(22));
                    this.ownerinfofirstname.setText(rs.getString(1));
                    this.ownerinfomiddlename.setText(rs.getString(24));
                    this.ownerinfolastname.setText(rs.getString(25));
                    this.ownerinfophone1.setText(rs.getString(26));
                    this.ownerinfophone2.setText(rs.getString(27));
                    this.ownerinfostreet.setText(rs.getString(28));
                    this.ownerinfoplotno.setText(rs.getString(29));
                    this.ownerinfopobox.setText(rs.getString(30));
                    this.ownerinforegion.setText(rs.getString(31));
                    this.ownerinfodistrict.setText(rs.getString(32));
                    this.ownerinfoward.setText(rs.getString(33));
                    this.ownerinfomtaa.setText(rs.getString(34));
                    this.ownerinfoemail.setText(rs.getString(35));

                    if (rs.getString(127) != null) {
                        nonrateable.setSelected(false);
                        nonrateable1.setSelected(false);
                        System.out.println(rs.getString(127));

                        String nonrateString = rs.getString(127).replace("[", "").replace("]", "");
                        System.out.println(nonrateString);

                        List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                        System.out.println(noneList);
                        for (String non : noneList) {
                            switch (non) {
                                case "Rateable":
                                    nonrateable.setSelected(true);
                                    break;
                                case "Non-\n" +
                                        "Rateable":
                                    nonrateable1.setSelected(true);
                                    break;
                                default:
                                    nonrateable.setSelected(false);
                                    nonrateable1.setSelected(false);
                            }
                        }
                    } else {
                        nonrateable.setSelected(false);
                        nonrateable1.setSelected(false);
                    }

                    if (rs.getString(128) != null) {
                        individual.setSelected(false);
                        System.out.println(rs.getString(128));

                        String nonrateString = rs.getString(128).replace("[", "").replace("]", "");
                        System.out.println(nonrateString);

                        List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                        System.out.println(noneList);
                        for (String non : noneList) {
                            switch (non) {
                                case "Individual":
                                    individual.setSelected(true);
                                    break;
                                default:
                                    individual.setSelected(false);
                            }
                        }
                    } else {
                        individual.setSelected(false);
                    }

                    if (rs.getString(129) != null) {
                        legalentity.setSelected(false);
                        System.out.println(rs.getString(129));

                        String nonrateString = rs.getString(129).replace("[", "").replace("]", "");
                        System.out.println(nonrateString);

                        List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                        System.out.println(noneList);
                        for (String non : noneList) {
                            switch (non) {
                                case "Legal\n" +
                                        "Entity":
                                    legalentity.setSelected(true);
                                    break;
                                default:
                                    legalentity.setSelected(false);
                            }
                        }
                    } else {
                        legalentity.setSelected(false);
                    }

                    //cbtenure
                    if (rs.getString(36) != null) {
                        tenureuntitled.setSelected(false);
                        tenureresoccupier.setSelected(false);
                        tenurelease.setSelected(false);
                        tenurereslicensee.setSelected(false);
                        System.out.println(rs.getString(36));

                        String tenureString = rs.getString(36).replace("[", "").replace("]", "");
                        System.out.println(tenureString);

                        List<String> tenureList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                        System.out.println(tenureList);

                        for (String tenu : tenureList) {
                            switch (tenu) {
                                case "Leasehold":
                                    tenurelease.setSelected(true);
                                    break;
                                case "Res/Occupier":
                                    tenureresoccupier.setSelected(true);
                                    break;
                                case "Res/Licensee":
                                    tenureresoccupier.setSelected(true);
                                    break;
                                case "Untitled":
                                    tenureuntitled.setSelected(true);
                                    break;
                                default:
                                    tenureuntitled.setSelected(false);
                                    tenureresoccupier.setSelected(false);
                                    tenurelease.setSelected(false);
                                    tenurereslicensee.setSelected(false);
                            }
                        }
                    } else {
                        tenureuntitled.setSelected(false);
                        tenureresoccupier.setSelected(false);
                        tenurelease.setSelected(false);
                        tenurereslicensee.setSelected(false);
                    }

                    //cbland
                    if (rs.getString(37) != null) {
                        landuseother.setSelected(false);
                        landuseinstitution.setSelected(false);
                        landuseindustrial.setSelected(false);
                        landusecommres.setSelected(false);
                        landusecommercial.setSelected(false);
                        landuseresidential.setSelected(false);
                        System.out.println(rs.getString(37));

                        String landString = rs.getString(37).replace("[", "").replace("]", "");
                        System.out.println(landString);

                        List<String> landList = Arrays.asList(landString.split("\\s*,\\s*"));
                        System.out.println(landList);

                        for (String land : landList) {
                            switch (land) {
                                case "Residential":
                                    landuseresidential.setSelected(true);
                                    break;
                                case "Commercial":
                                    landusecommercial.setSelected(true);
                                    break;
                                case "Comm/Residential":
                                    landusecommres.setSelected(true);
                                    break;
                                case "Industrial":
                                    landuseindustrial.setSelected(true);
                                    break;
                                case "institutional":
                                    landuseinstitution.setSelected(true);
                                    break;
                                case "other":
                                    landuseother.setSelected(true);
                                    break;
                                default:
                                    landuseother.setSelected(false);
                                    landuseinstitution.setSelected(false);
                                    landuseindustrial.setSelected(false);
                                    landusecommres.setSelected(false);
                                    landusecommercial.setSelected(false);
                                    landuseresidential.setSelected(false);
                            }
                        }
                    } else {
                        landuseother.setSelected(false);
                        landuseinstitution.setSelected(false);
                        landuseindustrial.setSelected(false);
                        landusecommres.setSelected(false);
                        landusecommercial.setSelected(false);
                        landuseresidential.setSelected(false);
                    }

                    this.actualtransaction.setText(rs.getString(38) + "/= Tsh");
                    ((TextField) transactiondate.getEditor()).setText(rs.getString(39));

                    //cbsoi
                    if (rs.getString(40) != null) {
                        sourceofinfoother.setSelected(false);
                        sourceofinfobroker.setSelected(false);
                        sourceofinfobank.setSelected(false);
                        sourceofinfogovt.setSelected(false);
                        sourceofinfovaluer.setSelected(false);
                        sourceofinfonotary.setSelected(false);
                        sourceofinfobuyer.setSelected(false);
                        System.out.println(rs.getString(40));

                        String soiString = rs.getString(40).replace("[", "").replace("]", "");
                        System.out.println(soiString);

                        List<String> soiList = Arrays.asList(soiString.split("\\s*,\\s*"));
                        System.out.println(soiList);

                        for (String soi : soiList) {
                            switch (soi) {
                                case "Buyer/Seller":
                                    sourceofinfobuyer.setSelected(true);
                                    break;
                                case "Notary":
                                    sourceofinfonotary.setSelected(true);
                                    break;
                                case "Valuer":
                                    sourceofinfovaluer.setSelected(true);
                                    break;
                                case "Gov't Institution":
                                    sourceofinfogovt.setSelected(true);
                                    break;
                                case "Bank":
                                    sourceofinfobank.setSelected(true);
                                    break;
                                case "Property Broker":
                                    sourceofinfoother.setSelected(true);
                                    break;
                                case "Other":
                                    sourceofinfobroker.setSelected(true);
                                    break;
                                default:
                                    sourceofinfoother.setSelected(false);
                                    sourceofinfobroker.setSelected(false);
                                    sourceofinfobank.setSelected(false);
                                    sourceofinfogovt.setSelected(false);
                                    sourceofinfovaluer.setSelected(false);
                                    sourceofinfonotary.setSelected(false);
                                    sourceofinfobuyer.setSelected(false);
                            }
                        }
                    } else {
                        sourceofinfoother.setSelected(false);
                        sourceofinfobroker.setSelected(false);
                        sourceofinfobank.setSelected(false);
                        sourceofinfogovt.setSelected(false);
                        sourceofinfovaluer.setSelected(false);
                        sourceofinfonotary.setSelected(false);
                        sourceofinfobuyer.setSelected(false);
                    }
                    this.noofstories.setText(rs.getString(41));
                    this.complete.setText(rs.getString(42) + "%");

                    //cbcomm
                    if (rs.getString(43) != null) {
                        commstoragetank.setSelected(false);
                        commshopresta.setSelected(false);
                        commpetrolstation.setSelected(false);
                        commother.setSelected(false);
                        commofficebank.setSelected(false);
                        commmallstore.setSelected(false);
                        commhotel.setSelected(false);
                        commfactorywarehouse.setSelected(false);
                        System.out.println(rs.getString(43));

                        String commString = rs.getString(43).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Factory/\n" +
                                        "Warehouse":
                                    commfactorywarehouse.setSelected(true);
                                    break;
                                case "Hotel":
                                    commhotel.setSelected(true);
                                    break;
                                case "Shopping Malll/\n" +
                                        "Dept. Store":
                                    commmallstore.setSelected(true);
                                    break;
                                case "Office/Bank":
                                    commofficebank.setSelected(true);
                                    break;
                                case "Other":
                                    commother.setSelected(true);
                                    break;
                                case "Petrol Station":
                                    commpetrolstation.setSelected(true);
                                    break;
                                case "Shop/Restaurant/\n" +
                                        "bar":
                                    commshopresta.setSelected(true);
                                    break;
                                case "Storage Tank":
                                    commstoragetank.setSelected(true);
                                    break;
                                default:
                                    commstoragetank.setSelected(false);
                                    commshopresta.setSelected(false);
                                    commpetrolstation.setSelected(false);
                                    commother.setSelected(false);
                                    commofficebank.setSelected(false);
                                    commmallstore.setSelected(false);
                                    commhotel.setSelected(false);
                                    commfactorywarehouse.setSelected(false);
                            }
                        }
                    } else {
                        commstoragetank.setSelected(false);
                        commshopresta.setSelected(false);
                        commpetrolstation.setSelected(false);
                        commother.setSelected(false);
                        commofficebank.setSelected(false);
                        commmallstore.setSelected(false);
                        commhotel.setSelected(false);
                        commfactorywarehouse.setSelected(false);
                    }

                    //cbcinsti
                    if (rs.getString(44) != null) {
                        instiworship.setSelected(false);
                        instischool.setSelected(false);
                        instisport.setSelected(false);
                        instiother.setSelected(false);
                        instigovt.setSelected(false);
                        insticlinical.setSelected(false);
                        System.out.println(rs.getString(44));

                        String commString = rs.getString(44).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Clinical/Hospital":
                                    insticlinical.setSelected(true);
                                    break;
                                case "Government":
                                    instigovt.setSelected(true);
                                    break;
                                case "Other":
                                    instiother.setSelected(true);
                                    break;
                                case "Sport/Recreation":
                                    instisport.setSelected(true);
                                    break;
                                case "School":
                                    instischool.setSelected(true);
                                    break;
                                case "Worship":
                                    instiworship.setSelected(true);
                                    break;
                                default:
                                    instiworship.setSelected(false);
                                    instischool.setSelected(false);
                                    instisport.setSelected(false);
                                    instiother.setSelected(false);
                                    instigovt.setSelected(false);
                            }
                        }
                    } else {
                        instiworship.setSelected(false);
                        instischool.setSelected(false);
                        instisport.setSelected(false);
                        instiother.setSelected(false);
                        instigovt.setSelected(false);
                    }

                    //cbres
                    if (rs.getString(45) != null) {
                        resvilla.setSelected(false);
                        ressemidetached.setSelected(false);
                        resother.setSelected(false);
                        resmaisonette.setSelected(false);
                        resdetatached.setSelected(false);
                        resapartment.setSelected(false);
                        System.out.println(rs.getString(45));

                        String commString = rs.getString(45).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Apartment":
                                    resapartment.setSelected(true);
                                    break;
                                case "Detached House":
                                    resdetatached.setSelected(true);
                                    break;
                                case "Maisonette":
                                    resmaisonette.setSelected(true);
                                    break;
                                case "Other":
                                    resother.setSelected(true);
                                    break;
                                case "Villa":
                                    resvilla.setSelected(true);
                                    break;
                                case "Semi-Detached":
                                    ressemidetached.setSelected(true);
                                    break;
                                default:
                                    resvilla.setSelected(false);
                                    ressemidetached.setSelected(false);
                                    resother.setSelected(false);
                                    resmaisonette.setSelected(false);
                                    resdetatached.setSelected(false);
                                    resapartment.setSelected(false);
                            }
                        }
                    } else {
                        resvilla.setSelected(false);
                        ressemidetached.setSelected(false);
                        resother.setSelected(false);
                        resmaisonette.setSelected(false);
                        resdetatached.setSelected(false);
                        resapartment.setSelected(false);
                    }

                    ((TextField) coyear.getEditor()).setText(rs.getString(46));
                    ((TextField) recoyear.getEditor()).setText(rs.getString(47));


                    //cbroof
                    if (rs.getString(48) != null) {
                        rooftilescement.setSelected(false);
                        roofother.setSelected(false);
                        roofironsheet.setSelected(false);
                        roofharveytiles.setSelected(false);
                        roofgrass.setSelected(false);
                        roofconcrete.setSelected(false);
                        roofasbestos.setSelected(false);
                        System.out.println(rs.getString(48));

                        String commString = rs.getString(48).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Asbestos":
                                    roofasbestos.setSelected(true);
                                    break;
                                case "Concrete":
                                    roofconcrete.setSelected(true);
                                    break;
                                case "Grass/Palm":
                                    roofgrass.setSelected(true);
                                    break;
                                case "Harvey Tiles":
                                    roofharveytiles.setSelected(true);
                                    break;
                                case "Iron Sheet":
                                    roofironsheet.setSelected(true);
                                    break;
                                case "Tiles/Cement":
                                    rooftilescement.setSelected(true);
                                    break;
                                case "Mangalore":
                                    roofother.setSelected(true);
                                    break;
                                default:
                                    rooftilescement.setSelected(false);
                                    roofother.setSelected(false);
                                    roofironsheet.setSelected(false);
                                    roofharveytiles.setSelected(false);
                                    roofgrass.setSelected(false);
                                    roofconcrete.setSelected(false);
                                    roofasbestos.setSelected(false);
                            }
                        }
                    } else {
                        rooftilescement.setSelected(false);
                        roofother.setSelected(false);
                        roofironsheet.setSelected(false);
                        roofharveytiles.setSelected(false);
                        roofgrass.setSelected(false);
                        roofconcrete.setSelected(false);
                        roofasbestos.setSelected(false);
                    }

                    //cbextwa
                    if (rs.getString(49) != null) {
                        exteriorwallother.setSelected(false);
                        exteriorwallmud.setSelected(false);
                        exteriorwallhydraform.setSelected(false);
                        exteriorwalltimber.setSelected(false);
                        exteriorwallglass.setSelected(false);
                        exteriorwallconcframe.setSelected(false);
                        exteriorwallcementblock.setSelected(false);
                        exteriorwallburntbricks.setSelected(false);
                        System.out.println(rs.getString(49));

                        String commString = rs.getString(49).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Burnt Bricks":
                                    exteriorwallburntbricks.setSelected(true);
                                    break;
                                case "Cement Block":
                                    exteriorwallcementblock.setSelected(true);
                                    break;
                                case "R/Conc Frame":
                                    exteriorwallconcframe.setSelected(true);
                                    break;
                                case "Glass":
                                    exteriorwallglass.setSelected(true);
                                    break;
                                case "Timber":
                                    exteriorwalltimber.setSelected(true);
                                    break;
                                case "Hydraform":
                                    exteriorwallhydraform.setSelected(true);
                                    break;
                                case "Mud":
                                    exteriorwallmud.setSelected(true);
                                    break;
                                case "Other":
                                    exteriorwallother.setSelected(true);
                                    break;
                                default:
                                    exteriorwallother.setSelected(false);
                                    exteriorwallmud.setSelected(false);
                                    exteriorwallhydraform.setSelected(false);
                                    exteriorwalltimber.setSelected(false);
                                    exteriorwallglass.setSelected(false);
                                    exteriorwallconcframe.setSelected(false);
                                    exteriorwallcementblock.setSelected(false);
                                    exteriorwallburntbricks.setSelected(false);
                            }
                        }
                    } else {
                        exteriorwallother.setSelected(false);
                        exteriorwallmud.setSelected(false);
                        exteriorwallhydraform.setSelected(false);
                        exteriorwalltimber.setSelected(false);
                        exteriorwallglass.setSelected(false);
                        exteriorwallconcframe.setSelected(false);
                        exteriorwallcementblock.setSelected(false);
                        exteriorwallburntbricks.setSelected(false);
                    }

                    //cbextfin
                    if (rs.getString(50) != null) {
                        exteriorfinishcompact.setSelected(false);
                        exteriorfinishglazed.setSelected(false);
                        exteriorfinishfair.setSelected(false);
                        exteriorfinishother.setSelected(false);
                        exteriorfinishplaster.setSelected(false);
                        exteriorfinishtiles.setSelected(false);
                        exteriorfinishtyrolean.setSelected(false);
                        System.out.println(rs.getString(50));

                        String commString = rs.getString(50).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Tyrolean":
                                    exteriorfinishtyrolean.setSelected(true);
                                    break;
                                case "Tiles":
                                    exteriorfinishtiles.setSelected(true);
                                    break;
                                case "Plaster/Paint":
                                    exteriorfinishplaster.setSelected(true);
                                    break;
                                case "Other":
                                    exteriorfinishother.setSelected(true);
                                    break;
                                case "Fair Finish":
                                    exteriorfinishfair.setSelected(true);
                                    break;
                                case "Glazed":
                                    exteriorfinishglazed.setSelected(true);
                                    break;
                                case "Compact Earth":
                                    exteriorfinishcompact.setSelected(true);
                                    break;
                                default:
                                    exteriorfinishcompact.setSelected(false);
                                    exteriorfinishglazed.setSelected(false);
                                    exteriorfinishfair.setSelected(false);
                                    exteriorfinishother.setSelected(false);
                                    exteriorfinishplaster.setSelected(false);
                                    exteriorfinishtiles.setSelected(false);
                                    exteriorfinishtyrolean.setSelected(false);
                            }
                        }
                    } else {
                        exteriorfinishcompact.setSelected(false);
                        exteriorfinishglazed.setSelected(false);
                        exteriorfinishfair.setSelected(false);
                        exteriorfinishother.setSelected(false);
                        exteriorfinishplaster.setSelected(false);
                        exteriorfinishtiles.setSelected(false);
                        exteriorfinishtyrolean.setSelected(false);
                    }

                    //cbwindows
                    if (rs.getString(51) != null) {
                        windowswoodcasement.setSelected(false);
                        windowswoodabb.setSelected(false);
                        windowssteelframe.setSelected(false);
                        windowsother.setSelected(false);
                        windowsglass.setSelected(false);
                        windowsaluframe.setSelected(false);
                        System.out.println(rs.getString(51));

                        String commString = rs.getString(51).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Tyrolean":
                                    windowsaluframe.setSelected(true);
                                    break;
                                case "Tiles":
                                    windowsglass.setSelected(true);
                                    break;
                                case "Plaster/Paint":
                                    windowsother.setSelected(true);
                                    break;
                                case "Other":
                                    windowssteelframe.setSelected(true);
                                    break;
                                case "Fair Finish":
                                    windowswoodabb.setSelected(true);
                                    break;
                                case "Glazed":
                                    windowswoodcasement.setSelected(true);
                                    break;
                                default:
                                    windowswoodcasement.setSelected(false);
                                    windowswoodabb.setSelected(false);
                                    windowssteelframe.setSelected(false);
                                    windowsother.setSelected(false);
                                    windowsglass.setSelected(false);
                                    windowsaluframe.setSelected(false);
                            }
                        }
                    } else {
                        windowswoodcasement.setSelected(false);
                        windowswoodabb.setSelected(false);
                        windowssteelframe.setSelected(false);
                        windowsother.setSelected(false);
                        windowsglass.setSelected(false);
                        windowsaluframe.setSelected(false);
                    }

                    //cbdoors
                    if (rs.getString(52) != null) {
                        doorssteelshutters.setSelected(false);
                        doorswoodflush.setSelected(false);
                        doorswoodbattens.setSelected(false);
                        doorssteelsheets.setSelected(false);
                        doorsother.setSelected(false);
                        doorsalu.setSelected(false);
                        System.out.println(rs.getString(52));

                        String commString = rs.getString(52).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Alluminium":
                                    doorsalu.setSelected(true);
                                    break;
                                case "other":
                                    doorsother.setSelected(true);
                                    break;
                                case "Steel Sheets":
                                    doorssteelsheets.setSelected(true);
                                    break;
                                case "Wood Battens":
                                    doorswoodbattens.setSelected(true);
                                    break;
                                case "Wood Flush":
                                    doorswoodflush.setSelected(true);
                                    break;
                                case "Steel Shutters":
                                    doorssteelshutters.setSelected(true);
                                    break;
                                default:
                                    doorssteelshutters.setSelected(false);
                                    doorswoodflush.setSelected(false);
                                    doorswoodbattens.setSelected(false);
                                    doorssteelsheets.setSelected(false);
                                    doorsother.setSelected(false);
                                    doorsalu.setSelected(false);
                            }
                        }
                    } else {
                        doorssteelshutters.setSelected(false);
                        doorswoodflush.setSelected(false);
                        doorswoodbattens.setSelected(false);
                        doorssteelsheets.setSelected(false);
                        doorsother.setSelected(false);
                        doorsalu.setSelected(false);
                    }
                    //cbfloor
                    if (rs.getString(53) != null) {
                        floorwood.setSelected(false);
                        floortiles.setSelected(false);
                        floorother.setSelected(false);
                        floormarble.setSelected(false);
                        floorinsitu.setSelected(false);
                        floorcompact.setSelected(false);
                        floorcement.setSelected(false);
                        System.out.println(rs.getString(53));

                        String commString = rs.getString(53).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Cement Screed":
                                    floorcement.setSelected(true);
                                    break;
                                case "Compact Earth":
                                    floorcompact.setSelected(true);
                                    break;
                                case "In situ  Terazzo":
                                    floorinsitu.setSelected(true);
                                    break;
                                case "Marble/Granite":
                                    floormarble.setSelected(true);
                                    break;
                                case "Other":
                                    floorother.setSelected(true);
                                    break;
                                case "Tiles":
                                    floortiles.setSelected(true);
                                    break;
                                case "Wood /Parquet":
                                    floorwood.setSelected(true);
                                    break;
                                default:
                                    floorwood.setSelected(false);
                                    floortiles.setSelected(false);
                                    floorother.setSelected(false);
                                    floormarble.setSelected(false);
                                    floorinsitu.setSelected(false);
                                    floorcompact.setSelected(false);
                                    floorcement.setSelected(false);
                            }
                        }
                    } else {
                        floorwood.setSelected(false);
                        floortiles.setSelected(false);
                        floorother.setSelected(false);
                        floormarble.setSelected(false);
                        floorinsitu.setSelected(false);
                        floorcompact.setSelected(false);
                        floorcement.setSelected(false);
                    }

                    //cbceiling
                    if (rs.getString(54) != null) {
                        ceilingsuspended.setSelected(false);
                        ceilingsoftboard.setSelected(false);
                        ceilingplaster.setSelected(false);
                        ceilingother.setSelected(false);
                        ceilinggypsum.setSelected(false);
                        ceilingchipboard.setSelected(false);
                        ceilingwood.setSelected(false);
                        System.out.println(rs.getString(54));

                        String commString = rs.getString(54).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Wood tongue & grooved":
                                    ceilingwood.setSelected(true);
                                    break;
                                case "chipboard":
                                    ceilingchipboard.setSelected(true);
                                    break;
                                case "Gypsum":
                                    ceilinggypsum.setSelected(true);
                                    break;
                                case "Other":
                                    ceilingother.setSelected(true);
                                    break;
                                case "Plastered/Concrete":
                                    ceilingplaster.setSelected(true);
                                    break;
                                case "Softboard/Hardboard":
                                    ceilingsoftboard.setSelected(true);
                                    break;
                                case "Suspended/Acoustic":
                                    ceilingsuspended.setSelected(true);
                                    break;
                                default:
                                    ceilingsuspended.setSelected(false);
                                    ceilingsoftboard.setSelected(false);
                                    ceilingplaster.setSelected(false);
                                    ceilingother.setSelected(false);
                                    ceilinggypsum.setSelected(false);
                                    ceilingchipboard.setSelected(false);
                                    ceilingwood.setSelected(false);
                            }
                        }
                    } else {
                        ceilingsuspended.setSelected(false);
                        ceilingsoftboard.setSelected(false);
                        ceilingplaster.setSelected(false);
                        ceilingother.setSelected(false);
                        ceilinggypsum.setSelected(false);
                        ceilingchipboard.setSelected(false);
                        ceilingwood.setSelected(false);
                    }

                    this.nofloor.setText(rs.getString(55));
                    this.noroom.setText(rs.getString(56));


                    //cbwater
                    if (rs.getString(57) != null) {
                        waterriver.setSelected(false);
                        waterstandtap.setSelected(false);
                        waterrain.setSelected(false);
                        waternone.setSelected(false);
                        watermains.setSelected(false);
                        waterborehole.setSelected(false);
                        System.out.println(rs.getString(57));

                        String commString = rs.getString(57).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Borehole":
                                    waterborehole.setSelected(true);
                                    break;
                                case "Mains":
                                    watermains.setSelected(true);
                                    break;
                                case "None":
                                    waternone.setSelected(true);
                                    break;
                                case "Rain":
                                    waterrain.setSelected(true);
                                    break;
                                case "Stand Tap":
                                    waterstandtap.setSelected(true);
                                    break;
                                case "River/Stream":
                                    waterriver.setSelected(true);
                                    break;
                                default:
                                    waterriver.setSelected(false);
                                    waterstandtap.setSelected(false);
                                    waterrain.setSelected(false);
                                    waternone.setSelected(false);
                                    watermains.setSelected(false);
                                    waterborehole.setSelected(false);
                            }
                        }
                    } else {
                        waterriver.setSelected(false);
                        waterstandtap.setSelected(false);
                        waterrain.setSelected(false);
                        waternone.setSelected(false);
                        watermains.setSelected(false);
                        waterborehole.setSelected(false);
                    }

                    //cbdrainage
                    if (rs.getString(58) != null) {
                        drainagesewer.setSelected(false);
                        drainageptictank.setSelected(false);
                        drainagepitlatrine.setSelected(false);
                        drainageother.setSelected(false);
                        drainagenone.setSelected(false);
                        ceilingwood.setSelected(false);
                        System.out.println(rs.getString(58));

                        String commString = rs.getString(58).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "None":
                                    drainagenone.setSelected(true);
                                    break;
                                case "Other":
                                    drainageother.setSelected(true);
                                    break;
                                case "Pit Latrine":
                                    drainagepitlatrine.setSelected(true);
                                    break;
                                case "Septic Tank":
                                    drainageptictank.setSelected(true);
                                    break;
                                case "Sewer":
                                    drainagesewer.setSelected(true);
                                    break;
                                default:
                                    drainagesewer.setSelected(false);
                                    drainageptictank.setSelected(false);
                                    drainagepitlatrine.setSelected(false);
                                    drainageother.setSelected(false);
                                    drainagenone.setSelected(false);
                                    ceilingwood.setSelected(false);
                            }
                        }
                    } else {
                        drainagesewer.setSelected(false);
                        drainageptictank.setSelected(false);
                        drainagepitlatrine.setSelected(false);
                        drainageother.setSelected(false);
                        drainagenone.setSelected(false);
                        ceilingwood.setSelected(false);
                    }

                    //cbelectricity
                    if (rs.getString(59) != null) {
                        electricitysolar.setSelected(false);
                        electricitynone.setSelected(false);
                        electricitymains.setSelected(false);
                        System.out.println(rs.getString(59));

                        String commString = rs.getString(59).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "None":
                                    electricitynone.setSelected(true);
                                    break;
                                case "Mains":
                                    electricitymains.setSelected(true);
                                    break;
                                case "Solar":
                                    electricitysolar.setSelected(true);
                                    break;
                                default:
                                    electricitysolar.setSelected(false);
                                    electricitynone.setSelected(false);
                                    electricitymains.setSelected(false);
                            }
                        }
                    } else {
                        electricitysolar.setSelected(false);
                        electricitynone.setSelected(false);
                        electricitymains.setSelected(false);
                    }

                    //cbhq
                    if (rs.getString(60) != null) {
                        hqwashhand.setSelected(false);
                        hqnone.setSelected(false);
                        hqkitchencabinet.setSelected(false);
                        hqjacuzzi.setSelected(false);
                        hqhighpowder.setSelected(false);
                        hqbuiltin.setSelected(false);
                        System.out.println(rs.getString(60));

                        String commString = rs.getString(60).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Built-in \n" +
                                        "Wardrobe":
                                    hqbuiltin.setSelected(true);
                                    break;
                                case "High-Powder\n" +
                                        "WC":
                                    hqhighpowder.setSelected(true);
                                    break;
                                case "Jacuzzi/\n" +
                                        "Sauna":
                                    hqjacuzzi.setSelected(true);
                                    break;
                                case "Kitchen \n" +
                                        "Cabinet":
                                    hqkitchencabinet.setSelected(true);
                                    break;
                                case "None":
                                    hqnone.setSelected(true);
                                    break;
                                case "Wash hand\n" +
                                        "Basin":
                                    hqwashhand.setSelected(true);
                                    break;
                                default:
                                    hqwashhand.setSelected(false);
                                    hqnone.setSelected(false);
                                    hqkitchencabinet.setSelected(false);
                                    hqjacuzzi.setSelected(false);
                                    hqhighpowder.setSelected(false);
                                    hqbuiltin.setSelected(false);
                            }
                        }
                    } else {
                        hqwashhand.setSelected(false);
                        hqnone.setSelected(false);
                        hqkitchencabinet.setSelected(false);
                        hqjacuzzi.setSelected(false);
                        hqhighpowder.setSelected(false);
                        hqbuiltin.setSelected(false);
                    }
                    //cbgq
                    if (rs.getString(61) != null) {
                        gqwesterntoilet.setSelected(false);
                        gqwashhand.setSelected(false);
                        gqnone.setSelected(false);
                        gqkitchen.setSelected(false);
                        gqbuiltin.setSelected(false);
                        gqbathtubs.setSelected(false);
                        System.out.println(rs.getString(61));

                        String commString = rs.getString(61).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Bath Tubs":
                                    gqbathtubs.setSelected(true);
                                    break;
                                case "Built-in \n" +
                                        "Wardrobe":
                                    gqbuiltin.setSelected(true);
                                    break;
                                case "Kitchen \n" +
                                        "Cupboards":
                                    gqkitchen.setSelected(true);
                                    break;
                                case "None":
                                    gqnone.setSelected(true);
                                    break;
                                case "Wash hand\n" +
                                        "Basin":
                                    gqwashhand.setSelected(true);
                                    break;
                                case "Western Toilet/\n" +
                                        "Eastern WC":
                                    gqwesterntoilet.setSelected(true);
                                    break;
                                default:
                                    gqwesterntoilet.setSelected(false);
                                    gqwashhand.setSelected(false);
                                    gqnone.setSelected(false);
                                    gqkitchen.setSelected(false);
                                    gqbuiltin.setSelected(false);
                                    gqbathtubs.setSelected(false);
                            }
                        }
                    } else {
                        gqwesterntoilet.setSelected(false);
                        gqwashhand.setSelected(false);
                        gqnone.setSelected(false);
                        gqkitchen.setSelected(false);
                        gqbuiltin.setSelected(false);
                        gqbathtubs.setSelected(false);
                    }

                    //cbamenit
                    if (rs.getString(62) != null) {
                        amenitiespool.setSelected(false);
                        amenitiesnone.setSelected(false);
                        amenitieslift.setSelected(false);
                        amenitiesfire.setSelected(false);
                        amenitiescentralcooling.setSelected(false);
                        System.out.println(rs.getString(62));

                        String commString = rs.getString(62).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Central Cooling\n" +
                                        "System":
                                    amenitiescentralcooling.setSelected(true);
                                    break;
                                case "Fire Fighting\n" +
                                        "System":
                                    amenitiesfire.setSelected(true);
                                    break;
                                case "Lift/\n" +
                                        "Escalator":
                                    amenitieslift.setSelected(true);
                                    break;
                                case "None":
                                    amenitiesnone.setSelected(true);
                                    break;
                                case "Swimming Pool":
                                    amenitiespool.setSelected(true);
                                    break;
                                default:
                                    amenitiespool.setSelected(false);
                                    amenitiesnone.setSelected(false);
                                    amenitieslift.setSelected(false);
                                    amenitiesfire.setSelected(false);
                                    amenitiescentralcooling.setSelected(false);
                            }
                        }
                    } else {
                        amenitiespool.setSelected(false);
                        amenitiesnone.setSelected(false);
                        amenitieslift.setSelected(false);
                        amenitiesfire.setSelected(false);
                        amenitiescentralcooling.setSelected(false);
                    }

                    this.exllent.setValue(rs.getString(63));
                    this.good.setValue(rs.getString(64));
                    this.fair.setValue(rs.getString(65));
                    this.poor.setValue(rs.getString(66));

                    //cbroad
                    if (rs.getString(67) != null) {
                        roadtarmac.setSelected(false);
                        roadother.setSelected(false);
                        roadnone.setSelected(false);
                        roadmurram.setSelected(false);
                        roadfootpath.setSelected(false);
                        roadearth.setSelected(false);
                        System.out.println(rs.getString(67));

                        String commString = rs.getString(67).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Earth":
                                    roadearth.setSelected(true);
                                    break;
                                case "Footpath":
                                    roadfootpath.setSelected(true);
                                    break;
                                case "Murram/Gravel":
                                    roadmurram.setSelected(true);
                                    break;
                                case "None":
                                    roadnone.setSelected(true);
                                    break;
                                case "Other":
                                    roadother.setSelected(true);
                                    break;
                                case "Tarmac":
                                    roadtarmac.setSelected(true);
                                    break;
                                default:
                                    roadtarmac.setSelected(false);
                                    roadother.setSelected(false);
                                    roadnone.setSelected(false);
                                    roadmurram.setSelected(false);
                                    roadfootpath.setSelected(false);
                                    roadearth.setSelected(false);
                            }
                        }
                    } else {
                        roadtarmac.setSelected(false);
                        roadother.setSelected(false);
                        roadnone.setSelected(false);
                        roadmurram.setSelected(false);
                        roadfootpath.setSelected(false);
                        roadearth.setSelected(false);
                    }

                    //cbroad
                    if (rs.getString(68) != null) {
                        fencetimber.setSelected(false);
                        fencesteel.setSelected(false);
                        fenceplant.setSelected(false);
                        fencenone.setSelected(false);
                        fencehydraform.setSelected(false);
                        fencechainlink.setSelected(false);
                        fencecement.setSelected(false);
                        System.out.println(rs.getString(68));

                        String commString = rs.getString(68).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Cement Blocks":
                                    fencecement.setSelected(true);
                                    break;
                                case "Chain Link":
                                    fencechainlink.setSelected(true);
                                    break;
                                case "Hydraform":
                                    fencehydraform.setSelected(true);
                                    break;
                                case "None":
                                    fencenone.setSelected(true);
                                    break;
                                case "Plant/Hedge":
                                    fenceplant.setSelected(true);
                                    break;
                                case "Steel":
                                    fencesteel.setSelected(true);
                                    break;
                                case "Timber":
                                    fencetimber.setSelected(true);
                                    break;
                                default:
                                    fencetimber.setSelected(false);
                                    fencesteel.setSelected(false);
                                    fenceplant.setSelected(false);
                                    fencenone.setSelected(false);
                                    fencehydraform.setSelected(false);
                                    fencechainlink.setSelected(false);
                                    fencecement.setSelected(false);
                            }
                        }
                    } else {
                        fencetimber.setSelected(false);
                        fencesteel.setSelected(false);
                        fenceplant.setSelected(false);
                        fencenone.setSelected(false);
                        fencehydraform.setSelected(false);
                        fencechainlink.setSelected(false);
                        fencecement.setSelected(false);
                    }

                    //cbcomp
                    if (rs.getString(69) != null) {
                        compoundother.setSelected(false);
                        compoundtarmac.setSelected(false);
                        compoundnone.setSelected(false);
                        compoundlawn.setSelected(false);
                        compoundinterblocks.setSelected(false);
                        compoundconcrete.setSelected(false);
                        System.out.println(rs.getString(69));

                        String commString = rs.getString(69).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Concrete/Slabs":
                                    compoundconcrete.setSelected(true);
                                    break;
                                case "Interlocking Blocks":
                                    compoundinterblocks.setSelected(true);
                                    break;
                                case "Lawn/Garden":
                                    compoundlawn.setSelected(true);
                                    break;
                                case "None":
                                    compoundnone.setSelected(true);
                                    break;
                                case "Tarmac":
                                    compoundtarmac.setSelected(true);
                                    break;
                                case "Other":
                                    compoundother.setSelected(true);
                                    break;
                                default:
                                    compoundother.setSelected(false);
                                    compoundtarmac.setSelected(false);
                                    compoundnone.setSelected(false);
                                    compoundlawn.setSelected(false);
                                    compoundinterblocks.setSelected(false);
                                    compoundconcrete.setSelected(false);
                            }
                        }
                    } else {
                        compoundother.setSelected(false);
                        compoundtarmac.setSelected(false);
                        compoundnone.setSelected(false);
                        compoundlawn.setSelected(false);
                        compoundinterblocks.setSelected(false);
                        compoundconcrete.setSelected(false);
                    }
                    //cbobno1
                    if (rs.getString(71) != null) {
                        obno1workshop.setSelected(false);
                        obno1store.setSelected(false);
                        obno1servants.setSelected(false);
                        obno1other.setSelected(false);
                        obno1garage.setSelected(false);
                        System.out.println(rs.getString(71));

                        String commString = rs.getString(71).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno1garage.setSelected(true);
                                    break;
                                case "Other":
                                    obno1other.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno1servants.setSelected(true);
                                    break;
                                case "Store":
                                    obno1store.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno1workshop.setSelected(true);
                                    break;
                                default:
                                    obno1workshop.setSelected(false);
                                    obno1store.setSelected(false);
                                    obno1servants.setSelected(false);
                                    obno1other.setSelected(false);
                                    obno1garage.setSelected(false);
                            }
                        }
                    } else {
                        obno1workshop.setSelected(false);
                        obno1store.setSelected(false);
                        obno1servants.setSelected(false);
                        obno1other.setSelected(false);
                        obno1garage.setSelected(false);
                    }//cbobno1
                    if (rs.getString(71) != null) {
                        obno1workshop.setSelected(false);
                        obno1store.setSelected(false);
                        obno1servants.setSelected(false);
                        obno1other.setSelected(false);
                        obno1garage.setSelected(false);
                        System.out.println(rs.getString(71));

                        String commString = rs.getString(71).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno1garage.setSelected(true);
                                    break;
                                case "Other":
                                    obno1other.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno1servants.setSelected(true);
                                    break;
                                case "Store":
                                    obno1store.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno1workshop.setSelected(true);
                                    break;
                                default:
                                    obno1workshop.setSelected(false);
                                    obno1store.setSelected(false);
                                    obno1servants.setSelected(false);
                                    obno1other.setSelected(false);
                                    obno1garage.setSelected(false);
                            }
                        }
                    } else {
                        obno1workshop.setSelected(false);
                        obno1store.setSelected(false);
                        obno1servants.setSelected(false);
                        obno1other.setSelected(false);
                        obno1garage.setSelected(false);
                    }
                    //cbobnone
                    if (rs.getString(70) != null) {
                        obnone.setSelected(false);
                        System.out.println(rs.getString(70));

                        String commString = rs.getString(70).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "None":
                                    obnone.setSelected(true);
                                    break;
                                default:
                                    obnone.setSelected(false);
                            }
                        }
                    } else {
                        obnone.setSelected(false);
                    }

                    String ob1 = rs.getString(72);
                    obno1hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                                   @Override
                                                   public void handle(ActionEvent e) {
                                                       try {
                                                           Desktop.getDesktop().browse(new URI(ob1));
                                                       } catch (IOException e1) {
                                                           e1.printStackTrace();
                                                       } catch (URISyntaxException e1) {
                                                           e1.printStackTrace();
                                                       }
                                                   }
                                               }
                    );

                    //cbobno2
                    if (rs.getString(73) != null) {
                        obno2workshop.setSelected(false);
                        obno2store.setSelected(false);
                        obno2servants.setSelected(false);
                        obno2other.setSelected(false);
                        obno2garage.setSelected(false);
                        System.out.println(rs.getString(73));

                        String commString = rs.getString(73).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno2garage.setSelected(true);
                                    break;
                                case "Other":
                                    obno2other.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno2servants.setSelected(true);
                                    break;
                                case "Store":
                                    obno2store.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno2workshop.setSelected(true);
                                    break;
                                default:
                                    obno2workshop.setSelected(false);
                                    obno2store.setSelected(false);
                                    obno2servants.setSelected(false);
                                    obno2other.setSelected(false);
                                    obno2garage.setSelected(false);
                            }
                        }
                    } else {
                        obno2workshop.setSelected(false);
                        obno2store.setSelected(false);
                        obno2servants.setSelected(false);
                        obno2other.setSelected(false);
                        obno2garage.setSelected(false);
                    }

                    String ob2 = rs.getString(74);
                    obno2hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                                   @Override
                                                   public void handle(ActionEvent e) {
                                                       try {
                                                           Desktop.getDesktop().browse(new URI(ob2));
                                                       } catch (IOException e1) {
                                                           e1.printStackTrace();
                                                       } catch (URISyntaxException e1) {
                                                           e1.printStackTrace();
                                                       }
                                                   }
                                               }
                    );

                    //cbobno3
                    if (rs.getString(75) != null) {
                        obno3workshop.setSelected(false);
                        obno3store.setSelected(false);
                        obno3servants.setSelected(false);
                        obno3other.setSelected(false);
                        obno3garage.setSelected(false);
                        System.out.println(rs.getString(75));

                        String commString = rs.getString(75).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno3garage.setSelected(true);
                                    break;
                                case "Other":
                                    obno3other.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno3servants.setSelected(true);
                                    break;
                                case "Store":
                                    obno3store.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno3workshop.setSelected(true);
                                    break;
                                default:
                                    obno3workshop.setSelected(false);
                                    obno3store.setSelected(false);
                                    obno3servants.setSelected(false);
                                    obno3other.setSelected(false);
                                    obno3garage.setSelected(false);
                            }
                        }
                    } else {
                        obno3workshop.setSelected(false);
                        obno3store.setSelected(false);
                        obno3servants.setSelected(false);
                        obno3other.setSelected(false);
                        obno3garage.setSelected(false);
                    }

                    String ob3 = rs.getString(76);
                    obno3hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                                   @Override
                                                   public void handle(ActionEvent e) {
                                                       try {
                                                           Desktop.getDesktop().browse(new URI(ob3));
                                                       } catch (IOException e1) {
                                                           e1.printStackTrace();
                                                       } catch (URISyntaxException e1) {
                                                           e1.printStackTrace();
                                                       }
                                                   }
                                               }
                    );

                    //cbobno4
                    if (rs.getString(77) != null) {
                        obno4workshop.setSelected(false);
                        obno4store.setSelected(false);
                        obno4servants.setSelected(false);
                        obno4other.setSelected(false);
                        obno4garage.setSelected(false);
                        System.out.println(rs.getString(77));

                        String commString = rs.getString(77).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno4garage.setSelected(true);
                                    break;
                                case "Other":
                                    obno4other.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno4servants.setSelected(true);
                                    break;
                                case "Store":
                                    obno4store.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno4workshop.setSelected(true);
                                    break;
                                default:
                                    obno4workshop.setSelected(false);
                                    obno4store.setSelected(false);
                                    obno4servants.setSelected(false);
                                    obno4other.setSelected(false);
                                    obno4garage.setSelected(false);
                            }
                        }
                    } else {
                        obno4workshop.setSelected(false);
                        obno4store.setSelected(false);
                        obno4servants.setSelected(false);
                        obno4other.setSelected(false);
                        obno4garage.setSelected(false);
                    }

                    String ob4 = rs.getString(78);
                    obno4hyperlink.setOnAction(new EventHandler<ActionEvent>() {
                                                   @Override
                                                   public void handle(ActionEvent e) {
                                                       try {
                                                           Desktop.getDesktop().browse(new URI(ob4));
                                                       } catch (IOException e1) {
                                                           e1.printStackTrace();
                                                       } catch (URISyntaxException e1) {
                                                           e1.printStackTrace();
                                                       }
                                                   }
                                               }
                    );

                    Image image1 = new Image(rs.getBinaryStream(79));
                    sketchphoto.setImage(image1);


                    Image image2 = new Image(rs.getBinaryStream(80));
                    buildphoto1.setImage(image2);

                    Image image3 = new Image(rs.getBinaryStream(81));
                    buildphoto2.setImage(image3);

                    this.noofbaths.setText(rs.getString(82));
                    this.nooftoilets.setText(rs.getString(83));
                    this.mblen.setText(rs.getString(84));
                    this.mbwid.setText(rs.getString(85));
                    this.mbarea.setText(rs.getString(86));
                    this.mbredfact.setText(rs.getString(87));
                    this.mbcompfact.setText(rs.getString(88));
                    this.mbredfactarea.setText(rs.getString(89));
                    this.ob1len.setText(rs.getString(90));
                    this.ob1wid.setText(rs.getString(91));
                    this.ob1area.setText(rs.getString(92));
                    this.ob1redfact.setText(rs.getString(93));
                    this.ob1compfact.setText(rs.getString(94));
                    this.ob1redfactarea.setText(rs.getString(95));
                    this.ob2len.setText(rs.getString(96));
                    this.ob2wid.setText(rs.getString(97));
                    this.ob2area.setText(rs.getString(98));
                    this.ob2redfact.setText(rs.getString(99));
                    this.ob2compfact.setText(rs.getString(100));
                    this.ob2redfactarea.setText(rs.getString(101));
                    this.ob3len.setText(rs.getString(102));
                    this.ob3wid.setText(rs.getString(103));
                    this.ob3area.setText(rs.getString(104));
                    this.ob3redfact.setText(rs.getString(105));
                    this.ob3compfact.setText(rs.getString(106));
                    this.ob3redfactarea.setText(rs.getString(107));
                    this.ob4len.setText(rs.getString(108));
                    this.ob4wid.setText(rs.getString(109));
                    this.ob4area.setText(rs.getString(110));
                    this.ob4redfact.setText(rs.getString(111));
                    this.ob4compfact.setText(rs.getString(112));
                    this.ob4redfactarea.setText(rs.getString(113));
                    this.totalrfa.setText(rs.getString(114));
                    this.totalrfasqr.setText(rs.getString(115));
                    this.multiplybyall.setText(rs.getString(116));
                    this.currentreplacementcost.setText(rs.getString(117));
                    this.lessdeprec.setText(rs.getString(118));
                    this.deprecreplacementcost.setText(rs.getString(119));
                    this.inspectedby.setText(rs.getString(120));
                    this.checkedby.setText(rs.getString(121));
                    this.approvedby.setText(rs.getString(122));
                    this.companyname.setText(rs.getString(123));
                    this.companystamp.setText(rs.getString(124));
                    ((TextField) certifieddate.getEditor()).setText(rs.getString(125));
                    this.tin.setText(rs.getString(126));
                    this.docrefyear1.setText(rs.getString(1) + "   " + rs.getString(24) + "   " + rs.getString(25));

                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        });
        listnames.setOnKeyReleased(e -> {
            myRelease();
        });

    }

    private void mapView() {
        maplist.setItems(glist);
        try {
            Connection connection = dbConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM block");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                glist.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        loadmap.setOnAction(e -> {
            try {
                String query = "SELECT * FROM block";
                Connection conn = dbConnection.getConnection();
                ResultSet rs;
                PreparedStatement pst = conn.prepareStatement(query);
                rs = pst.executeQuery();

                WebEngine webEngine = web.getEngine();
                while (rs.next()) {
                    webEngine.load(rs.getString(14));
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });
        maplist.setOnMouseClicked((MouseEvent e) -> {
            try {
                String query = "SELECT * FROM block";
                Connection conn = dbConnection.getConnection();
                ResultSet rs;
                PreparedStatement pst = conn.prepareStatement(query);
                rs = pst.executeQuery();

                WebEngine webEngine = web.getEngine();
                while (rs.next()) {
                    webEngine.load(rs.getString(14));
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        });

    }


    private void areaLoad() {
        listnames1.setItems(namesList1);
        try {
            Connection connection = dbConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM block");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                namesList1.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        listnames1.setOnMouseClicked((MouseEvent e) -> {
            try {
                String query = "SELECT * FROM block where OWNERFN = ?";
                Connection conn = dbConnection.getConnection();
                ResultSet rs;
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, listnames1.getSelectionModel().getSelectedItem());
                rs = pst.executeQuery();

                while (rs.next()) {
                    this.id1.setText(rs.getString(23));
                    this.docrefyear2.setText(rs.getString(2));
                    this.docrefobjectno1.setText(rs.getString(3));
                    this.docrefpageno1.setText(rs.getString(4));
                    this.proprefward1.setText(rs.getString(5));
                    this.proprefmtaa1.setText(rs.getString(6));
                    this.proprefrateblock1.setText(rs.getString(7));
                    this.proprefobjectno1.setText(rs.getString(8));
                    this.proprefbuildingno1.setText(rs.getString(9));

                    this.proplocstreet1.setText(rs.getString(10));
                    this.proplocplotno1.setText(rs.getString(11));
                    this.proplocsurveyblock1.setText(rs.getString(12));
                    this.proplocexistingrefno1.setText(rs.getString(13));
                    this.proplocmapreference1.setText(rs.getString(14));

                    String value = rs.getString(14);
                    proplochyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                      @Override
                                                      public void handle(ActionEvent e) {
                                                          try {
                                                              Desktop.getDesktop().browse(new URI(value));
                                                          } catch (IOException e1) {
                                                              e1.printStackTrace();
                                                          } catch (URISyntaxException e1) {
                                                              e1.printStackTrace();
                                                          }
                                                      }
                                                  }
                    );


                    this.individualfirstname1.setText(rs.getString(15));
                    this.individualmiddlename1.setText(rs.getString(16));
                    this.individuallastname1.setText(rs.getString(17));
                    this.individualphone11.setText(rs.getString(18));
                    this.individualphone21.setText(rs.getString(19));

                    this.legalentityfullcompanyname1.setText(rs.getString(20));
                    this.legalentityphone11.setText(rs.getString(21));
                    this.legalentityphone21.setText(rs.getString(22));
                    this.ownerinfofirstname1.setText(rs.getString(1));
                    this.ownerinfomiddlename1.setText(rs.getString(24));
                    this.ownerinfolastname1.setText(rs.getString(25));
                    this.ownerinfophone11.setText(rs.getString(26));
                    this.ownerinfophone21.setText(rs.getString(27));
                    this.ownerinfostreet1.setText(rs.getString(28));
                    this.ownerinfoplotno1.setText(rs.getString(29));
                    this.ownerinfopobox1.setText(rs.getString(30));
                    this.ownerinforegion1.setText(rs.getString(31));
                    this.ownerinfodistrict1.setText(rs.getString(32));
                    this.ownerinfoward1.setText(rs.getString(33));
                    this.ownerinfomtaa1.setText(rs.getString(34));
                    this.ownerinfoemail1.setText(rs.getString(35));

                    if (rs.getString(127) != null) {
                        nonrateable2.setSelected(false);
                        nonrateable11.setSelected(false);
                        System.out.println(rs.getString(127));

                        String nonrateString = rs.getString(127).replace("[", "").replace("]", "");
                        System.out.println(nonrateString);

                        List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                        System.out.println(noneList);
                        for (String non : noneList) {
                            switch (non) {
                                case "Rateable":
                                    nonrateable2.setSelected(true);
                                    break;
                                case "Non-\n" +
                                        "Rateable":
                                    nonrateable11.setSelected(true);
                                    break;
                                default:
                                    nonrateable2.setSelected(false);
                                    nonrateable11.setSelected(false);
                            }
                        }
                    } else {
                        nonrateable2.setSelected(false);
                        nonrateable11.setSelected(false);
                    }

                    if (rs.getString(128) != null) {
                        individual1.setSelected(false);
                        System.out.println(rs.getString(128));

                        String nonrateString = rs.getString(128).replace("[", "").replace("]", "");
                        System.out.println(nonrateString);

                        List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                        System.out.println(noneList);
                        for (String non : noneList) {
                            switch (non) {
                                case "Individual":
                                    individual1.setSelected(true);
                                    break;
                                default:
                                    individual1.setSelected(false);
                            }
                        }
                    } else {
                        individual1.setSelected(false);
                    }

                    if (rs.getString(129) != null) {
                        legalentity1.setSelected(false);
                        System.out.println(rs.getString(129));

                        String nonrateString = rs.getString(129).replace("[", "").replace("]", "");
                        System.out.println(nonrateString);

                        List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                        System.out.println(noneList);
                        for (String non : noneList) {
                            switch (non) {
                                case "Legal\n" +
"Entity":
                                    legalentity1.setSelected(true);
                                    break;
                                default:
                                    legalentity1.setSelected(false);
                            }
                        }
                    } else {
                        legalentity1.setSelected(false);
                    }

                    //cbtenure
                    if (rs.getString(36) != null) {
                        tenureuntitled1.setSelected(false);
                        tenureresoccupier1.setSelected(false);
                        tenurelease1.setSelected(false);
                        tenurereslicensee1.setSelected(false);
                        System.out.println(rs.getString(36));

                        String tenureString = rs.getString(36).replace("[", "").replace("]", "");
                        System.out.println(tenureString);

                        List<String> tenureList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                        System.out.println(tenureList);

                        for (String tenu : tenureList) {
                            switch (tenu) {
                                case "Leasehold":
                                    tenurelease1.setSelected(true);
                                    break;
                                case "Res/Occupier":
                                    tenureresoccupier1.setSelected(true);
                                    break;
                                case "Res/Licensee":
                                    tenureresoccupier1.setSelected(true);
                                    break;
                                case "Untitled":
                                    tenureuntitled1.setSelected(true);
                                    break;
                                default:
                                    tenureuntitled1.setSelected(false);
                                    tenureresoccupier1.setSelected(false);
                                    tenurelease1.setSelected(false);
                                    tenurereslicensee1.setSelected(false);
                            }
                        }
                    } else {
                        tenureuntitled1.setSelected(false);
                        tenureresoccupier1.setSelected(false);
                        tenurelease1.setSelected(false);
                        tenurereslicensee1.setSelected(false);
                    }

                    //cbland
                    if (rs.getString(37) != null) {
                        landuseother1.setSelected(false);
                        landuseinstitution1.setSelected(false);
                        landuseindustrial1.setSelected(false);
                        landusecommres1.setSelected(false);
                        landusecommercial1.setSelected(false);
                        landuseresidential1.setSelected(false);
                        System.out.println(rs.getString(37));

                        String landString = rs.getString(37).replace("[", "").replace("]", "");
                        System.out.println(landString);

                        List<String> landList = Arrays.asList(landString.split("\\s*,\\s*"));
                        System.out.println(landList);

                        for (String land : landList) {
                            switch (land) {
                                case "Residential":
                                    landuseresidential1.setSelected(true);
                                    break;
                                case "Commercial":
                                    landusecommercial1.setSelected(true);
                                    break;
                                case "Comm/Residential":
                                    landusecommres1.setSelected(true);
                                    break;
                                case "Industrial":
                                    landuseindustrial1.setSelected(true);
                                    break;
                                case "institutional":
                                    landuseinstitution1.setSelected(true);
                                    break;
                                case "other":
                                    landuseother1.setSelected(true);
                                    break;
                                default:
                                    landuseother1.setSelected(false);
                                    landuseinstitution1.setSelected(false);
                                    landuseindustrial1.setSelected(false);
                                    landusecommres1.setSelected(false);
                                    landusecommercial1.setSelected(false);
                                    landuseresidential1.setSelected(false);
                            }
                        }
                    } else {
                        landuseother1.setSelected(false);
                        landuseinstitution1.setSelected(false);
                        landuseindustrial1.setSelected(false);
                        landusecommres1.setSelected(false);
                        landusecommercial1.setSelected(false);
                        landuseresidential1.setSelected(false);
                    }

                    this.actualtransaction1.setText(rs.getString(38) + "/= Tsh");
                    ((TextField) transactiondate1.getEditor()).setText(rs.getString(39));

                    //cbsoi
                    if (rs.getString(40) != null) {
                        sourceofinfoother1.setSelected(false);
                        sourceofinfobroker1.setSelected(false);
                        sourceofinfobank1.setSelected(false);
                        sourceofinfogovt1.setSelected(false);
                        sourceofinfovaluer1.setSelected(false);
                        sourceofinfonotary1.setSelected(false);
                        sourceofinfobuyer1.setSelected(false);
                        System.out.println(rs.getString(40));

                        String soiString = rs.getString(40).replace("[", "").replace("]", "");
                        System.out.println(soiString);

                        List<String> soiList = Arrays.asList(soiString.split("\\s*,\\s*"));
                        System.out.println(soiList);

                        for (String soi : soiList) {
                            switch (soi) {
                                case "Buyer/Seller":
                                    sourceofinfobuyer.setSelected(true);
                                    break;
                                case "Notary":
                                    sourceofinfonotary1.setSelected(true);
                                    break;
                                case "Valuer":
                                    sourceofinfovaluer1.setSelected(true);
                                    break;
                                case "Gov't Institution":
                                    sourceofinfogovt1.setSelected(true);
                                    break;
                                case "Bank":
                                    sourceofinfobank1.setSelected(true);
                                    break;
                                case "Property Broker":
                                    sourceofinfoother1.setSelected(true);
                                    break;
                                case "Other":
                                    sourceofinfobroker1.setSelected(true);
                                    break;
                                default:
                                    sourceofinfoother1.setSelected(false);
                                    sourceofinfobroker1.setSelected(false);
                                    sourceofinfobank1.setSelected(false);
                                    sourceofinfogovt1.setSelected(false);
                                    sourceofinfovaluer1.setSelected(false);
                                    sourceofinfonotary1.setSelected(false);
                                    sourceofinfobuyer1.setSelected(false);
                            }
                        }
                    } else {
                        sourceofinfoother1.setSelected(false);
                        sourceofinfobroker1.setSelected(false);
                        sourceofinfobank1.setSelected(false);
                        sourceofinfogovt1.setSelected(false);
                        sourceofinfovaluer1.setSelected(false);
                        sourceofinfonotary1.setSelected(false);
                        sourceofinfobuyer1.setSelected(false);
                    }
                    this.noofstories1.setText(rs.getString(41));
                    this.complete1.setText(rs.getString(42) + "%");

                    //cbcomm
                    if (rs.getString(43) != null) {
                        commstoragetank1.setSelected(false);
                        commshopresta1.setSelected(false);
                        commpetrolstation1.setSelected(false);
                        commother1.setSelected(false);
                        commofficebank1.setSelected(false);
                        commmallstore1.setSelected(false);
                        commhotel1.setSelected(false);
                        commfactorywarehouse1.setSelected(false);
                        System.out.println(rs.getString(43));

                        String commString = rs.getString(43).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Factory/\n" +
                                        "Warehouse":
                                    commfactorywarehouse1.setSelected(true);
                                    break;
                                case "Hotel":
                                    commhotel1.setSelected(true);
                                    break;
                                case "Shopping Malll/\n" +
                                        "Dept. Store":
                                    commmallstore1.setSelected(true);
                                    break;
                                case "Office/Bank":
                                    commofficebank1.setSelected(true);
                                    break;
                                case "Other":
                                    commother1.setSelected(true);
                                    break;
                                case "Petrol Station":
                                    commpetrolstation1.setSelected(true);
                                    break;
                                case "Shop/Restaurant/\n" +
                                        "bar":
                                    commshopresta1.setSelected(true);
                                    break;
                                case "Storage Tank":
                                    commstoragetank1.setSelected(true);
                                    break;
                                default:
                                    commstoragetank1.setSelected(false);
                                    commshopresta1.setSelected(false);
                                    commpetrolstation1.setSelected(false);
                                    commother1.setSelected(false);
                                    commofficebank1.setSelected(false);
                                    commmallstore1.setSelected(false);
                                    commhotel1.setSelected(false);
                                    commfactorywarehouse1.setSelected(false);
                            }
                        }
                    } else {
                        commstoragetank1.setSelected(false);
                        commshopresta1.setSelected(false);
                        commpetrolstation1.setSelected(false);
                        commother1.setSelected(false);
                        commofficebank1.setSelected(false);
                        commmallstore1.setSelected(false);
                        commhotel1.setSelected(false);
                        commfactorywarehouse1.setSelected(false);
                    }

                    //cbcinsti
                    if (rs.getString(44) != null) {
                        instiworship1.setSelected(false);
                        instischool1.setSelected(false);
                        instisport1.setSelected(false);
                        instiother1.setSelected(false);
                        instigovt1.setSelected(false);
                        System.out.println(rs.getString(44));

                        String commString = rs.getString(44).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Clinical/Hospital":
                                    insticlinical1.setSelected(true);
                                    break;
                                case "Government":
                                    instigovt1.setSelected(true);
                                    break;
                                case "Other":
                                    instiother1.setSelected(true);
                                    break;
                                case "Sport/Recreation":
                                    instisport1.setSelected(true);
                                    break;
                                case "School":
                                    instischool1.setSelected(true);
                                    break;
                                case "Worship":
                                    instiworship1.setSelected(true);
                                    break;
                                default:
                                    instiworship1.setSelected(false);
                                    instischool1.setSelected(false);
                                    instisport1.setSelected(false);
                                    instiother1.setSelected(false);
                                    instigovt1.setSelected(false);
                            }
                        }
                    } else {
                        instiworship1.setSelected(false);
                        instischool1.setSelected(false);
                        instisport1.setSelected(false);
                        instiother1.setSelected(false);
                        instigovt1.setSelected(false);
                    }

                    //cbres
                    if (rs.getString(45) != null) {
                        resvilla1.setSelected(false);
                        ressemidetached1.setSelected(false);
                        resother1.setSelected(false);
                        resmaisonette1.setSelected(false);
                        resdetatached1.setSelected(false);
                        resapartment1.setSelected(false);
                        System.out.println(rs.getString(45));

                        String commString = rs.getString(45).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Apartment":
                                    resapartment1.setSelected(true);
                                    break;
                                case "Detached House":
                                    resdetatached1.setSelected(true);
                                    break;
                                case "Maisonette":
                                    resmaisonette1.setSelected(true);
                                    break;
                                case "Other":
                                    resother1.setSelected(true);
                                    break;
                                case "Villa":
                                    resvilla1.setSelected(true);
                                    break;
                                case "Semi-Detached":
                                    ressemidetached1.setSelected(true);
                                    break;
                                default:
                                    resvilla1.setSelected(false);
                                    ressemidetached1.setSelected(false);
                                    resother1.setSelected(false);
                                    resmaisonette1.setSelected(false);
                                    resdetatached1.setSelected(false);
                                    resapartment1.setSelected(false);
                            }
                        }
                    } else {
                        resvilla1.setSelected(false);
                        ressemidetached1.setSelected(false);
                        resother1.setSelected(false);
                        resmaisonette1.setSelected(false);
                        resdetatached1.setSelected(false);
                        resapartment1.setSelected(false);
                    }

                    ((TextField) coyear1.getEditor()).setText(rs.getString(46));
                    ((TextField) recoyear1.getEditor()).setText(rs.getString(47));


                    //cbroof
                    if (rs.getString(48) != null) {
                        rooftilescement1.setSelected(false);
                        roofother1.setSelected(false);
                        roofironsheet1.setSelected(false);
                        roofharveytiles1.setSelected(false);
                        roofgrass1.setSelected(false);
                        roofconcrete1.setSelected(false);
                        roofasbestos1.setSelected(false);
                        System.out.println(rs.getString(48));

                        String commString = rs.getString(48).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Asbestos":
                                    roofasbestos1.setSelected(true);
                                    break;
                                case "Concrete":
                                    roofconcrete1.setSelected(true);
                                    break;
                                case "Grass/Palm":
                                    roofgrass1.setSelected(true);
                                    break;
                                case "Harvey Tiles":
                                    roofharveytiles1.setSelected(true);
                                    break;
                                case "Iron Sheet":
                                    roofironsheet1.setSelected(true);
                                    break;
                                case "Tiles/Cement":
                                    rooftilescement1.setSelected(true);
                                    break;
                                case "Mangalore":
                                    roofother1.setSelected(true);
                                    break;
                                default:
                                    rooftilescement1.setSelected(false);
                                    roofother1.setSelected(false);
                                    roofironsheet1.setSelected(false);
                                    roofharveytiles1.setSelected(false);
                                    roofgrass1.setSelected(false);
                                    roofconcrete1.setSelected(false);
                                    roofasbestos1.setSelected(false);
                            }
                        }
                    } else {
                        rooftilescement1.setSelected(false);
                        roofother1.setSelected(false);
                        roofironsheet1.setSelected(false);
                        roofharveytiles1.setSelected(false);
                        roofgrass1.setSelected(false);
                        roofconcrete1.setSelected(false);
                        roofasbestos1.setSelected(false);
                    }

                    //cbextwa
                    if (rs.getString(49) != null) {
                        exteriorwallother1.setSelected(false);
                        exteriorwallmud1.setSelected(false);
                        exteriorwallhydraform1.setSelected(false);
                        exteriorwalltimber1.setSelected(false);
                        exteriorwallglass1.setSelected(false);
                        exteriorwallconcframe1.setSelected(false);
                        exteriorwallcementblock1.setSelected(false);
                        exteriorwallburntbricks1.setSelected(false);
                        System.out.println(rs.getString(49));

                        String commString = rs.getString(49).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Burnt Bricks":
                                    exteriorwallburntbricks1.setSelected(true);
                                    break;
                                case "Cement Block":
                                    exteriorwallcementblock1.setSelected(true);
                                    break;
                                case "R/Conc Frame":
                                    exteriorwallconcframe1.setSelected(true);
                                    break;
                                case "Glass":
                                    exteriorwallglass1.setSelected(true);
                                    break;
                                case "Timber":
                                    exteriorwalltimber1.setSelected(true);
                                    break;
                                case "Hydraform":
                                    exteriorwallhydraform1.setSelected(true);
                                    break;
                                case "Mud":
                                    exteriorwallmud1.setSelected(true);
                                    break;
                                case "Other":
                                    exteriorwallother1.setSelected(true);
                                    break;
                                default:
                                    exteriorwallother1.setSelected(false);
                                    exteriorwallmud1.setSelected(false);
                                    exteriorwallhydraform1.setSelected(false);
                                    exteriorwalltimber1.setSelected(false);
                                    exteriorwallglass1.setSelected(false);
                                    exteriorwallconcframe1.setSelected(false);
                                    exteriorwallcementblock1.setSelected(false);
                                    exteriorwallburntbricks1.setSelected(false);
                            }
                        }
                    } else {
                        exteriorwallother1.setSelected(false);
                        exteriorwallmud1.setSelected(false);
                        exteriorwallhydraform1.setSelected(false);
                        exteriorwalltimber1.setSelected(false);
                        exteriorwallglass1.setSelected(false);
                        exteriorwallconcframe1.setSelected(false);
                        exteriorwallcementblock1.setSelected(false);
                        exteriorwallburntbricks1.setSelected(false);
                    }

                    //cbextfin
                    if (rs.getString(50) != null) {
                        exteriorfinishcompact1.setSelected(false);
                        exteriorfinishglazed1.setSelected(false);
                        exteriorfinishfair1.setSelected(false);
                        exteriorfinishother1.setSelected(false);
                        exteriorfinishplaster1.setSelected(false);
                        exteriorfinishtiles1.setSelected(false);
                        exteriorfinishtyrolean1.setSelected(false);
                        System.out.println(rs.getString(50));

                        String commString = rs.getString(50).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Tyrolean":
                                    exteriorfinishtyrolean1.setSelected(true);
                                    break;
                                case "Tiles":
                                    exteriorfinishtiles1.setSelected(true);
                                    break;
                                case "Plaster/Paint":
                                    exteriorfinishplaster1.setSelected(true);
                                    break;
                                case "Other":
                                    exteriorfinishother1.setSelected(true);
                                    break;
                                case "Fair Finish":
                                    exteriorfinishfair1.setSelected(true);
                                    break;
                                case "Glazed":
                                    exteriorfinishglazed1.setSelected(true);
                                    break;
                                case "Compact Earth":
                                    exteriorfinishcompact1.setSelected(true);
                                    break;
                                default:
                                    exteriorfinishcompact1.setSelected(false);
                                    exteriorfinishglazed1.setSelected(false);
                                    exteriorfinishfair1.setSelected(false);
                                    exteriorfinishother1.setSelected(false);
                                    exteriorfinishplaster1.setSelected(false);
                                    exteriorfinishtiles1.setSelected(false);
                                    exteriorfinishtyrolean1.setSelected(false);
                            }
                        }
                    } else {
                        exteriorfinishcompact1.setSelected(false);
                        exteriorfinishglazed1.setSelected(false);
                        exteriorfinishfair1.setSelected(false);
                        exteriorfinishother1.setSelected(false);
                        exteriorfinishplaster1.setSelected(false);
                        exteriorfinishtiles1.setSelected(false);
                        exteriorfinishtyrolean1.setSelected(false);
                    }

                    //cbwindows
                    if (rs.getString(51) != null) {
                        windowswoodcasement1.setSelected(false);
                        windowswoodabb1.setSelected(false);
                        windowssteelframe1.setSelected(false);
                        windowsother1.setSelected(false);
                        windowsglass1.setSelected(false);
                        windowsaluframe1.setSelected(false);
                        System.out.println(rs.getString(51));

                        String commString = rs.getString(51).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Tyrolean":
                                    windowsaluframe1.setSelected(true);
                                    break;
                                case "Tiles":
                                    windowsglass1.setSelected(true);
                                    break;
                                case "Plaster/Paint":
                                    windowsother1.setSelected(true);
                                    break;
                                case "Other":
                                    windowssteelframe1.setSelected(true);
                                    break;
                                case "Fair Finish":
                                    windowswoodabb1.setSelected(true);
                                    break;
                                case "Glazed":
                                    windowswoodcasement1.setSelected(true);
                                    break;
                                default:
                                    windowswoodcasement1.setSelected(false);
                                    windowswoodabb1.setSelected(false);
                                    windowssteelframe1.setSelected(false);
                                    windowsother1.setSelected(false);
                                    windowsglass1.setSelected(false);
                                    windowsaluframe1.setSelected(false);
                            }
                        }
                    } else {
                        windowswoodcasement1.setSelected(false);
                        windowswoodabb1.setSelected(false);
                        windowssteelframe1.setSelected(false);
                        windowsother1.setSelected(false);
                        windowsglass1.setSelected(false);
                        windowsaluframe1.setSelected(false);
                    }

                    //cbdoors
                    if (rs.getString(52) != null) {
                        doorssteelshutters1.setSelected(false);
                        doorswoodflush1.setSelected(false);
                        doorswoodbattens1.setSelected(false);
                        doorssteelsheets1.setSelected(false);
                        doorsother1.setSelected(false);
                        doorsalu1.setSelected(false);
                        System.out.println(rs.getString(52));

                        String commString = rs.getString(52).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Alluminium":
                                    doorsalu1.setSelected(true);
                                    break;
                                case "other":
                                    doorsother1.setSelected(true);
                                    break;
                                case "Steel Sheets":
                                    doorssteelsheets1.setSelected(true);
                                    break;
                                case "Wood Battens":
                                    doorswoodbattens1.setSelected(true);
                                    break;
                                case "Wood Flush":
                                    doorswoodflush1.setSelected(true);
                                    break;
                                case "Steel Shutters":
                                    doorssteelshutters1.setSelected(true);
                                    break;
                                default:
                                    doorssteelshutters1.setSelected(false);
                                    doorswoodflush1.setSelected(false);
                                    doorswoodbattens1.setSelected(false);
                                    doorssteelsheets1.setSelected(false);
                                    doorsother1.setSelected(false);
                                    doorsalu1.setSelected(false);
                            }
                        }
                    } else {
                        doorssteelshutters1.setSelected(false);
                        doorswoodflush1.setSelected(false);
                        doorswoodbattens1.setSelected(false);
                        doorssteelsheets1.setSelected(false);
                        doorsother1.setSelected(false);
                        doorsalu1.setSelected(false);
                    }
                    //cbfloor
                    if (rs.getString(53) != null) {
                        floorwood1.setSelected(false);
                        floortiles1.setSelected(false);
                        floorother1.setSelected(false);
                        floormarble1.setSelected(false);
                        floorinsitu1.setSelected(false);
                        floorcompact1.setSelected(false);
                        floorcement1.setSelected(false);
                        System.out.println(rs.getString(53));

                        String commString = rs.getString(53).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Cement Screed":
                                    floorcement1.setSelected(true);
                                    break;
                                case "Compact Earth":
                                    floorcompact1.setSelected(true);
                                    break;
                                case "In situ  Terazzo":
                                    floorinsitu1.setSelected(true);
                                    break;
                                case "Marble/Granite":
                                    floormarble1.setSelected(true);
                                    break;
                                case "Other":
                                    floorother1.setSelected(true);
                                    break;
                                case "Tiles":
                                    floortiles1.setSelected(true);
                                    break;
                                case "Wood /Parquet":
                                    floorwood1.setSelected(true);
                                    break;
                                default:
                                    floorwood1.setSelected(false);
                                    floortiles1.setSelected(false);
                                    floorother1.setSelected(false);
                                    floormarble1.setSelected(false);
                                    floorinsitu1.setSelected(false);
                                    floorcompact1.setSelected(false);
                                    floorcement1.setSelected(false);
                            }
                        }
                    } else {
                        floorwood1.setSelected(false);
                        floortiles1.setSelected(false);
                        floorother1.setSelected(false);
                        floormarble1.setSelected(false);
                        floorinsitu1.setSelected(false);
                        floorcompact1.setSelected(false);
                        floorcement1.setSelected(false);
                    }

                    //cbceiling
                    if (rs.getString(54) != null) {
                        ceilingsuspended1.setSelected(false);
                        ceilingsoftboard1.setSelected(false);
                        ceilingplaster1.setSelected(false);
                        ceilingother1.setSelected(false);
                        ceilinggypsum1.setSelected(false);
                        ceilingchipboard1.setSelected(false);
                        ceilingwood1.setSelected(false);
                        System.out.println(rs.getString(54));

                        String commString = rs.getString(54).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Wood tongue & grooved":
                                    ceilingwood1.setSelected(true);
                                    break;
                                case "chipboard":
                                    ceilingchipboard1.setSelected(true);
                                    break;
                                case "Gypsum":
                                    ceilinggypsum1.setSelected(true);
                                    break;
                                case "Other":
                                    ceilingother1.setSelected(true);
                                    break;
                                case "Plastered/Concrete":
                                    ceilingplaster1.setSelected(true);
                                    break;
                                case "Softboard/Hardboard":
                                    ceilingsoftboard1.setSelected(true);
                                    break;
                                case "Suspended/Acoustic":
                                    ceilingsuspended1.setSelected(true);
                                    break;
                                default:
                                    ceilingsuspended1.setSelected(false);
                                    ceilingsoftboard1.setSelected(false);
                                    ceilingplaster1.setSelected(false);
                                    ceilingother1.setSelected(false);
                                    ceilinggypsum1.setSelected(false);
                                    ceilingchipboard1.setSelected(false);
                                    ceilingwood1.setSelected(false);
                            }
                        }
                    } else {
                        ceilingsuspended1.setSelected(false);
                        ceilingsoftboard1.setSelected(false);
                        ceilingplaster1.setSelected(false);
                        ceilingother1.setSelected(false);
                        ceilinggypsum1.setSelected(false);
                        ceilingchipboard1.setSelected(false);
                        ceilingwood1.setSelected(false);
                    }

                    this.nofloor.setText(rs.getString(55));
                    this.noroom.setText(rs.getString(56));


                    //cbwater
                    if (rs.getString(57) != null) {
                        waterriver1.setSelected(false);
                        waterstandtap1.setSelected(false);
                        waterrain1.setSelected(false);
                        waternone1.setSelected(false);
                        watermains1.setSelected(false);
                        waterborehole1.setSelected(false);
                        System.out.println(rs.getString(57));

                        String commString = rs.getString(57).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Borehole":
                                    waterborehole1.setSelected(true);
                                    break;
                                case "Mains":
                                    watermains1.setSelected(true);
                                    break;
                                case "None":
                                    waternone1.setSelected(true);
                                    break;
                                case "Rain":
                                    waterrain1.setSelected(true);
                                    break;
                                case "Stand Tap":
                                    waterstandtap1.setSelected(true);
                                    break;
                                case "River/Stream":
                                    waterriver1.setSelected(true);
                                    break;
                                default:
                                    waterriver1.setSelected(false);
                                    waterstandtap1.setSelected(false);
                                    waterrain1.setSelected(false);
                                    waternone1.setSelected(false);
                                    watermains1.setSelected(false);
                                    waterborehole1.setSelected(false);
                            }
                        }
                    } else {
                        waterriver1.setSelected(false);
                        waterstandtap1.setSelected(false);
                        waterrain1.setSelected(false);
                        waternone1.setSelected(false);
                        watermains1.setSelected(false);
                        waterborehole1.setSelected(false);
                    }

                    //cbdrainage
                    if (rs.getString(58) != null) {
                        drainagesewer1.setSelected(false);
                        drainageptictank1.setSelected(false);
                        drainagepitlatrine1.setSelected(false);
                        drainageother1.setSelected(false);
                        drainagenone1.setSelected(false);
                        System.out.println(rs.getString(58));

                        String commString = rs.getString(58).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "None":
                                    drainagenone1.setSelected(true);
                                    break;
                                case "Other":
                                    drainageother1.setSelected(true);
                                    break;
                                case "Pit Latrine":
                                    drainagepitlatrine1.setSelected(true);
                                    break;
                                case "Septic Tank":
                                    drainageptictank1.setSelected(true);
                                    break;
                                case "Sewer":
                                    drainagesewer1.setSelected(true);
                                    break;
                                default:
                                    drainagesewer1.setSelected(false);
                                    drainageptictank1.setSelected(false);
                                    drainagepitlatrine1.setSelected(false);
                                    drainageother1.setSelected(false);
                                    drainagenone1.setSelected(false);
                            }
                        }
                    } else {
                        drainagesewer1.setSelected(false);
                        drainageptictank1.setSelected(false);
                        drainagepitlatrine1.setSelected(false);
                        drainageother1.setSelected(false);
                        drainagenone1.setSelected(false);
                    }

                    //cbelectricity
                    if (rs.getString(59) != null) {
                        electricitysolar1.setSelected(false);
                        electricitynone1.setSelected(false);
                        electricitymains1.setSelected(false);
                        System.out.println(rs.getString(59));

                        String commString = rs.getString(59).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "None":
                                    electricitynone1.setSelected(true);
                                    break;
                                case "Mains":
                                    electricitymains1.setSelected(true);
                                    break;
                                case "Solar":
                                    electricitysolar1.setSelected(true);
                                    break;
                                default:
                                    electricitysolar1.setSelected(false);
                                    electricitynone1.setSelected(false);
                                    electricitymains1.setSelected(false);
                            }
                        }
                    } else {
                        electricitysolar1.setSelected(false);
                        electricitynone1.setSelected(false);
                        electricitymains1.setSelected(false);
                    }

                    //cbhq
                    if (rs.getString(60) != null) {
                        hqwashhand1.setSelected(false);
                        hqnone1.setSelected(false);
                        hqkitchencabinet1.setSelected(false);
                        hqjacuzzi1.setSelected(false);
                        hqhighpowder1.setSelected(false);
                        hqbuiltin1.setSelected(false);
                        System.out.println(rs.getString(60));

                        String commString = rs.getString(60).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Built-in \n" +
                                        "Wardrobe":
                                    hqbuiltin1.setSelected(true);
                                    break;
                                case "High-Powder\n" +
                                        "WC":
                                    hqhighpowder1.setSelected(true);
                                    break;
                                case "Jacuzzi/\n" +
                                        "Sauna":
                                    hqjacuzzi1.setSelected(true);
                                    break;
                                case "Kitchen \n" +
                                        "Cabinet":
                                    hqkitchencabinet1.setSelected(true);
                                    break;
                                case "None":
                                    hqnone1.setSelected(true);
                                    break;
                                case "Wash hand\n" +
                                        "Basin":
                                    hqwashhand1.setSelected(true);
                                    break;
                                default:
                                    hqwashhand1.setSelected(false);
                                    hqnone1.setSelected(false);
                                    hqkitchencabinet1.setSelected(false);
                                    hqjacuzzi1.setSelected(false);
                                    hqhighpowder1.setSelected(false);
                                    hqbuiltin1.setSelected(false);
                            }
                        }
                    } else {
                        hqwashhand1.setSelected(false);
                        hqnone1.setSelected(false);
                        hqkitchencabinet1.setSelected(false);
                        hqjacuzzi1.setSelected(false);
                        hqhighpowder1.setSelected(false);
                        hqbuiltin1.setSelected(false);
                    }
                    //cbgq
                    if (rs.getString(61) != null) {
                        gqwesterntoilet1.setSelected(false);
                        gqwashhand1.setSelected(false);
                        gqnone1.setSelected(false);
                        gqkitchen1.setSelected(false);
                        gqbuiltin1.setSelected(false);
                        gqbathtubs1.setSelected(false);
                        System.out.println(rs.getString(61));

                        String commString = rs.getString(61).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Bath Tubs":
                                    gqbathtubs1.setSelected(true);
                                    break;
                                case "Built-in \n" +
                                        "Wardrobe":
                                    gqbuiltin1.setSelected(true);
                                    break;
                                case "Kitchen \n" +
                                        "Cupboards":
                                    gqkitchen1.setSelected(true);
                                    break;
                                case "None":
                                    gqnone1.setSelected(true);
                                    break;
                                case "Wash hand\n" +
                                        "Basin":
                                    gqwashhand1.setSelected(true);
                                    break;
                                case "Western Toilet/\n" +
                                        "Eastern WC":
                                    gqwesterntoilet1.setSelected(true);
                                    break;
                                default:
                                    gqwesterntoilet1.setSelected(false);
                                    gqwashhand1.setSelected(false);
                                    gqnone1.setSelected(false);
                                    gqkitchen1.setSelected(false);
                                    gqbuiltin1.setSelected(false);
                                    gqbathtubs1.setSelected(false);
                            }
                        }
                    } else {
                        gqwesterntoilet1.setSelected(false);
                        gqwashhand1.setSelected(false);
                        gqnone1.setSelected(false);
                        gqkitchen1.setSelected(false);
                        gqbuiltin1.setSelected(false);
                        gqbathtubs1.setSelected(false);
                    }

                    //cbamenit
                    if (rs.getString(62) != null) {
                        amenitiespool1.setSelected(false);
                        amenitiesnone1.setSelected(false);
                        amenitieslift1.setSelected(false);
                        amenitiesfire1.setSelected(false);
                        amenitiescentralcooling1.setSelected(false);
                        System.out.println(rs.getString(62));

                        String commString = rs.getString(62).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Central Cooling\n" +
                                        "System":
                                    amenitiescentralcooling1.setSelected(true);
                                    break;
                                case "Fire Fighting\n" +
                                        "System":
                                    amenitiesfire1.setSelected(true);
                                    break;
                                case "Lift/\n" +
                                        "Escalator":
                                    amenitieslift1.setSelected(true);
                                    break;
                                case "None":
                                    amenitiesnone.setSelected(true);
                                    break;
                                case "Swimming Pool":
                                    amenitiespool1.setSelected(true);
                                    break;
                                default:
                                    amenitiespool1.setSelected(false);
                                    amenitiesnone1.setSelected(false);
                                    amenitieslift1.setSelected(false);
                                    amenitiesfire1.setSelected(false);
                                    amenitiescentralcooling1.setSelected(false);
                            }
                        }
                    } else {
                        amenitiespool1.setSelected(false);
                        amenitiesnone1.setSelected(false);
                        amenitieslift1.setSelected(false);
                        amenitiesfire1.setSelected(false);
                        amenitiescentralcooling1.setSelected(false);
                    }

                    this.exllent1.setValue(rs.getString(63));
                    this.good1.setValue(rs.getString(64));
                    this.fair1.setValue(rs.getString(65));
                    this.poor1.setValue(rs.getString(66));

                    //cbroad
                    if (rs.getString(67) != null) {
                        roadtarmac1.setSelected(false);
                        roadother1.setSelected(false);
                        roadnone1.setSelected(false);
                        roadmurram1.setSelected(false);
                        roadfootpath1.setSelected(false);
                        roadearth1.setSelected(false);
                        System.out.println(rs.getString(67));

                        String commString = rs.getString(67).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Earth":
                                    roadearth1.setSelected(true);
                                    break;
                                case "Footpath":
                                    roadfootpath1.setSelected(true);
                                    break;
                                case "Murram/Gravel":
                                    roadmurram1.setSelected(true);
                                    break;
                                case "None":
                                    roadnone1.setSelected(true);
                                    break;
                                case "Other":
                                    roadother1.setSelected(true);
                                    break;
                                case "Tarmac":
                                    roadtarmac1.setSelected(true);
                                    break;
                                default:
                                    roadtarmac1.setSelected(false);
                                    roadother1.setSelected(false);
                                    roadnone1.setSelected(false);
                                    roadmurram1.setSelected(false);
                                    roadfootpath1.setSelected(false);
                                    roadearth1.setSelected(false);
                            }
                        }
                    } else {
                        roadtarmac1.setSelected(false);
                        roadother1.setSelected(false);
                        roadnone1.setSelected(false);
                        roadmurram1.setSelected(false);
                        roadfootpath1.setSelected(false);
                        roadearth1.setSelected(false);
                    }

                    //cbroad
                    if (rs.getString(68) != null) {
                        fencetimber1.setSelected(false);
                        fencesteel1.setSelected(false);
                        fenceplant1.setSelected(false);
                        fencenone1.setSelected(false);
                        fencehydraform1.setSelected(false);
                        fencechainlink1.setSelected(false);
                        fencecement1.setSelected(false);
                        System.out.println(rs.getString(68));

                        String commString = rs.getString(68).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Cement Blocks":
                                    fencecement1.setSelected(true);
                                    break;
                                case "Chain Link":
                                    fencechainlink1.setSelected(true);
                                    break;
                                case "Hydraform":
                                    fencehydraform1.setSelected(true);
                                    break;
                                case "None":
                                    fencenone1.setSelected(true);
                                    break;
                                case "Plant/Hedge":
                                    fenceplant1.setSelected(true);
                                    break;
                                case "Steel":
                                    fencesteel1.setSelected(true);
                                    break;
                                case "Timber":
                                    fencetimber1.setSelected(true);
                                    break;
                                default:
                                    fencetimber1.setSelected(false);
                                    fencesteel1.setSelected(false);
                                    fenceplant1.setSelected(false);
                                    fencenone1.setSelected(false);
                                    fencehydraform1.setSelected(false);
                                    fencechainlink1.setSelected(false);
                                    fencecement1.setSelected(false);
                            }
                        }
                    } else {
                        fencetimber1.setSelected(false);
                        fencesteel1.setSelected(false);
                        fenceplant1.setSelected(false);
                        fencenone1.setSelected(false);
                        fencehydraform1.setSelected(false);
                        fencechainlink1.setSelected(false);
                        fencecement1.setSelected(false);
                    }

                    //cbcomp
                    if (rs.getString(69) != null) {
                        compoundother1.setSelected(false);
                        compoundtarmac1.setSelected(false);
                        compoundnone1.setSelected(false);
                        compoundlawn1.setSelected(false);
                        compoundinterblocks1.setSelected(false);
                        compoundconcrete1.setSelected(false);
                        System.out.println(rs.getString(69));

                        String commString = rs.getString(69).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Concrete/Slabs":
                                    compoundconcrete1.setSelected(true);
                                    break;
                                case "Interlocking Blocks":
                                    compoundinterblocks1.setSelected(true);
                                    break;
                                case "Lawn/Garden":
                                    compoundlawn1.setSelected(true);
                                    break;
                                case "None":
                                    compoundnone1.setSelected(true);
                                    break;
                                case "Tarmac":
                                    compoundtarmac1.setSelected(true);
                                    break;
                                case "Other":
                                    compoundother1.setSelected(true);
                                    break;
                                default:
                                    compoundother1.setSelected(false);
                                    compoundtarmac1.setSelected(false);
                                    compoundnone1.setSelected(false);
                                    compoundlawn1.setSelected(false);
                                    compoundinterblocks1.setSelected(false);
                                    compoundconcrete1.setSelected(false);
                            }
                        }
                    } else {
                        compoundother1.setSelected(false);
                        compoundtarmac1.setSelected(false);
                        compoundnone1.setSelected(false);
                        compoundlawn1.setSelected(false);
                        compoundinterblocks1.setSelected(false);
                        compoundconcrete1.setSelected(false);
                    }
                    //cbobno1
                    if (rs.getString(71) != null) {
                        obno1workshop1.setSelected(false);
                        obno1store1.setSelected(false);
                        obno1servants1.setSelected(false);
                        obno1other1.setSelected(false);
                        obno1garage1.setSelected(false);
                        System.out.println(rs.getString(71));

                        String commString = rs.getString(71).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno1garage1.setSelected(true);
                                    break;
                                case "Other":
                                    obno1other1.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno1servants1.setSelected(true);
                                    break;
                                case "Store":
                                    obno1store1.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno1workshop1.setSelected(true);
                                    break;
                                default:
                                    obno1workshop1.setSelected(false);
                                    obno1store1.setSelected(false);
                                    obno1servants1.setSelected(false);
                                    obno1other1.setSelected(false);
                                    obno1garage1.setSelected(false);
                            }
                        }
                    } else {
                        obno1workshop1.setSelected(false);
                        obno1store1.setSelected(false);
                        obno1servants1.setSelected(false);
                        obno1other1.setSelected(false);
                        obno1garage1.setSelected(false);
                    }
                    //cbobnone
                    if (rs.getString(70) != null) {
                        obnone1.setSelected(false);
                        System.out.println(rs.getString(70));

                        String commString = rs.getString(70).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "None":
                                    obnone1.setSelected(true);
                                    break;
                                default:
                                    obnone1.setSelected(false);
                            }
                        }
                    } else {
                        obnone1.setSelected(false);
                    }

                    String ob1 = rs.getString(72);
                    obno1hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                    @Override
                                                    public void handle(ActionEvent e) {
                                                        try {
                                                            Desktop.getDesktop().browse(new URI(ob1));
                                                        } catch (IOException e1) {
                                                            e1.printStackTrace();
                                                        } catch (URISyntaxException e1) {
                                                            e1.printStackTrace();
                                                        }
                                                    }
                                                }
                    );

                    //cbobno2
                    if (rs.getString(73) != null) {
                        obno2workshop1.setSelected(false);
                        obno2store1.setSelected(false);
                        obno2servants1.setSelected(false);
                        obno2other1.setSelected(false);
                        obno2garage1.setSelected(false);
                        System.out.println(rs.getString(73));

                        String commString = rs.getString(73).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno2garage1.setSelected(true);
                                    break;
                                case "Other":
                                    obno2other1.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno2servants1.setSelected(true);
                                    break;
                                case "Store":
                                    obno2store1.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno2workshop1.setSelected(true);
                                    break;
                                default:
                                    obno2workshop1.setSelected(false);
                                    obno2store1.setSelected(false);
                                    obno2servants1.setSelected(false);
                                    obno2other1.setSelected(false);
                                    obno2garage1.setSelected(false);
                            }
                        }
                    } else {
                        obno2workshop1.setSelected(false);
                        obno2store1.setSelected(false);
                        obno2servants1.setSelected(false);
                        obno2other1.setSelected(false);
                        obno2garage1.setSelected(false);
                    }

                    String ob2 = rs.getString(74);
                    obno2hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                    @Override
                                                    public void handle(ActionEvent e) {
                                                        try {
                                                            Desktop.getDesktop().browse(new URI(ob2));
                                                        } catch (IOException e1) {
                                                            e1.printStackTrace();
                                                        } catch (URISyntaxException e1) {
                                                            e1.printStackTrace();
                                                        }
                                                    }
                                                }
                    );

                    //cbobno3
                    if (rs.getString(75) != null) {
                        obno3workshop1.setSelected(false);
                        obno3store1.setSelected(false);
                        obno3servants1.setSelected(false);
                        obno3other1.setSelected(false);
                        obno3garage1.setSelected(false);
                        System.out.println(rs.getString(75));

                        String commString = rs.getString(75).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno3garage1.setSelected(true);
                                    break;
                                case "Other":
                                    obno3other1.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno3servants1.setSelected(true);
                                    break;
                                case "Store":
                                    obno3store1.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno3workshop1.setSelected(true);
                                    break;
                                default:
                                    obno3workshop1.setSelected(false);
                                    obno3store1.setSelected(false);
                                    obno3servants1.setSelected(false);
                                    obno3other1.setSelected(false);
                                    obno3garage1.setSelected(false);
                            }
                        }
                    } else {
                        obno3workshop1.setSelected(false);
                        obno3store1.setSelected(false);
                        obno3servants1.setSelected(false);
                        obno3other1.setSelected(false);
                        obno3garage1.setSelected(false);
                    }

                    String ob3 = rs.getString(76);
                    obno3hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                    @Override
                                                    public void handle(ActionEvent e) {
                                                        try {
                                                            Desktop.getDesktop().browse(new URI(ob3));
                                                        } catch (IOException e1) {
                                                            e1.printStackTrace();
                                                        } catch (URISyntaxException e1) {
                                                            e1.printStackTrace();
                                                        }
                                                    }
                                                }
                    );

                    //cbobno4
                    if (rs.getString(77) != null) {
                        obno4workshop.setSelected(false);
                        obno4store1.setSelected(false);
                        obno4servants1.setSelected(false);
                        obno4other1.setSelected(false);
                        obno4garage1.setSelected(false);
                        System.out.println(rs.getString(77));

                        String commString = rs.getString(77).replace("[", "").replace("]", "");
                        System.out.println(commString);

                        List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                        System.out.println(commList);

                        for (String comm : commList) {
                            switch (comm) {
                                case "Garage":
                                    obno4garage1.setSelected(true);
                                    break;
                                case "Other":
                                    obno4other1.setSelected(true);
                                    break;
                                case "Servants Qtrs":
                                    obno4servants1.setSelected(true);
                                    break;
                                case "Store":
                                    obno4store1.setSelected(true);
                                    break;
                                case "Workshop":
                                    obno4workshop1.setSelected(true);
                                    break;
                                default:
                                    obno4workshop1.setSelected(false);
                                    obno4store1.setSelected(false);
                                    obno4servants1.setSelected(false);
                                    obno4other1.setSelected(false);
                                    obno4garage1.setSelected(false);
                            }
                        }
                    } else {
                        obno4workshop1.setSelected(false);
                        obno4store1.setSelected(false);
                        obno4servants1.setSelected(false);
                        obno4other1.setSelected(false);
                        obno4garage1.setSelected(false);
                    }

                    String ob4 = rs.getString(78);
                    obno4hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                    @Override
                                                    public void handle(ActionEvent e) {
                                                        try {
                                                            Desktop.getDesktop().browse(new URI(ob4));
                                                        } catch (IOException e1) {
                                                            e1.printStackTrace();
                                                        } catch (URISyntaxException e1) {
                                                            e1.printStackTrace();
                                                        }
                                                    }
                                                }
                    );

                    Image image1 = new Image(rs.getBinaryStream(79));
                    sketchphoto1.setImage(image1);


                    Image image2 = new Image(rs.getBinaryStream(80));
                    buildphoto11.setImage(image2);

                    Image image3 = new Image(rs.getBinaryStream(81));
                    buildphoto21.setImage(image3);

                    this.noofbaths1.setText(rs.getString(82));
                    this.nooftoilets1.setText(rs.getString(83));
                    this.mblen1.setText(rs.getString(84));
                    this.mbwid1.setText(rs.getString(85));
                    this.mbarea1.setText(rs.getString(86));
                    this.mbredfact1.setText(rs.getString(87));
                    this.mbcompfact1.setText(rs.getString(88));
                    this.mbredfactarea1.setText(rs.getString(89));
                    this.ob1len1.setText(rs.getString(90));
                    this.ob1wid1.setText(rs.getString(91));
                    this.ob1area1.setText(rs.getString(92));
                    this.ob1redfact1.setText(rs.getString(93));
                    this.ob1compfact1.setText(rs.getString(94));
                    this.ob1redfactarea1.setText(rs.getString(95));
                    this.ob2len1.setText(rs.getString(96));
                    this.ob2wid1.setText(rs.getString(97));
                    this.ob2area1.setText(rs.getString(98));
                    this.ob2redfact1.setText(rs.getString(99));
                    this.ob2compfact1.setText(rs.getString(100));
                    this.ob2redfactarea1.setText(rs.getString(101));
                    this.ob3len1.setText(rs.getString(102));
                    this.ob3wid1.setText(rs.getString(103));
                    this.ob3area1.setText(rs.getString(104));
                    this.ob3redfact1.setText(rs.getString(105));
                    this.ob3compfact1.setText(rs.getString(106));
                    this.ob3redfactarea1.setText(rs.getString(107));
                    this.ob4len1.setText(rs.getString(108));
                    this.ob4wid1.setText(rs.getString(109));
                    this.ob4area1.setText(rs.getString(110));
                    this.ob4redfact1.setText(rs.getString(111));
                    this.ob4compfact1.setText(rs.getString(112));
                    this.ob4redfactarea1.setText(rs.getString(113));
                    this.totalrfa1.setText(rs.getString(114));
                    this.totalrfasqr1.setText(rs.getString(115));
                    this.multiplybyall1.setText(rs.getString(116));
                    this.currentreplacementcost1.setText(rs.getString(117));
                    this.lessdeprec1.setText(rs.getString(118));
                    this.deprecreplacementcost1.setText(rs.getString(119));
                    this.inspectedby1.setText(rs.getString(120));
                    this.checkedby1.setText(rs.getString(121));
                    this.approvedby1.setText(rs.getString(122));
                    this.companyname1.setText(rs.getString(123));
                    this.companystamp1.setText(rs.getString(124));
                    ((TextField) certifieddate1.getEditor()).setText(rs.getString(125));
                    this.tin1.setText(rs.getString(126));
                    this.docrefyear11.setText(rs.getString(1) + "   " + rs.getString(24) + "   " + rs.getString(25));

                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        });
    }

    private void myRelease() {

        listnames1.setItems(namesList2);
        try {
            Connection connection = dbConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM block");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                namesList2.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        listnames1.setOnMouseClicked(e -> {
                try {
                    String query = "SELECT * FROM block where OWNERFN = ?";
                    Connection conn = dbConnection.getConnection();
                    ResultSet rs;
                    PreparedStatement pst = conn.prepareStatement(query);
                    pst.setString(1, listnames1.getSelectionModel().getSelectedItem());
                    rs = pst.executeQuery();

                    while (rs.next()) {
                        this.id1.setText(rs.getString(23));
                        this.docrefyear1.setText(rs.getString(2));
                        this.docrefobjectno1.setText(rs.getString(3));
                        this.docrefpageno1.setText(rs.getString(4));
                        this.proprefward1.setText(rs.getString(5));
                        this.proprefmtaa1.setText(rs.getString(6));
                        this.proprefrateblock1.setText(rs.getString(7));
                        this.proprefobjectno1.setText(rs.getString(8));
                        this.proprefbuildingno1.setText(rs.getString(9));

                        this.proplocstreet1.setText(rs.getString(10));
                        this.proplocplotno1.setText(rs.getString(11));
                        this.proplocsurveyblock1.setText(rs.getString(12));
                        this.proplocexistingrefno1.setText(rs.getString(13));
                        this.proplocmapreference1.setText(rs.getString(14));

                        String value = rs.getString(14);
                        proplochyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                          @Override
                                                          public void handle(ActionEvent e) {
                                                              try {
                                                                  Desktop.getDesktop().browse(new URI(value));
                                                              } catch (IOException e1) {
                                                                  e1.printStackTrace();
                                                              } catch (URISyntaxException e1) {
                                                                  e1.printStackTrace();
                                                              }
                                                          }
                                                      }
                        );


                        this.individualfirstname1.setText(rs.getString(15));
                        this.individualmiddlename1.setText(rs.getString(16));
                        this.individuallastname1.setText(rs.getString(17));
                        this.individualphone11.setText(rs.getString(18));
                        this.individualphone21.setText(rs.getString(19));

                        this.legalentityfullcompanyname1.setText(rs.getString(20));
                        this.legalentityphone11.setText(rs.getString(21));
                        this.legalentityphone21.setText(rs.getString(22));
                        this.ownerinfofirstname1.setText(rs.getString(1));
                        this.ownerinfomiddlename1.setText(rs.getString(24));
                        this.ownerinfolastname1.setText(rs.getString(25));
                        this.ownerinfophone11.setText(rs.getString(26));
                        this.ownerinfophone21.setText(rs.getString(27));
                        this.ownerinfostreet1.setText(rs.getString(28));
                        this.ownerinfoplotno1.setText(rs.getString(29));
                        this.ownerinfopobox1.setText(rs.getString(30));
                        this.ownerinforegion1.setText(rs.getString(31));
                        this.ownerinfodistrict1.setText(rs.getString(32));
                        this.ownerinfoward1.setText(rs.getString(33));
                        this.ownerinfomtaa1.setText(rs.getString(34));
                        this.ownerinfoemail1.setText(rs.getString(35));

                        if (rs.getString(127) != null) {
                            nonrateable2.setSelected(false);
                            nonrateable11.setSelected(false);
                            System.out.println(rs.getString(127));

                            String nonrateString = rs.getString(127).replace("[", "").replace("]", "");
                            System.out.println(nonrateString);

                            List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                            System.out.println(noneList);
                            for (String non : noneList) {
                                switch (non) {
                                    case "Rateable":
                                        nonrateable2.setSelected(true);
                                        break;
                                    case "Non-\n" +
                                            "Rateable":
                                        nonrateable11.setSelected(true);
                                        break;
                                    default:
                                        nonrateable2.setSelected(false);
                                        nonrateable11.setSelected(false);
                                }
                            }
                        } else {
                            nonrateable2.setSelected(false);
                            nonrateable11.setSelected(false);
                        }

                        if (rs.getString(128) != null) {
                            individual1.setSelected(false);
                            System.out.println(rs.getString(128));

                            String nonrateString = rs.getString(128).replace("[", "").replace("]", "");
                            System.out.println(nonrateString);

                            List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                            System.out.println(noneList);
                            for (String non : noneList) {
                                switch (non) {
                                    case "Individual":
                                        individual1.setSelected(true);
                                        break;
                                    default:
                                        individual1.setSelected(false);
                                }
                            }
                        } else {
                            individual1.setSelected(false);
                        }

                        if (rs.getString(129) != null) {
                            legalentity1.setSelected(false);
                            System.out.println(rs.getString(129));

                            String nonrateString = rs.getString(129).replace("[", "").replace("]", "");
                            System.out.println(nonrateString);

                            List<String> noneList = Arrays.asList(nonrateString.split("\\s*,\\s*"));
                            System.out.println(noneList);
                            for (String non : noneList) {
                                switch (non) {
                                    case "Legal\n" +
"Entity":
                                        legalentity1.setSelected(true);
                                        break;
                                    default:
                                        legalentity1.setSelected(false);
                                }
                            }
                        } else {
                            legalentity1.setSelected(false);
                        }

                        //cbtenure
                        if (rs.getString(36) != null) {
                            tenureuntitled1.setSelected(false);
                            tenureresoccupier1.setSelected(false);
                            tenurelease1.setSelected(false);
                            tenurereslicensee1.setSelected(false);
                            System.out.println(rs.getString(36));

                            String tenureString = rs.getString(36).replace("[", "").replace("]", "");
                            System.out.println(tenureString);

                            List<String> tenureList = Arrays.asList(tenureString.split("\\s*,\\s*"));
                            System.out.println(tenureList);

                            for (String tenu : tenureList) {
                                switch (tenu) {
                                    case "Leasehold":
                                        tenurelease1.setSelected(true);
                                        break;
                                    case "Res/Occupier":
                                        tenureresoccupier1.setSelected(true);
                                        break;
                                    case "Res/Licensee":
                                        tenureresoccupier1.setSelected(true);
                                        break;
                                    case "Untitled":
                                        tenureuntitled1.setSelected(true);
                                        break;
                                    default:
                                        tenureuntitled1.setSelected(false);
                                        tenureresoccupier1.setSelected(false);
                                        tenurelease1.setSelected(false);
                                        tenurereslicensee1.setSelected(false);
                                }
                            }
                        } else {
                            tenureuntitled1.setSelected(false);
                            tenureresoccupier1.setSelected(false);
                            tenurelease1.setSelected(false);
                            tenurereslicensee1.setSelected(false);
                        }

                        //cbland
                        if (rs.getString(37) != null) {
                            landuseother1.setSelected(false);
                            landuseinstitution1.setSelected(false);
                            landuseindustrial1.setSelected(false);
                            landusecommres1.setSelected(false);
                            landusecommercial1.setSelected(false);
                            landuseresidential1.setSelected(false);
                            System.out.println(rs.getString(37));

                            String landString = rs.getString(37).replace("[", "").replace("]", "");
                            System.out.println(landString);

                            List<String> landList = Arrays.asList(landString.split("\\s*,\\s*"));
                            System.out.println(landList);

                            for (String land : landList) {
                                switch (land) {
                                    case "Residential":
                                        landuseresidential1.setSelected(true);
                                        break;
                                    case "Commercial":
                                        landusecommercial1.setSelected(true);
                                        break;
                                    case "Comm/Residential":
                                        landusecommres1.setSelected(true);
                                        break;
                                    case "Industrial":
                                        landuseindustrial1.setSelected(true);
                                        break;
                                    case "institutional":
                                        landuseinstitution1.setSelected(true);
                                        break;
                                    case "other":
                                        landuseother1.setSelected(true);
                                        break;
                                    default:
                                        landuseother1.setSelected(false);
                                        landuseinstitution1.setSelected(false);
                                        landuseindustrial1.setSelected(false);
                                        landusecommres1.setSelected(false);
                                        landusecommercial1.setSelected(false);
                                        landuseresidential1.setSelected(false);
                                }
                            }
                        } else {
                            landuseother1.setSelected(false);
                            landuseinstitution1.setSelected(false);
                            landuseindustrial1.setSelected(false);
                            landusecommres1.setSelected(false);
                            landusecommercial1.setSelected(false);
                            landuseresidential1.setSelected(false);
                        }

                        this.actualtransaction1.setText(rs.getString(38) + "/= Tsh");
                        ((TextField) transactiondate1.getEditor()).setText(rs.getString(39));

                        //cbsoi
                        if (rs.getString(40) != null) {
                            sourceofinfoother1.setSelected(false);
                            sourceofinfobroker1.setSelected(false);
                            sourceofinfobank1.setSelected(false);
                            sourceofinfogovt1.setSelected(false);
                            sourceofinfovaluer1.setSelected(false);
                            sourceofinfonotary1.setSelected(false);
                            sourceofinfobuyer1.setSelected(false);
                            System.out.println(rs.getString(40));

                            String soiString = rs.getString(40).replace("[", "").replace("]", "");
                            System.out.println(soiString);

                            List<String> soiList = Arrays.asList(soiString.split("\\s*,\\s*"));
                            System.out.println(soiList);

                            for (String soi : soiList) {
                                switch (soi) {
                                    case "Buyer/Seller":
                                        sourceofinfobuyer.setSelected(true);
                                        break;
                                    case "Notary":
                                        sourceofinfonotary1.setSelected(true);
                                        break;
                                    case "Valuer":
                                        sourceofinfovaluer1.setSelected(true);
                                        break;
                                    case "Gov't Institution":
                                        sourceofinfogovt1.setSelected(true);
                                        break;
                                    case "Bank":
                                        sourceofinfobank1.setSelected(true);
                                        break;
                                    case "Property Broker":
                                        sourceofinfoother1.setSelected(true);
                                        break;
                                    case "Other":
                                        sourceofinfobroker1.setSelected(true);
                                        break;
                                    default:
                                        sourceofinfoother1.setSelected(false);
                                        sourceofinfobroker1.setSelected(false);
                                        sourceofinfobank1.setSelected(false);
                                        sourceofinfogovt1.setSelected(false);
                                        sourceofinfovaluer1.setSelected(false);
                                        sourceofinfonotary1.setSelected(false);
                                        sourceofinfobuyer1.setSelected(false);
                                }
                            }
                        } else {
                            sourceofinfoother1.setSelected(false);
                            sourceofinfobroker1.setSelected(false);
                            sourceofinfobank1.setSelected(false);
                            sourceofinfogovt1.setSelected(false);
                            sourceofinfovaluer1.setSelected(false);
                            sourceofinfonotary1.setSelected(false);
                            sourceofinfobuyer1.setSelected(false);
                        }
                        this.noofstories1.setText(rs.getString(41));
                        this.complete1.setText(rs.getString(42) + "%");

                        //cbcomm
                        if (rs.getString(43) != null) {
                            commstoragetank1.setSelected(false);
                            commshopresta1.setSelected(false);
                            commpetrolstation1.setSelected(false);
                            commother1.setSelected(false);
                            commofficebank1.setSelected(false);
                            commmallstore1.setSelected(false);
                            commhotel1.setSelected(false);
                            commfactorywarehouse1.setSelected(false);
                            System.out.println(rs.getString(43));

                            String commString = rs.getString(43).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Factory/\n" +
                                            "Warehouse":
                                        commfactorywarehouse1.setSelected(true);
                                        break;
                                    case "Hotel":
                                        commhotel1.setSelected(true);
                                        break;
                                    case "Shopping Malll/\n" +
                                            "Dept. Store":
                                        commmallstore1.setSelected(true);
                                        break;
                                    case "Office/Bank":
                                        commofficebank1.setSelected(true);
                                        break;
                                    case "Other":
                                        commother1.setSelected(true);
                                        break;
                                    case "Petrol Station":
                                        commpetrolstation1.setSelected(true);
                                        break;
                                    case "Shop/Restaurant/\n" +
                                            "bar":
                                        commshopresta1.setSelected(true);
                                        break;
                                    case "Storage Tank":
                                        commstoragetank1.setSelected(true);
                                        break;
                                    default:
                                        commstoragetank1.setSelected(false);
                                        commshopresta1.setSelected(false);
                                        commpetrolstation1.setSelected(false);
                                        commother1.setSelected(false);
                                        commofficebank1.setSelected(false);
                                        commmallstore1.setSelected(false);
                                        commhotel1.setSelected(false);
                                        commfactorywarehouse1.setSelected(false);
                                }
                            }
                        } else {
                            commstoragetank1.setSelected(false);
                            commshopresta1.setSelected(false);
                            commpetrolstation1.setSelected(false);
                            commother1.setSelected(false);
                            commofficebank1.setSelected(false);
                            commmallstore1.setSelected(false);
                            commhotel1.setSelected(false);
                            commfactorywarehouse1.setSelected(false);
                        }

                        //cbcinsti
                        if (rs.getString(44) != null) {
                            instiworship1.setSelected(false);
                            instischool1.setSelected(false);
                            instisport1.setSelected(false);
                            instiother1.setSelected(false);
                            instigovt1.setSelected(false);
                            System.out.println(rs.getString(44));

                            String commString = rs.getString(44).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Clinical/Hospital":
                                        insticlinical1.setSelected(true);
                                        break;
                                    case "Government":
                                        instigovt1.setSelected(true);
                                        break;
                                    case "Other":
                                        instiother1.setSelected(true);
                                        break;
                                    case "Sport/Recreation":
                                        instisport1.setSelected(true);
                                        break;
                                    case "School":
                                        instischool1.setSelected(true);
                                        break;
                                    case "Worship":
                                        instiworship1.setSelected(true);
                                        break;
                                    default:
                                        instiworship1.setSelected(false);
                                        instischool1.setSelected(false);
                                        instisport1.setSelected(false);
                                        instiother1.setSelected(false);
                                        instigovt1.setSelected(false);
                                }
                            }
                        } else {
                            instiworship1.setSelected(false);
                            instischool1.setSelected(false);
                            instisport1.setSelected(false);
                            instiother1.setSelected(false);
                            instigovt1.setSelected(false);
                        }

                        //cbres
                        if (rs.getString(45) != null) {
                            resvilla1.setSelected(false);
                            ressemidetached1.setSelected(false);
                            resother1.setSelected(false);
                            resmaisonette1.setSelected(false);
                            resdetatached1.setSelected(false);
                            resapartment1.setSelected(false);
                            System.out.println(rs.getString(45));

                            String commString = rs.getString(45).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Apartment":
                                        resapartment1.setSelected(true);
                                        break;
                                    case "Detached House":
                                        resdetatached1.setSelected(true);
                                        break;
                                    case "Maisonette":
                                        resmaisonette1.setSelected(true);
                                        break;
                                    case "Other":
                                        resother1.setSelected(true);
                                        break;
                                    case "Villa":
                                        resvilla1.setSelected(true);
                                        break;
                                    case "Semi-Detached":
                                        ressemidetached1.setSelected(true);
                                        break;
                                    default:
                                        resvilla1.setSelected(false);
                                        ressemidetached1.setSelected(false);
                                        resother1.setSelected(false);
                                        resmaisonette1.setSelected(false);
                                        resdetatached1.setSelected(false);
                                        resapartment1.setSelected(false);
                                }
                            }
                        } else {
                            resvilla1.setSelected(false);
                            ressemidetached1.setSelected(false);
                            resother1.setSelected(false);
                            resmaisonette1.setSelected(false);
                            resdetatached1.setSelected(false);
                            resapartment1.setSelected(false);
                        }

                        ((TextField) coyear1.getEditor()).setText(rs.getString(46));
                        ((TextField) recoyear1.getEditor()).setText(rs.getString(47));


                        //cbroof
                        if (rs.getString(48) != null) {
                            rooftilescement1.setSelected(false);
                            roofother1.setSelected(false);
                            roofironsheet1.setSelected(false);
                            roofharveytiles1.setSelected(false);
                            roofgrass1.setSelected(false);
                            roofconcrete1.setSelected(false);
                            roofasbestos1.setSelected(false);
                            System.out.println(rs.getString(48));

                            String commString = rs.getString(48).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Asbestos":
                                        roofasbestos1.setSelected(true);
                                        break;
                                    case "Concrete":
                                        roofconcrete1.setSelected(true);
                                        break;
                                    case "Grass/Palm":
                                        roofgrass1.setSelected(true);
                                        break;
                                    case "Harvey Tiles":
                                        roofharveytiles1.setSelected(true);
                                        break;
                                    case "Iron Sheet":
                                        roofironsheet1.setSelected(true);
                                        break;
                                    case "Tiles/Cement":
                                        rooftilescement1.setSelected(true);
                                        break;
                                    case "Mangalore":
                                        roofother1.setSelected(true);
                                        break;
                                    default:
                                        rooftilescement1.setSelected(false);
                                        roofother1.setSelected(false);
                                        roofironsheet1.setSelected(false);
                                        roofharveytiles1.setSelected(false);
                                        roofgrass1.setSelected(false);
                                        roofconcrete1.setSelected(false);
                                        roofasbestos1.setSelected(false);
                                }
                            }
                        } else {
                            rooftilescement1.setSelected(false);
                            roofother1.setSelected(false);
                            roofironsheet1.setSelected(false);
                            roofharveytiles1.setSelected(false);
                            roofgrass1.setSelected(false);
                            roofconcrete1.setSelected(false);
                            roofasbestos1.setSelected(false);
                        }

                        //cbextwa
                        if (rs.getString(49) != null) {
                            exteriorwallother1.setSelected(false);
                            exteriorwallmud1.setSelected(false);
                            exteriorwallhydraform1.setSelected(false);
                            exteriorwalltimber1.setSelected(false);
                            exteriorwallglass1.setSelected(false);
                            exteriorwallconcframe1.setSelected(false);
                            exteriorwallcementblock1.setSelected(false);
                            exteriorwallburntbricks1.setSelected(false);
                            System.out.println(rs.getString(49));

                            String commString = rs.getString(49).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Burnt Bricks":
                                        exteriorwallburntbricks1.setSelected(true);
                                        break;
                                    case "Cement Block":
                                        exteriorwallcementblock1.setSelected(true);
                                        break;
                                    case "R/Conc Frame":
                                        exteriorwallconcframe1.setSelected(true);
                                        break;
                                    case "Glass":
                                        exteriorwallglass1.setSelected(true);
                                        break;
                                    case "Timber":
                                        exteriorwalltimber1.setSelected(true);
                                        break;
                                    case "Hydraform":
                                        exteriorwallhydraform1.setSelected(true);
                                        break;
                                    case "Mud":
                                        exteriorwallmud1.setSelected(true);
                                        break;
                                    case "Other":
                                        exteriorwallother1.setSelected(true);
                                        break;
                                    default:
                                        exteriorwallother1.setSelected(false);
                                        exteriorwallmud1.setSelected(false);
                                        exteriorwallhydraform1.setSelected(false);
                                        exteriorwalltimber1.setSelected(false);
                                        exteriorwallglass1.setSelected(false);
                                        exteriorwallconcframe1.setSelected(false);
                                        exteriorwallcementblock1.setSelected(false);
                                        exteriorwallburntbricks1.setSelected(false);
                                }
                            }
                        } else {
                            exteriorwallother1.setSelected(false);
                            exteriorwallmud1.setSelected(false);
                            exteriorwallhydraform1.setSelected(false);
                            exteriorwalltimber1.setSelected(false);
                            exteriorwallglass1.setSelected(false);
                            exteriorwallconcframe1.setSelected(false);
                            exteriorwallcementblock1.setSelected(false);
                            exteriorwallburntbricks1.setSelected(false);
                        }

                        //cbextfin
                        if (rs.getString(50) != null) {
                            exteriorfinishcompact1.setSelected(false);
                            exteriorfinishglazed1.setSelected(false);
                            exteriorfinishfair1.setSelected(false);
                            exteriorfinishother1.setSelected(false);
                            exteriorfinishplaster1.setSelected(false);
                            exteriorfinishtiles1.setSelected(false);
                            exteriorfinishtyrolean1.setSelected(false);
                            System.out.println(rs.getString(50));

                            String commString = rs.getString(50).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Tyrolean":
                                        exteriorfinishtyrolean1.setSelected(true);
                                        break;
                                    case "Tiles":
                                        exteriorfinishtiles1.setSelected(true);
                                        break;
                                    case "Plaster/Paint":
                                        exteriorfinishplaster1.setSelected(true);
                                        break;
                                    case "Other":
                                        exteriorfinishother1.setSelected(true);
                                        break;
                                    case "Fair Finish":
                                        exteriorfinishfair1.setSelected(true);
                                        break;
                                    case "Glazed":
                                        exteriorfinishglazed1.setSelected(true);
                                        break;
                                    case "Compact Earth":
                                        exteriorfinishcompact1.setSelected(true);
                                        break;
                                    default:
                                        exteriorfinishcompact1.setSelected(false);
                                        exteriorfinishglazed1.setSelected(false);
                                        exteriorfinishfair1.setSelected(false);
                                        exteriorfinishother1.setSelected(false);
                                        exteriorfinishplaster1.setSelected(false);
                                        exteriorfinishtiles1.setSelected(false);
                                        exteriorfinishtyrolean1.setSelected(false);
                                }
                            }
                        } else {
                            exteriorfinishcompact1.setSelected(false);
                            exteriorfinishglazed1.setSelected(false);
                            exteriorfinishfair1.setSelected(false);
                            exteriorfinishother1.setSelected(false);
                            exteriorfinishplaster1.setSelected(false);
                            exteriorfinishtiles1.setSelected(false);
                            exteriorfinishtyrolean1.setSelected(false);
                        }

                        //cbwindows
                        if (rs.getString(51) != null) {
                            windowswoodcasement1.setSelected(false);
                            windowswoodabb1.setSelected(false);
                            windowssteelframe1.setSelected(false);
                            windowsother1.setSelected(false);
                            windowsglass1.setSelected(false);
                            windowsaluframe1.setSelected(false);
                            System.out.println(rs.getString(51));

                            String commString = rs.getString(51).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Tyrolean":
                                        windowsaluframe1.setSelected(true);
                                        break;
                                    case "Tiles":
                                        windowsglass1.setSelected(true);
                                        break;
                                    case "Plaster/Paint":
                                        windowsother1.setSelected(true);
                                        break;
                                    case "Other":
                                        windowssteelframe1.setSelected(true);
                                        break;
                                    case "Fair Finish":
                                        windowswoodabb1.setSelected(true);
                                        break;
                                    case "Glazed":
                                        windowswoodcasement1.setSelected(true);
                                        break;
                                    default:
                                        windowswoodcasement1.setSelected(false);
                                        windowswoodabb1.setSelected(false);
                                        windowssteelframe1.setSelected(false);
                                        windowsother1.setSelected(false);
                                        windowsglass1.setSelected(false);
                                        windowsaluframe1.setSelected(false);
                                }
                            }
                        } else {
                            windowswoodcasement1.setSelected(false);
                            windowswoodabb1.setSelected(false);
                            windowssteelframe1.setSelected(false);
                            windowsother1.setSelected(false);
                            windowsglass1.setSelected(false);
                            windowsaluframe1.setSelected(false);
                        }

                        //cbdoors
                        if (rs.getString(52) != null) {
                            doorssteelshutters1.setSelected(false);
                            doorswoodflush1.setSelected(false);
                            doorswoodbattens1.setSelected(false);
                            doorssteelsheets1.setSelected(false);
                            doorsother1.setSelected(false);
                            doorsalu1.setSelected(false);
                            System.out.println(rs.getString(52));

                            String commString = rs.getString(52).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Alluminium":
                                        doorsalu1.setSelected(true);
                                        break;
                                    case "other":
                                        doorsother1.setSelected(true);
                                        break;
                                    case "Steel Sheets":
                                        doorssteelsheets1.setSelected(true);
                                        break;
                                    case "Wood Battens":
                                        doorswoodbattens1.setSelected(true);
                                        break;
                                    case "Wood Flush":
                                        doorswoodflush1.setSelected(true);
                                        break;
                                    case "Steel Shutters":
                                        doorssteelshutters1.setSelected(true);
                                        break;
                                    default:
                                        doorssteelshutters1.setSelected(false);
                                        doorswoodflush1.setSelected(false);
                                        doorswoodbattens1.setSelected(false);
                                        doorssteelsheets1.setSelected(false);
                                        doorsother1.setSelected(false);
                                        doorsalu1.setSelected(false);
                                }
                            }
                        } else {
                            doorssteelshutters1.setSelected(false);
                            doorswoodflush1.setSelected(false);
                            doorswoodbattens1.setSelected(false);
                            doorssteelsheets1.setSelected(false);
                            doorsother1.setSelected(false);
                            doorsalu1.setSelected(false);
                        }
                        //cbfloor
                        if (rs.getString(53) != null) {
                            floorwood1.setSelected(false);
                            floortiles1.setSelected(false);
                            floorother1.setSelected(false);
                            floormarble1.setSelected(false);
                            floorinsitu1.setSelected(false);
                            floorcompact1.setSelected(false);
                            floorcement1.setSelected(false);
                            System.out.println(rs.getString(53));

                            String commString = rs.getString(53).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Cement Screed":
                                        floorcement1.setSelected(true);
                                        break;
                                    case "Compact Earth":
                                        floorcompact1.setSelected(true);
                                        break;
                                    case "In situ  Terazzo":
                                        floorinsitu1.setSelected(true);
                                        break;
                                    case "Marble/Granite":
                                        floormarble1.setSelected(true);
                                        break;
                                    case "Other":
                                        floorother1.setSelected(true);
                                        break;
                                    case "Tiles":
                                        floortiles1.setSelected(true);
                                        break;
                                    case "Wood /Parquet":
                                        floorwood1.setSelected(true);
                                        break;
                                    default:
                                        floorwood1.setSelected(false);
                                        floortiles1.setSelected(false);
                                        floorother1.setSelected(false);
                                        floormarble1.setSelected(false);
                                        floorinsitu1.setSelected(false);
                                        floorcompact1.setSelected(false);
                                        floorcement1.setSelected(false);
                                }
                            }
                        } else {
                            floorwood1.setSelected(false);
                            floortiles1.setSelected(false);
                            floorother1.setSelected(false);
                            floormarble1.setSelected(false);
                            floorinsitu1.setSelected(false);
                            floorcompact1.setSelected(false);
                            floorcement1.setSelected(false);
                        }

                        //cbceiling
                        if (rs.getString(54) != null) {
                            ceilingsuspended1.setSelected(false);
                            ceilingsoftboard1.setSelected(false);
                            ceilingplaster1.setSelected(false);
                            ceilingother1.setSelected(false);
                            ceilinggypsum1.setSelected(false);
                            ceilingchipboard1.setSelected(false);
                            ceilingwood1.setSelected(false);
                            System.out.println(rs.getString(54));

                            String commString = rs.getString(54).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Wood tongue & grooved":
                                        ceilingwood1.setSelected(true);
                                        break;
                                    case "chipboard":
                                        ceilingchipboard1.setSelected(true);
                                        break;
                                    case "Gypsum":
                                        ceilinggypsum1.setSelected(true);
                                        break;
                                    case "Other":
                                        ceilingother1.setSelected(true);
                                        break;
                                    case "Plastered/Concrete":
                                        ceilingplaster1.setSelected(true);
                                        break;
                                    case "Softboard/Hardboard":
                                        ceilingsoftboard1.setSelected(true);
                                        break;
                                    case "Suspended/Acoustic":
                                        ceilingsuspended1.setSelected(true);
                                        break;
                                    default:
                                        ceilingsuspended1.setSelected(false);
                                        ceilingsoftboard1.setSelected(false);
                                        ceilingplaster1.setSelected(false);
                                        ceilingother1.setSelected(false);
                                        ceilinggypsum1.setSelected(false);
                                        ceilingchipboard1.setSelected(false);
                                        ceilingwood1.setSelected(false);
                                }
                            }
                        } else {
                            ceilingsuspended1.setSelected(false);
                            ceilingsoftboard1.setSelected(false);
                            ceilingplaster1.setSelected(false);
                            ceilingother1.setSelected(false);
                            ceilinggypsum1.setSelected(false);
                            ceilingchipboard1.setSelected(false);
                            ceilingwood1.setSelected(false);
                        }

                        this.nofloor.setText(rs.getString(55));
                        this.noroom.setText(rs.getString(56));


                        //cbwater
                        if (rs.getString(57) != null) {
                            waterriver1.setSelected(false);
                            waterstandtap1.setSelected(false);
                            waterrain1.setSelected(false);
                            waternone1.setSelected(false);
                            watermains1.setSelected(false);
                            waterborehole1.setSelected(false);
                            System.out.println(rs.getString(57));

                            String commString = rs.getString(57).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Borehole":
                                        waterborehole1.setSelected(true);
                                        break;
                                    case "Mains":
                                        watermains1.setSelected(true);
                                        break;
                                    case "None":
                                        waternone1.setSelected(true);
                                        break;
                                    case "Rain":
                                        waterrain1.setSelected(true);
                                        break;
                                    case "Stand Tap":
                                        waterstandtap1.setSelected(true);
                                        break;
                                    case "River/Stream":
                                        waterriver1.setSelected(true);
                                        break;
                                    default:
                                        waterriver1.setSelected(false);
                                        waterstandtap1.setSelected(false);
                                        waterrain1.setSelected(false);
                                        waternone1.setSelected(false);
                                        watermains1.setSelected(false);
                                        waterborehole1.setSelected(false);
                                }
                            }
                        } else {
                            waterriver1.setSelected(false);
                            waterstandtap1.setSelected(false);
                            waterrain1.setSelected(false);
                            waternone1.setSelected(false);
                            watermains1.setSelected(false);
                            waterborehole1.setSelected(false);
                        }

                        //cbdrainage
                        if (rs.getString(58) != null) {
                            drainagesewer1.setSelected(false);
                            drainageptictank1.setSelected(false);
                            drainagepitlatrine1.setSelected(false);
                            drainageother1.setSelected(false);
                            drainagenone1.setSelected(false);
                            System.out.println(rs.getString(58));

                            String commString = rs.getString(58).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "None":
                                        drainagenone1.setSelected(true);
                                        break;
                                    case "Other":
                                        drainageother1.setSelected(true);
                                        break;
                                    case "Pit Latrine":
                                        drainagepitlatrine1.setSelected(true);
                                        break;
                                    case "Septic Tank":
                                        drainageptictank1.setSelected(true);
                                        break;
                                    case "Sewer":
                                        drainagesewer1.setSelected(true);
                                        break;
                                    default:
                                        drainagesewer1.setSelected(false);
                                        drainageptictank1.setSelected(false);
                                        drainagepitlatrine1.setSelected(false);
                                        drainageother1.setSelected(false);
                                        drainagenone1.setSelected(false);
                                }
                            }
                        } else {
                            drainagesewer1.setSelected(false);
                            drainageptictank1.setSelected(false);
                            drainagepitlatrine1.setSelected(false);
                            drainageother1.setSelected(false);
                            drainagenone1.setSelected(false);
                        }

                        //cbelectricity
                        if (rs.getString(59) != null) {
                            electricitysolar1.setSelected(false);
                            electricitynone1.setSelected(false);
                            electricitymains1.setSelected(false);
                            System.out.println(rs.getString(59));

                            String commString = rs.getString(59).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "None":
                                        electricitynone1.setSelected(true);
                                        break;
                                    case "Mains":
                                        electricitymains1.setSelected(true);
                                        break;
                                    case "Solar":
                                        electricitysolar1.setSelected(true);
                                        break;
                                    default:
                                        electricitysolar1.setSelected(false);
                                        electricitynone1.setSelected(false);
                                        electricitymains1.setSelected(false);
                                }
                            }
                        } else {
                            electricitysolar1.setSelected(false);
                            electricitynone1.setSelected(false);
                            electricitymains1.setSelected(false);
                        }

                        //cbhq
                        if (rs.getString(60) != null) {
                            hqwashhand1.setSelected(false);
                            hqnone1.setSelected(false);
                            hqkitchencabinet1.setSelected(false);
                            hqjacuzzi1.setSelected(false);
                            hqhighpowder1.setSelected(false);
                            hqbuiltin1.setSelected(false);
                            System.out.println(rs.getString(60));

                            String commString = rs.getString(60).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Built-in \n" +
                                            "Wardrobe":
                                        hqbuiltin1.setSelected(true);
                                        break;
                                    case "High-Powder\n" +
                                            "WC":
                                        hqhighpowder1.setSelected(true);
                                        break;
                                    case "Jacuzzi/\n" +
                                            "Sauna":
                                        hqjacuzzi1.setSelected(true);
                                        break;
                                    case "Kitchen \n" +
                                            "Cabinet":
                                        hqkitchencabinet1.setSelected(true);
                                        break;
                                    case "None":
                                        hqnone1.setSelected(true);
                                        break;
                                    case "Wash hand\n" +
                                            "Basin":
                                        hqwashhand1.setSelected(true);
                                        break;
                                    default:
                                        hqwashhand1.setSelected(false);
                                        hqnone1.setSelected(false);
                                        hqkitchencabinet1.setSelected(false);
                                        hqjacuzzi1.setSelected(false);
                                        hqhighpowder1.setSelected(false);
                                        hqbuiltin1.setSelected(false);
                                }
                            }
                        } else {
                            hqwashhand1.setSelected(false);
                            hqnone1.setSelected(false);
                            hqkitchencabinet1.setSelected(false);
                            hqjacuzzi1.setSelected(false);
                            hqhighpowder1.setSelected(false);
                            hqbuiltin1.setSelected(false);
                        }
                        //cbgq
                        if (rs.getString(61) != null) {
                            gqwesterntoilet1.setSelected(false);
                            gqwashhand1.setSelected(false);
                            gqnone1.setSelected(false);
                            gqkitchen1.setSelected(false);
                            gqbuiltin1.setSelected(false);
                            gqbathtubs1.setSelected(false);
                            System.out.println(rs.getString(61));

                            String commString = rs.getString(61).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Bath Tubs":
                                        gqbathtubs1.setSelected(true);
                                        break;
                                    case "Built-in \n" +
                                            "Wardrobe":
                                        gqbuiltin1.setSelected(true);
                                        break;
                                    case "Kitchen \n" +
                                            "Cupboards":
                                        gqkitchen1.setSelected(true);
                                        break;
                                    case "None":
                                        gqnone1.setSelected(true);
                                        break;
                                    case "Wash hand\n" +
                                            "Basin":
                                        gqwashhand1.setSelected(true);
                                        break;
                                    case "Western Toilet/\n" +
                                            "Eastern WC":
                                        gqwesterntoilet1.setSelected(true);
                                        break;
                                    default:
                                        gqwesterntoilet1.setSelected(false);
                                        gqwashhand1.setSelected(false);
                                        gqnone1.setSelected(false);
                                        gqkitchen1.setSelected(false);
                                        gqbuiltin1.setSelected(false);
                                        gqbathtubs1.setSelected(false);
                                }
                            }
                        } else {
                            gqwesterntoilet1.setSelected(false);
                            gqwashhand1.setSelected(false);
                            gqnone1.setSelected(false);
                            gqkitchen1.setSelected(false);
                            gqbuiltin1.setSelected(false);
                            gqbathtubs1.setSelected(false);
                        }

                        //cbamenit
                        if (rs.getString(62) != null) {
                            amenitiespool1.setSelected(false);
                            amenitiesnone1.setSelected(false);
                            amenitieslift1.setSelected(false);
                            amenitiesfire1.setSelected(false);
                            amenitiescentralcooling1.setSelected(false);
                            System.out.println(rs.getString(62));

                            String commString = rs.getString(62).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Central Cooling\n" +
                                            "System":
                                        amenitiescentralcooling1.setSelected(true);
                                        break;
                                    case "Fire Fighting\n" +
                                            "System":
                                        amenitiesfire1.setSelected(true);
                                        break;
                                    case "Lift/\n" +
                                            "Escalator":
                                        amenitieslift1.setSelected(true);
                                        break;
                                    case "None":
                                        amenitiesnone.setSelected(true);
                                        break;
                                    case "Swimming Pool":
                                        amenitiespool1.setSelected(true);
                                        break;
                                    default:
                                        amenitiespool1.setSelected(false);
                                        amenitiesnone1.setSelected(false);
                                        amenitieslift1.setSelected(false);
                                        amenitiesfire1.setSelected(false);
                                        amenitiescentralcooling1.setSelected(false);
                                }
                            }
                        } else {
                            amenitiespool1.setSelected(false);
                            amenitiesnone1.setSelected(false);
                            amenitieslift1.setSelected(false);
                            amenitiesfire1.setSelected(false);
                            amenitiescentralcooling1.setSelected(false);
                        }

                        this.exllent1.setValue(rs.getString(63));
                        this.good1.setValue(rs.getString(64));
                        this.fair1.setValue(rs.getString(65));
                        this.poor1.setValue(rs.getString(66));

                        //cbroad
                        if (rs.getString(67) != null) {
                            roadtarmac1.setSelected(false);
                            roadother1.setSelected(false);
                            roadnone1.setSelected(false);
                            roadmurram1.setSelected(false);
                            roadfootpath1.setSelected(false);
                            roadearth1.setSelected(false);
                            System.out.println(rs.getString(67));

                            String commString = rs.getString(67).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Earth":
                                        roadearth1.setSelected(true);
                                        break;
                                    case "Footpath":
                                        roadfootpath1.setSelected(true);
                                        break;
                                    case "Murram/Gravel":
                                        roadmurram1.setSelected(true);
                                        break;
                                    case "None":
                                        roadnone1.setSelected(true);
                                        break;
                                    case "Other":
                                        roadother1.setSelected(true);
                                        break;
                                    case "Tarmac":
                                        roadtarmac1.setSelected(true);
                                        break;
                                    default:
                                        roadtarmac1.setSelected(false);
                                        roadother1.setSelected(false);
                                        roadnone1.setSelected(false);
                                        roadmurram1.setSelected(false);
                                        roadfootpath1.setSelected(false);
                                        roadearth1.setSelected(false);
                                }
                            }
                        } else {
                            roadtarmac1.setSelected(false);
                            roadother1.setSelected(false);
                            roadnone1.setSelected(false);
                            roadmurram1.setSelected(false);
                            roadfootpath1.setSelected(false);
                            roadearth1.setSelected(false);
                        }

                        //cbroad
                        if (rs.getString(68) != null) {
                            fencetimber1.setSelected(false);
                            fencesteel1.setSelected(false);
                            fenceplant1.setSelected(false);
                            fencenone1.setSelected(false);
                            fencehydraform1.setSelected(false);
                            fencechainlink1.setSelected(false);
                            fencecement1.setSelected(false);
                            System.out.println(rs.getString(68));

                            String commString = rs.getString(68).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Cement Blocks":
                                        fencecement1.setSelected(true);
                                        break;
                                    case "Chain Link":
                                        fencechainlink1.setSelected(true);
                                        break;
                                    case "Hydraform":
                                        fencehydraform1.setSelected(true);
                                        break;
                                    case "None":
                                        fencenone1.setSelected(true);
                                        break;
                                    case "Plant/Hedge":
                                        fenceplant1.setSelected(true);
                                        break;
                                    case "Steel":
                                        fencesteel1.setSelected(true);
                                        break;
                                    case "Timber":
                                        fencetimber1.setSelected(true);
                                        break;
                                    default:
                                        fencetimber1.setSelected(false);
                                        fencesteel1.setSelected(false);
                                        fenceplant1.setSelected(false);
                                        fencenone1.setSelected(false);
                                        fencehydraform1.setSelected(false);
                                        fencechainlink1.setSelected(false);
                                        fencecement1.setSelected(false);
                                }
                            }
                        } else {
                            fencetimber1.setSelected(false);
                            fencesteel1.setSelected(false);
                            fenceplant1.setSelected(false);
                            fencenone1.setSelected(false);
                            fencehydraform1.setSelected(false);
                            fencechainlink1.setSelected(false);
                            fencecement1.setSelected(false);
                        }

                        //cbcomp
                        if (rs.getString(69) != null) {
                            compoundother1.setSelected(false);
                            compoundtarmac1.setSelected(false);
                            compoundnone1.setSelected(false);
                            compoundlawn1.setSelected(false);
                            compoundinterblocks1.setSelected(false);
                            compoundconcrete1.setSelected(false);
                            System.out.println(rs.getString(69));

                            String commString = rs.getString(69).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Concrete/Slabs":
                                        compoundconcrete1.setSelected(true);
                                        break;
                                    case "Interlocking Blocks":
                                        compoundinterblocks1.setSelected(true);
                                        break;
                                    case "Lawn/Garden":
                                        compoundlawn1.setSelected(true);
                                        break;
                                    case "None":
                                        compoundnone1.setSelected(true);
                                        break;
                                    case "Tarmac":
                                        compoundtarmac1.setSelected(true);
                                        break;
                                    case "Other":
                                        compoundother1.setSelected(true);
                                        break;
                                    default:
                                        compoundother1.setSelected(false);
                                        compoundtarmac1.setSelected(false);
                                        compoundnone1.setSelected(false);
                                        compoundlawn1.setSelected(false);
                                        compoundinterblocks1.setSelected(false);
                                        compoundconcrete1.setSelected(false);
                                }
                            }
                        } else {
                            compoundother1.setSelected(false);
                            compoundtarmac1.setSelected(false);
                            compoundnone1.setSelected(false);
                            compoundlawn1.setSelected(false);
                            compoundinterblocks1.setSelected(false);
                            compoundconcrete1.setSelected(false);
                        }
                        //cbobno1
                        if (rs.getString(71) != null) {
                            obno1workshop1.setSelected(false);
                            obno1store1.setSelected(false);
                            obno1servants1.setSelected(false);
                            obno1other1.setSelected(false);
                            obno1garage1.setSelected(false);
                            System.out.println(rs.getString(71));

                            String commString = rs.getString(71).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Garage":
                                        obno1garage1.setSelected(true);
                                        break;
                                    case "Other":
                                        obno1other1.setSelected(true);
                                        break;
                                    case "Servants Qtrs":
                                        obno1servants1.setSelected(true);
                                        break;
                                    case "Store":
                                        obno1store1.setSelected(true);
                                        break;
                                    case "Workshop":
                                        obno1workshop1.setSelected(true);
                                        break;
                                    default:
                                        obno1workshop1.setSelected(false);
                                        obno1store1.setSelected(false);
                                        obno1servants1.setSelected(false);
                                        obno1other1.setSelected(false);
                                        obno1garage1.setSelected(false);
                                }
                            }
                        } else {
                            obno1workshop1.setSelected(false);
                            obno1store1.setSelected(false);
                            obno1servants1.setSelected(false);
                            obno1other1.setSelected(false);
                            obno1garage1.setSelected(false);
                        }
                        //cbobnone
                        if (rs.getString(70) != null) {
                            obnone1.setSelected(false);
                            System.out.println(rs.getString(70));

                            String commString = rs.getString(70).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "None":
                                        obnone1.setSelected(true);
                                        break;
                                    default:
                                        obnone1.setSelected(false);
                                }
                            }
                        } else {
                            obnone1.setSelected(false);
                        }

                        String ob1 = rs.getString(72);
                        obno1hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                        @Override
                                                        public void handle(ActionEvent e) {
                                                            try {
                                                                Desktop.getDesktop().browse(new URI(ob1));
                                                            } catch (IOException e1) {
                                                                e1.printStackTrace();
                                                            } catch (URISyntaxException e1) {
                                                                e1.printStackTrace();
                                                            }
                                                        }
                                                    }
                        );

                        //cbobno2
                        if (rs.getString(73) != null) {
                            obno2workshop1.setSelected(false);
                            obno2store1.setSelected(false);
                            obno2servants1.setSelected(false);
                            obno2other1.setSelected(false);
                            obno2garage1.setSelected(false);
                            System.out.println(rs.getString(73));

                            String commString = rs.getString(73).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Garage":
                                        obno2garage1.setSelected(true);
                                        break;
                                    case "Other":
                                        obno2other1.setSelected(true);
                                        break;
                                    case "Servants Qtrs":
                                        obno2servants1.setSelected(true);
                                        break;
                                    case "Store":
                                        obno2store1.setSelected(true);
                                        break;
                                    case "Workshop":
                                        obno2workshop1.setSelected(true);
                                        break;
                                    default:
                                        obno2workshop1.setSelected(false);
                                        obno2store1.setSelected(false);
                                        obno2servants1.setSelected(false);
                                        obno2other1.setSelected(false);
                                        obno2garage1.setSelected(false);
                                }
                            }
                        } else {
                            obno2workshop1.setSelected(false);
                            obno2store1.setSelected(false);
                            obno2servants1.setSelected(false);
                            obno2other1.setSelected(false);
                            obno2garage1.setSelected(false);
                        }

                        String ob2 = rs.getString(74);
                        obno2hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                        @Override
                                                        public void handle(ActionEvent e) {
                                                            try {
                                                                Desktop.getDesktop().browse(new URI(ob2));
                                                            } catch (IOException e1) {
                                                                e1.printStackTrace();
                                                            } catch (URISyntaxException e1) {
                                                                e1.printStackTrace();
                                                            }
                                                        }
                                                    }
                        );

                        //cbobno3
                        if (rs.getString(75) != null) {
                            obno3workshop1.setSelected(false);
                            obno3store1.setSelected(false);
                            obno3servants1.setSelected(false);
                            obno3other1.setSelected(false);
                            obno3garage1.setSelected(false);
                            System.out.println(rs.getString(75));

                            String commString = rs.getString(75).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Garage":
                                        obno3garage1.setSelected(true);
                                        break;
                                    case "Other":
                                        obno3other1.setSelected(true);
                                        break;
                                    case "Servants Qtrs":
                                        obno3servants1.setSelected(true);
                                        break;
                                    case "Store":
                                        obno3store1.setSelected(true);
                                        break;
                                    case "Workshop":
                                        obno3workshop1.setSelected(true);
                                        break;
                                    default:
                                        obno3workshop1.setSelected(false);
                                        obno3store1.setSelected(false);
                                        obno3servants1.setSelected(false);
                                        obno3other1.setSelected(false);
                                        obno3garage1.setSelected(false);
                                }
                            }
                        } else {
                            obno3workshop1.setSelected(false);
                            obno3store1.setSelected(false);
                            obno3servants1.setSelected(false);
                            obno3other1.setSelected(false);
                            obno3garage1.setSelected(false);
                        }

                        String ob3 = rs.getString(76);
                        obno3hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                        @Override
                                                        public void handle(ActionEvent e) {
                                                            try {
                                                                Desktop.getDesktop().browse(new URI(ob3));
                                                            } catch (IOException e1) {
                                                                e1.printStackTrace();
                                                            } catch (URISyntaxException e1) {
                                                                e1.printStackTrace();
                                                            }
                                                        }
                                                    }
                        );

                        //cbobno4
                        if (rs.getString(77) != null) {
                            obno4workshop.setSelected(false);
                            obno4store1.setSelected(false);
                            obno4servants1.setSelected(false);
                            obno4other1.setSelected(false);
                            obno4garage1.setSelected(false);
                            System.out.println(rs.getString(77));

                            String commString = rs.getString(77).replace("[", "").replace("]", "");
                            System.out.println(commString);

                            List<String> commList = Arrays.asList(commString.split("\\s*,\\s*"));
                            System.out.println(commList);

                            for (String comm : commList) {
                                switch (comm) {
                                    case "Garage":
                                        obno4garage1.setSelected(true);
                                        break;
                                    case "Other":
                                        obno4other1.setSelected(true);
                                        break;
                                    case "Servants Qtrs":
                                        obno4servants1.setSelected(true);
                                        break;
                                    case "Store":
                                        obno4store1.setSelected(true);
                                        break;
                                    case "Workshop":
                                        obno4workshop1.setSelected(true);
                                        break;
                                    default:
                                        obno4workshop1.setSelected(false);
                                        obno4store1.setSelected(false);
                                        obno4servants1.setSelected(false);
                                        obno4other1.setSelected(false);
                                        obno4garage1.setSelected(false);
                                }
                            }
                        } else {
                            obno4workshop1.setSelected(false);
                            obno4store1.setSelected(false);
                            obno4servants1.setSelected(false);
                            obno4other1.setSelected(false);
                            obno4garage1.setSelected(false);
                        }

                        String ob4 = rs.getString(78);
                        obno4hyperlink1.setOnAction(new EventHandler<ActionEvent>() {
                                                        @Override
                                                        public void handle(ActionEvent e) {
                                                            try {
                                                                Desktop.getDesktop().browse(new URI(ob4));
                                                            } catch (IOException e1) {
                                                                e1.printStackTrace();
                                                            } catch (URISyntaxException e1) {
                                                                e1.printStackTrace();
                                                            }
                                                        }
                                                    }
                        );

                        Image image1 = new Image(rs.getBinaryStream(79));
                        sketchphoto1.setImage(image1);


                        Image image2 = new Image(rs.getBinaryStream(80));
                        buildphoto11.setImage(image2);

                        Image image3 = new Image(rs.getBinaryStream(81));
                        buildphoto21.setImage(image3);

                        this.noofbaths1.setText(rs.getString(82));
                        this.nooftoilets1.setText(rs.getString(83));
                        this.mblen1.setText(rs.getString(84));
                        this.mbwid1.setText(rs.getString(85));
                        this.mbarea1.setText(rs.getString(86));
                        this.mbredfact1.setText(rs.getString(87));
                        this.mbcompfact1.setText(rs.getString(88));
                        this.mbredfactarea1.setText(rs.getString(89));
                        this.ob1len1.setText(rs.getString(90));
                        this.ob1wid1.setText(rs.getString(91));
                        this.ob1area1.setText(rs.getString(92));
                        this.ob1redfact1.setText(rs.getString(93));
                        this.ob1compfact1.setText(rs.getString(94));
                        this.ob1redfactarea1.setText(rs.getString(95));
                        this.ob2len1.setText(rs.getString(96));
                        this.ob2wid1.setText(rs.getString(97));
                        this.ob2area1.setText(rs.getString(98));
                        this.ob2redfact1.setText(rs.getString(99));
                        this.ob2compfact1.setText(rs.getString(100));
                        this.ob2redfactarea1.setText(rs.getString(101));
                        this.ob3len1.setText(rs.getString(102));
                        this.ob3wid1.setText(rs.getString(103));
                        this.ob3area1.setText(rs.getString(104));
                        this.ob3redfact1.setText(rs.getString(105));
                        this.ob3compfact1.setText(rs.getString(106));
                        this.ob3redfactarea1.setText(rs.getString(107));
                        this.ob4len1.setText(rs.getString(108));
                        this.ob4wid1.setText(rs.getString(109));
                        this.ob4area1.setText(rs.getString(110));
                        this.ob4redfact1.setText(rs.getString(111));
                        this.ob4compfact1.setText(rs.getString(112));
                        this.ob4redfactarea1.setText(rs.getString(113));
                        this.totalrfa1.setText(rs.getString(114));
                        this.totalrfasqr1.setText(rs.getString(115));
                        this.multiplybyall1.setText(rs.getString(116));
                        this.currentreplacementcost1.setText(rs.getString(117));
                        this.lessdeprec1.setText(rs.getString(118));
                        this.deprecreplacementcost1.setText(rs.getString(119));
                        this.inspectedby1.setText(rs.getString(120));
                        this.checkedby1.setText(rs.getString(121));
                        this.approvedby1.setText(rs.getString(122));
                        this.companyname1.setText(rs.getString(123));
                        this.companystamp1.setText(rs.getString(124));
                        ((TextField) certifieddate1.getEditor()).setText(rs.getString(125));
                        this.tin1.setText(rs.getString(126));
                        this.docrefyear11.setText(rs.getString(1) + "   " + rs.getString(24) + "   " + rs.getString(25));

                    }

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            
        });
    }

    @FXML
    private void mySimple() {

        listnames111.setItems(namesList3);
        try {
            Connection connection = dbConnection.getConnection();
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM block");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                namesList3.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        listnames111.setOnMouseClicked(e -> {
            clearFields();

            try {
                String query = "SELECT * FROM block where OWNERFN = ?";
                Connection conn = dbConnection.getConnection();
                ResultSet rs;
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, listnames111.getSelectionModel().getSelectedItem());
                rs = pst.executeQuery();

                while (rs.next()) {
                    this.path331.setText(rs.getString(23));
                    this.path3311.setText(rs.getString(1) + "   " + rs.getString(24) + "   " + rs.getString(25));
                    this.path33.setText("PROP REF NO:-"+ "                                           "+"FULL NAME"+rs.getString(1) + "   " + rs.getString(24) + "   " + rs.getString(25)+"\n"+
                            "     "+"YEAR:  "+rs.getString(2)+"\n"+
                            "     "+"BUNDLE NO.:  "+rs.getString(3)+"\n"+
                            "     "+"PAGE NO.:  "+rs.getString(4)+"\n"+
                            "\n"+
                            "RATEABLE/NON-RATEABLE:  "+rs.getString(127).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "PROP REF NO:  "+rs.getString(23)+"\n"+
                            "     "+"WARD:  "+rs.getString(5)+"\n"+
                            "     "+"MTAA:  "+rs.getString(6)+"\n"+
                            "     "+"RATEBLOCK:  "+rs.getString(7)+"\n"+
                            "     "+"OBJECT NO:  "+rs.getString(8)+"\n"+
                            "     "+"BUILDING NO:  "+rs.getString(9)+"\n"+
                            "\n"+
                            "PROPERTY LOCATION:  "+"\n"+
                            "     "+"STREET+LOCATION:  "+rs.getString(10)+"\n"+
                            "     "+"PLOT NO:  "+rs.getString(11)+"\n"+
                            "     "+"SURVEY BLOCK:  "+rs.getString(12)+"\n"+
                            "     "+"EXISTING PROPERTY REF NO.:  "+rs.getString(13)+"\n"+
                            "     "+"MAP REF:  "+rs.getString(14)+"\n"+
                            "\n"+
                            "OWNER/LEASE/BENEFICIARY:-"+"\n"+
                            "     "+"INDIVIDUAL:  "+rs.getString(128).replace("[", "").replace("]", "")+"\n"+
                            "     "+"FIRST NAME:  "+rs.getString(15)+"\n"+
                            "     "+"MIDDLE NAME:  "+rs.getString(16)+"\n"+
                            "     "+"LAST NAME:  "+rs.getString(17)+"\n"+
                            "     "+"PHONE1:  "+rs.getString(18)+"\n"+
                            "     "+"PHONE2:  "+rs.getString(19)+"\n"+
                            "     "+"LEGAL ENTITY:  "+rs.getString(129).replace("[", "").replace("]", "")+"\n"+
                            "     "+"FULL COMPANY NAME:  "+rs.getString(20)+"\n"+
                            "     "+"PHONE1:  "+rs.getString(21)+"\n"+
                            "     "+"PHONE2:  "+rs.getString(22)+"\n"+
                            "\n"+
                            "OWNER'S INFORMATIONS:  "+"\n"+
                            "     "+"TIN:  "+rs.getString(126)+"\n"+
                            "     "+"FIRST NAME:  "+rs.getString(1)+"\n"+
                            "     "+"MIDDLE NAME:  "+rs.getString(24)+"\n"+
                            "     "+"LAST NAME:  "+rs.getString(25)+"\n"+
                            "     "+"PHONE1:  "+rs.getString(26)+"\n"+
                            "     "+"PHONE2:  "+rs.getString(27)+"\n"+
                            "     "+"STREET+LOCATION:  "+rs.getString(28)+"\n"+
                            "     "+"PLOT NO.:  "+rs.getString(29)+"\n"+
                            "     "+"P.O. BOX/TOWN:  "+rs.getString(30)+"\n"+
                            "     "+"REGION:  "+rs.getString(31)+"\n"+
                            "     "+"DISTRICT:  "+rs.getString(32)+"\n"+
                            "     "+"WARD:  "+rs.getString(33)+"\n"+
                            "     "+"MTAA:  "+rs.getString(34)+"\n"+
                            "     "+"EMAIL ADDRESS:  "+rs.getString(35)+"\n"+
                            "\n"+
                            "LAND CHARACTERISTICS:-"+"\n"+
                            "     "+"TENURE:  "+rs.getString(36).replace("[", "").replace("]", "")+"\n"+
                            "     "+"LAND USE:  "+rs.getString(37).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "     "+"PROPERTY SALES DATA:-"+"\n"+
                            "     "+"ACTUAL TRANSACTION VALUE(Tsh):  "+rs.getString(38)+" /=Tsh"+"\n"+
                            "     "+"TRANSACTION DATE:  "+rs.getString(39)+"\n"+
                            "     "+"SOURCE OF INFORMATION:  "+rs.getString(40).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "BUILDING TYPE AND CONSTRUCTION CHARACTERISTICS:-"+"\n"+
                            "     "+"NO OF STORIES:  "+rs.getString(41)+"\n"+
                            "     "+"COMPLETE:  "+rs.getString(42)+"%"+"\n"+
                            "     "+"BUILDING TYPE/USE:COMMERCIAL/INDUSTRIAL:  "+rs.getString(43).replace("[", "").replace("]", "")+"\n"+
                            "     "+"BUILDING TYPE/USE:INSTITUTIONAL:  "+rs.getString(44).replace("[", "").replace("]", "")+"\n"+
                            "     "+"BUILDING TYPE/USE:RESIDENTIAL:  "+rs.getString(45).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "DETAILS OF CONSTRUCTION:-"+"\n"+
                            "     "+"CONSTRUCTION YEAR:  "+rs.getString(46)+"\n"+
                            "     "+"RECONSTRUCTION YEAR:  "+rs.getString(47)+"\n"+
                            "     "+"ROOF TYPE:  "+rs.getString(48).replace("[", "").replace("]", "")+"\n"+
                            "     "+"EXTERIOR WALL TYPE:  "+rs.getString(49).replace("[", "").replace("]", "")+"\n"+
                            "     "+"EXTERIOR WALL FINISH:  "+rs.getString(50).replace("[", "").replace("]", "")+"\n"+
                            "     "+"WINDOWS:  "+rs.getString(51).replace("[", "").replace("]", "")+"\n"+
                            "     "+"DOORS:  "+rs.getString(52).replace("[", "").replace("]", "")+"\n"+
                            "     "+"FLOOR FINISH:  "+rs.getString(53).replace("[", "").replace("]", "")+"\n"+
                            "     "+"CEILING FINISH TYPE:  "+rs.getString(54).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "ADDITIONAL BUILDING CHARACTERISTICS:-"+"\n"+
                            "     "+"FLOOR NO:  "+rs.getString(55)+"\n"+
                            "     "+"NO OF ROOM:  "+rs.getString(56)+"\n"+
                            "(SERVICES)"+"\n"+
                            "     "+"WATER:  "+rs.getString(57).replace("[", "").replace("]", "")+"\n"+
                            "     "+"DRAINAGE:  "+rs.getString(58).replace("[", "").replace("]", "")+"\n"+
                            "     "+"ELECTRICITY:  "+rs.getString(59).replace("[", "").replace("]", "")+"\n"+
                            "(FIXTURES AND FITTINGS)"+"\n"+
                            "     "+"HIGH QUALITY:  "+rs.getString(60).replace("[", "").replace("]", "")+"\n"+
                            "     "+"QOOD QUALITY:  "+rs.getString(61).replace("[", "").replace("]", "")+"\n"+
                            "     "+"AMENITIES:  "+rs.getString(62).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "GENERAL CONDITION:  "+rs.getString(63)+""+rs.getString(64)+""+rs.getString(65)+""+rs.getString(66)+"\n"+
                            "\n"+
                            "ROAD ACCESS:  "+rs.getString(67).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "SITE WORKS:-"+"\n"+
                            "     "+"FENCE TYPE:  "+rs.getString(68).replace("[", "").replace("]", "")+"\n"+
                            "     "+"COMPOUND:  "+rs.getString(69).replace("[", "").replace("]", "")+"\n"+
                            "\n"+
                            "OUT BUILDING:-"+"\n"+
                            "     "+"NONE:  "+rs.getString(70).replace("[", "").replace("]", "")+"\n"+
                            "     "+"NO.1:  "+rs.getString(71).replace("[", "").replace("]", "")+"\n"+
                            "     "+"HYPERLINK:  "+rs.getString(72)+"\n"+
                            "     "+"NO.2:  "+rs.getString(73).replace("[", "").replace("]", "")+"\n"+
                            "     "+"HYPERLINK:  "+rs.getString(74)+"\n"+
                            "     "+"NO.3:  "+rs.getString(75).replace("[", "").replace("]", "")+"\n"+
                            "     "+"HYPERLINK:  "+rs.getString(76)+"\n"+
                            "     "+"NO.4:  "+rs.getString(77).replace("[", "").replace("]", "")+"\n"+
                            "     "+"HYPERLINK:  "+rs.getString(78)+"\n"+
                            "\n"+
                            "BUILDING IMAGES\n" +"\n"+
                            "ACCOMMODATION:  "+"\n"+
                            "     "+"NO. OF FULL BATHS:  "+rs.getString(82)+"\n"+
                            "     "+"NO OF TOILETS:  "+rs.getString(83)+"\n"+
                            "\n"+
                            "AREA CALCULATION AND VALUATION WORKSHEET:-"+"\n"+
                            "(MAIN BUILDING)"+"\n"+
                            "     "+"LENGTH/dia(m):  "+rs.getString(84)+" Meters"+"\n"+
                            "     "+"WITH(m):  "+rs.getString(85)+" Meters"+"\n"+
                            "     "+"AREA/GEA(m square):  "+rs.getString(86)+" Meters Square"+"\n"+
                            "     "+"REDUCING FACTOR:  "+rs.getString(87)+"\n"+
                            "     "+"COMPLETION FACTOR:  "+rs.getString(88)+"\n"+
                            "     "+"REDUCED FLOOR AREA(m square):  "+rs.getString(89)+" Meters Square"+"\n"+
                            "\n"+
                            "(OUT BUILDING NO.1)"+"\n"+
                            "     "+"LENGTH/dia(m):  "+rs.getString(90)+" Meters"+"\n"+
                            "     "+"WITH(m):  "+rs.getString(91)+" Meters"+"\n"+
                            "     "+"AREA/GEA(m square):  "+rs.getString(92)+" Meters Square"+"\n"+
                            "     "+"REDUCING FACTOR:  "+rs.getString(93)+"\n"+
                            "     "+"COMPLETION FACTOR:  "+rs.getString(94)+"\n"+
                            "     "+"REDUCED FLOOR AREA(m square):  "+rs.getString(95)+" Meters Square"+"\n"+
                            "\n"+
                            "(OUT BUILDING NO.2)"+"\n"+
                            "     "+"LENGTH/dia(m):  "+rs.getString(96)+" Meters"+"\n"+
                            "     "+"WITH(m):  "+rs.getString(97)+" Meters"+"\n"+
                            "     "+"AREA/GEA(m square):  "+rs.getString(98)+" Meters Square"+"\n"+
                            "     "+"REDUCING FACTOR:  "+rs.getString(99)+"\n"+
                            "     "+"COMPLETION FACTOR:  "+rs.getString(100)+"\n"+
                            "     "+"REDUCED FLOOR AREA(m square):  "+rs.getString(101)+" Meters Square"+"\n"+
                            "\n"+
                            "(OUT BUILDING NO.3)"+"\n"+
                            "     "+"LENGTH/dia(m):  "+rs.getString(102)+" Meters"+"\n"+
                            "     "+"WITH(m):  "+rs.getString(103)+" Meters"+"\n"+
                            "     "+"AREA/GEA(m square):  "+rs.getString(104)+" Meters Square"+"\n"+
                            "     "+"REDUCING FACTOR:  "+rs.getString(105)+"\n"+
                            "     "+"COMPLETION FACTOR:  "+rs.getString(106)+"\n"+
                            "     "+"REDUCED FLOOR AREA(m square):  "+rs.getString(107)+" Meters Square"+"\n"+
                            "\n"+
                            "(OUT BUILDING NO.4)"+"\n"+
                            "     "+"LENGTH/dia(m):  "+rs.getString(108)+" Meters Square"+"\n"+
                            "     "+"WITH(m):  "+rs.getString(109)+" Meters"+"\n"+
                            "     "+"AREA/GEA(m square):  "+rs.getString(110)+" Meters Square"+"\n"+
                            "     "+"REDUCING FACTOR:  "+rs.getString(111)+"\n"+
                            "     "+"COMPLETION FACTOR:  "+rs.getString(112)+"\n"+
                            "     "+"REDUCED FLOOR AREA(m square): "+rs.getString(113)+" Meters Square"+"\n"+
                            "\n"+
                            "TOTAL RFA: "+rs.getString(114)+"\n"+
                            "\n"+
                            "CALCULATION OF RATEABLE  VALUE:-"+"\n"+
                            "     "+"TOTAL RFA(m square): "+rs.getString(115)+" Meters Square"+"\n"+
                            "     "+"MULTIPLY BY ALL INCLUSIVE RATE(Tsh) :  "+rs.getString(116)+" /=Tsh"+"\n"+
                            "     "+"CURRENT REPLACEMENT COST(Tsh): "+rs.getString(117)+" /=Tsh"+"\n"+
                            "     "+"LESS DEPRECIATION: "+rs.getString(118)+"%"+"\n"+
                            "     "+"DEPRECIATED REPLACEMENT COST/VALUE(Tsh) :  "+rs.getString(119)+" /=Tsh"+"\n"+
                            "\n"+
                            "CERTIFICATION:-"+"\n"+
                            "INSPECTED BY :  "+rs.getString(120)+"\n"+
                            "CHECKED BY :  "+rs.getString(121)+"\n"+
                            "APPROVED BY :  "+rs.getString(122)+"\n"+
                            "\n"+
                            "COMPANY NAME:  "+rs.getString(123)+"\n"+
                            "COMPANY STAMP: "+rs.getString(124)+"\n"+
                            "\n"+
                            "DATE :  "+rs.getString(125)+"\n");
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });
    }


@FXML
    public void printDoc(ActionEvent event) throws HeadlessException, SQLException {
       
        PrintReport viewReport = new PrintReport();
        viewReport.showReport();
        
    }
}