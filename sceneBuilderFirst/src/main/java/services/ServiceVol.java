package services;

import entities.Vol;
import utils.MaConnexion;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ServiceVol implements IService<Vol> {
    private Connection cnx;

    public ServiceVol() {
        cnx = MaConnexion.getInstance().getCnx();
    }

    @Override
    public void createOne1(Vol vol) throws SQLException {
        String req = "INSERT INTO `vol`(`id_vol`, `num_vol`, `aero_depart`, `aero_arrivee`, `jour_vol`, `heure_depart`, `heure_arrivee`, `id_avion`, `id_escale`) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(req);
        st.setInt(1, vol.getId_vol());
        st.setInt(2, vol.getNum_vol());
        st.setString(3, vol.getAero_depart());
        st.setString(4, vol.getAero_arrivee());
        st.setString(5, vol.getJour_vol());
        st.setString(6, vol.getHeure_depart());
        st.setString(7, vol.getHeure_arrivee());
        st.setInt(8, vol.getId_avion());
        st.setInt(9, vol.getEscale().getId_escale());
        st.executeUpdate();
        System.out.println("trajet ajouté !");
    }


    @Override
    public void updateOne(Vol vol) throws SQLException {
        String req= "UPDATE `vol` SET `num_vol`=?,`aero_depart`=?,`aero_arrivee`=?,`jour_vol`=?,`heure_depart`=?,`heure_arrivee`=?,`id_avion`=?,`id_escale`=? WHERE `id_vol`=?"  ;
        PreparedStatement ps = cnx.prepareStatement(req);

        ps.setInt(1, vol.getNum_vol());
        ps.setString(2, vol.getAero_depart());
        ps.setString(3, vol.getAero_arrivee());
        ps.setString(4, vol.getJour_vol());
        ps.setString(5, vol.getHeure_depart());
        ps.setString(6, vol.getHeure_arrivee());
        ps.setInt(7, vol.getId_avion());
        ps.setInt(8, vol.getEscale().getId_escale());
        ps.setInt(9, vol.getId_vol());
        ps.executeUpdate();
        System.out.println("update done");

    }

    @Override
    public void deleteOne(int id_vol) throws SQLException {
        String req= "DELETE FROM `vol` WHERE `id_vol`=?";
        PreparedStatement ps = cnx.prepareStatement(req);
        ps.setInt(1,id_vol);
        ps.executeUpdate();
        System.out.println("supprimé");

    }

    ServiceEscale se= new ServiceEscale();
    @Override
    public List<Vol> selectAll() throws SQLException {
        List<Vol> temp = new ArrayList<>();

        String req = "SELECT * FROM `vol` ";

        PreparedStatement ps = cnx.prepareStatement(req);

        ResultSet rs = ps.executeQuery();

        while (rs.next()){

            Vol t= new Vol();

            t.setId_vol(rs.getInt(1));
            t.setNum_vol(rs.getInt(2));
            t.setAero_depart(rs.getString(3));
            t.setAero_arrivee(rs.getString(4));
            t.setJour_vol(rs.getString(5));
            t.setHeure_depart(rs.getString(6));
            t.setHeure_arrivee(rs.getString(7));
            t.setId_avion(rs.getInt(8));
            t.setEscale(se.FindById(rs.getInt(9)));



            temp.add(t);

        }


        return temp;
    }


    @Override
    public Vol FindById(int id) throws SQLException {
        String req="SELECT * FROM `vol` WHERE `id`=?";
        PreparedStatement ps = cnx.prepareStatement(req);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        Vol t = new Vol();

        while (rs.next()) {


            t.setId_vol(rs.getInt("id_vol"));
            t.setNum_vol(rs.getInt("num_vol"));
            t.setAero_depart(rs.getString("aero_depart"));
            t.setAero_arrivee(rs.getString("aero_arrivee"));
            t.setJour_vol(rs.getString("jour_vol"));
            t.setHeure_depart(rs.getString("heure_depart"));
            t.setHeure_arrivee(rs.getString("heure_arrivee"));
            t.setId_avion(rs.getInt("id_avion"));
            t.setEscale(se.FindById(rs.getInt("id_escale")));
        }




        return t;
    }

}
