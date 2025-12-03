package com.sistemainventario.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ventanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SISTEMA DE GESTIÓN DE INVENTARIO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(78, 10, 507, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnAgregar = new JButton("Agregar Producto");
		btnAgregar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAgregar.setBounds(93, 111, 174, 35);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar Producto");
		btnEliminar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnEliminar.setBounds(365, 111, 174, 35);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("Consultar Stock");
		btnConsultar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnConsultar.setBounds(93, 203, 174, 35);
		contentPane.add(btnConsultar);
		
		JButton btnActualizarProducto = new JButton("Actualizar Producto");
		btnActualizarProducto.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnActualizarProducto.setBounds(365, 203, 174, 35);
		contentPane.add(btnActualizarProducto);

	}
}
