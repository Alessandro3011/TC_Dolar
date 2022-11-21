package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import entities.Dolar;
import entities.Usuario;
import interfaces.DolarInterfaces;
import lombok.Getter;
import lombok.Setter;

public class DolarDAO implements DolarInterfaces{

	@Override
	public int registrarDolar(Dolar obj) {
		int resultado = -1;
		Conexion conexion = new Conexion();
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			cn= conexion.conectar();
			String sql = "Insert into tcdolarxdia values (null,?,curdate())";
			ps = cn.prepareStatement(sql);
		    ps.setDouble(1, obj.getDC_TIPCAMB());
		    resultado = ps.executeUpdate();					
		}catch(SQLException e) {
			System.out.print("ERROR AL REGISTRAR: "+e.getMessage());
		}finally {
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(cn!=null) cn.close();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}		
		return resultado;
	}

	@Override
	public int eliminarPersona(int IN_ID_TCDolarXdia) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizarPersona(Dolar obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("finally")
	@Override
	public List<Dolar> listado(String fec1, String fec2) {
		ArrayList<Dolar> dol = new ArrayList<Dolar>();
		Conexion conexion = new Conexion();
		Connection cn = null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			cn = conexion.conectar();
			String sql = "select * from TCDolarXdia where DT_FEC_REG = ? AND DT_FEC_REG = ?";
			pstm=cn.prepareStatement(sql);
			pstm.setString(1, fec1);
        	pstm.setString(2, fec2);
			rs=pstm.executeQuery();
			Dolar obj = new Dolar();
			while(rs.next()) {
				obj=new Dolar();
				obj.setIN_ID_TCDolarXdia(rs.getInt(1));
				obj.setDC_TIPCAMB(rs.getDouble(2));
				obj.setDT_FEC_REG(rs.getDate(3));
				dol.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(cn!=null)cn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch(final Exception e) {
				e.printStackTrace();
			}
			return dol;
		}
	}
	
	@Override
	public ArrayList<Dolar> listadoDolar(String query) {
		ArrayList<Dolar> list = new ArrayList<Dolar>();
		Conexion conexion = new Conexion();
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			cn = conexion.conectar();
			String sql = "select * from TCDolarXdia ";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			Dolar obj = new Dolar();
			while(rs.next()) {
				obj = new Dolar();
				obj.setIN_ID_TCDolarXdia(rs.getInt(1));
				obj.setDC_TIPCAMB(rs.getDouble(2));
				obj.setDT_FEC_REG(rs.getDate(3));
				list.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
				if(cn!=null)cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
		
	}

}
