package services;

import entities.Escale;
import utils.MaConnexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceEscale implements IService<Escale> {
    private Connection cnx;

    public ServiceEscale() {
        cnx = MaConnexion.getInstance().getCnx();
    }

    @Override
    public void createOne1(Escale escale) throws SQLException {
        String req = "INSERT INTO `escale`(`id_escale`, `aero_escale`, `heure_depart`, `heure_arrivee`, `jour_escale`) VALUES (?,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(req);
        st.setInt(1, escale.getId_escale());
        st.setString(2, escale.getAero_escale());
        st.setString(3, escale.getHeure_depart());
        st.setString(4, escale.getHeure_arrivee());
        st.setString(5, escale.getJour_escale());
        st.executeUpdate();
        System.out.println("escale ajouté !");
    }
    @Override
    public void updateOne(Escale escale) throws SQLException {
        String req= "UPDATE `escale` SET `aero_escale`=?,`heure_depart`=?,`heure_arrivee`=?,`jour_escale`=? WHERE `id_escale`=?" ;
        PreparedStatement ps = cnx.prepareStatement(req);

        ps.setString(1, escale.getAero_escale());
        ps.setString(2, escale.getHeure_depart());
        ps.setString(3, escale.getHeure_arrivee());
        ps.setString(4, escale.getJour_escale());
        ps.setInt(5, escale.getId_escale());
        ps.executeUpdate();
        System.out.println("nidhal y mhaff");

    }

    @Override
    public void deleteOne(int id_escale) throws SQLException {
        String req= "DELETE FROM `escale` WHERE `id_escale`=?";
        PreparedStatement ps = cnx.prepareStatement(req);
        ps.setInt(1,id_escale);
        ps.executeUpdate();
        System.out.println("supprimé");

    }

    @Override
    public List<Escale> selectAll() throws SQLException {
        List<Escale> temp = new ArrayList<>();

        String req = "SELECT * FROM `escale` ";

        PreparedStatement ps = cnx.prepareStatement(req);

        ResultSet rs = ps.executeQuery();

        while (rs.next()){

           Escale t= new Escale();

            t.setId_escale(rs.getInt("id_escale"));
            t.setAero_escale(rs.getString("aero_escale"));
            t.setHeure_depart(rs.getString("heure_depart"));
            t.setHeure_arrivee(rs.getString("heure_arrivee"));
            t.setJour_escale(rs.getString("jour_escale"));

            temp.add(t);

        }


        return temp;

    }

    @Override
    public Escale FindById(int id) throws SQLException {
        String req="SELECT * FROM `escale` WHERE `id`=?";
        PreparedStatement ps = cnx.prepareStatement(req);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        Escale e = new Escale();
        while (rs.next()) {

            e.setId_escale(rs.getInt("id_escale"));
            e.setAero_escale(rs.getString("aero_escale"));
            e.setHeure_depart(rs.getString("heure_depart"));
            e.setHeure_arrivee(rs.getString("heure_arrivee"));
            e.setJour_escale(rs.getString("jour_escale"));
        }
        return e;
    }


}
