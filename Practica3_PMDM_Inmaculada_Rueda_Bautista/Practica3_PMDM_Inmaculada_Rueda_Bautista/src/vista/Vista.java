package vista;

import controlador.Lista;
import controlador.Nodo;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import modelo.Cuenta;

/**
 *
 * @author Inmaclada Rueda Bautista
 */
public class Vista extends javax.swing.JFrame {
    
    public static Lista lista = new Lista();
    private static Nodo nodoPadre = new Nodo();
    private static int contadorCuentas = 0;
    Cuenta c;
    
    public Vista() {
        initComponents();
        crearListaCuentas();
        cargarDatosVista();
        this.btAddCuenta.setVisible(false);
        btCancelar.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCuentas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pDatos = new javax.swing.JPanel();
        txtCuenta = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btAtras = new javax.swing.JButton();
        btSiguiente = new javax.swing.JButton();
        btCrear = new javax.swing.JButton();
        btAddCuenta = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nº de Cuenta:");

        jLabel2.setText("Fecha:");

        jLabel3.setText("Saldo:");

        jLabel4.setText("Propietario: ");

        javax.swing.GroupLayout pCuentasLayout = new javax.swing.GroupLayout(pCuentas);
        pCuentas.setLayout(pCuentasLayout);
        pCuentasLayout.setHorizontalGroup(
            pCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCuentasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pCuentasLayout.setVerticalGroup(
            pCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCuentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
            .addGroup(pDatosLayout.createSequentialGroup()
                .addComponent(txtPropietario)
                .addContainerGap())
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lbTitulo.setText("Cuentas Bancarias");

        btAtras.setText("Atrás");
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        btSiguiente.setText("Siguiente");
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });

        btCrear.setText("Crear cuenta");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        btAddCuenta.setText("Añadir cuenta");
        btAddCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCuentaActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAtras)
                .addGap(36, 36, 36)
                .addComponent(btCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btSiguiente)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btAddCuenta)
                .addGap(31, 31, 31)
                .addComponent(btCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtras)
                    .addComponent(btSiguiente)
                    .addComponent(btCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddCuenta)
                    .addComponent(btCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lbTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
        retroceder();
    }//GEN-LAST:event_btAtrasActionPerformed

    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed
        avanzar();
    }//GEN-LAST:event_btSiguienteActionPerformed

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        Cuenta aux = (Cuenta)lista.getNodoActual().getNodoActual();
        int contadorAxu = aux.getNumeroCuenta()+1;
        c = new Cuenta(contadorAxu, new GregorianCalendar());
        this.btAtras.setVisible(false);
        this.btSiguiente.setVisible(false);
        this.btCrear.setVisible(false);
        this.btAddCuenta.setVisible(true);
        this.txtCuenta.setText(String.valueOf(c.getNumeroCuenta()));
        this.txtCuenta.setEnabled(false);
        this.txtFecha.setText(String.valueOf(formatoFecha(c.getFecha())));
        this.txtFecha.setEnabled(false);
        this.txtSaldo.setText(null);
        this.txtPropietario.setText(null);
        btCancelar.setVisible(true);
        
    }//GEN-LAST:event_btCrearActionPerformed

    private void btAddCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCuentaActionPerformed
        c.setSaldo(Float.valueOf(this.txtSaldo.getText()));
        c.setPropietario(this.txtPropietario.getText());
        c.setNumeroCuenta(getContadorCuentas());
        Nodo nodo = new Nodo();
        nodo.setNodoActual(c);
        lista.addNodo(nodo);
        cargarDatosVista();
        c=null;
        this.btAddCuenta.setVisible(false);
        this.btCrear.setVisible(true);
        this.txtCuenta.setEnabled(true);
        this.txtFecha.setEnabled(true);
        btCancelar.setVisible(false);
    }//GEN-LAST:event_btAddCuentaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.btAtras.setVisible(true);
        this.btSiguiente.setVisible(true);
        this.btCrear.setVisible(true);
        this.btAddCuenta.setVisible(false);
        this.txtCuenta.setEnabled(true);
        this.txtFecha.setEnabled(true);
        btCancelar.setVisible(false);
        cargarDatosVista();

    }//GEN-LAST:event_btCancelarActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    //método que nos carga el último nodo añadido a la lista
    public void cargarDatosVista() {
        Nodo nodoActual = lista.getNodoActual();
        Cuenta cuenta = (Cuenta) nodoActual.getNodoActual();
        
        this.txtCuenta.setText(String.valueOf(cuenta.getNumeroCuenta()));
        this.txtFecha.setText(formatoFecha(cuenta.getFecha()));
        this.txtSaldo.setText(String.valueOf(cuenta.getSaldo()));
        this.txtPropietario.setText(String.valueOf(cuenta.getPropietario()));
        
        if (nodoActual.getNodoSiguiente() == null) {
            this.btSiguiente.setVisible(false);
        } else {
            this.btSiguiente.setVisible(true);
        }
        if (nodoActual.getNodoAnterior() == null) {
            this.btAtras.setVisible(false);
        } else {
            this.btAtras.setVisible(true);
        }
    }

    /**
     * Método que crea una cuenta nueva y la asigna a la lista como nodo.
     *
     * @param fecha
     * @param saldo
     * @param propietario
     */
    public void crearNuevaCuenta(GregorianCalendar f, float saldo, String propietario) {
        Cuenta cuenta = new Cuenta(getContadorCuentas(), f, saldo, propietario);
        Nodo nodo = new Nodo();
        nodo.setNodoActual(cuenta);
        lista.addNodo(nodo);
    }

    /**
     * Crea una lista inicial de 5 cuentas
     */
    public void crearListaCuentas() {
        crearNuevaCuenta(new GregorianCalendar(), 2500.50f, "INMA");
        crearNuevaCuenta(new GregorianCalendar(), 3500.50f, "ALMA");
        crearNuevaCuenta(new GregorianCalendar(), 4500.50f, "NAZARET");
        crearNuevaCuenta(new GregorianCalendar(), 5500.50f, "JORGE");
        crearNuevaCuenta(new GregorianCalendar(), 5500.50f, "TOMÁS");
        
    }

    /**
     * Método que da formato a la fecha de tipo gregorianCalendar
     *
     * @param calendar
     * @return fecha formateada string
     */
    public static String formatoFecha(GregorianCalendar calendar) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());
        
        return dateFormatted;
    }

    /**
     * Método que se encarga de retroceder en la lista de nodos
     */
    public void retroceder() {
        //ponemos en el objeto auxiliar (pivote) el nodo anterior al actual
        lista.setNodoPivote(lista.getNodoActual().getNodoAnterior());
        //ponemos al pivote la referencia al siguiente (hasta ahora no tenía) = actual
        lista.getNodoPivote().setNodoSiguiente(lista.getNodoActual());
        //asignamos el nodo actual como el pivote
        lista.setNodoActual(lista.getNodoPivote());
        //liberamos el pivote
        lista.setNodoPivote(null);
        //cargamos (refrescamos) la vista
        cargarDatosVista();
    }

    /**
     * Método que se encarga de avanzar en la lista de nodos
     */
    public void avanzar() {
        //ponemos en el objeto axuliar (pivote) el nodo siguiente al actual
        lista.setNodoPivote(lista.getNodoActual().getNodoSiguiente());
        //ponemos como nodo actual el pivote (siguiente)
        lista.setNodoActual(lista.getNodoPivote());
        //dejamos libre el pivote
        lista.setNodoPivote(null);
        // cargamos (refrescamos la vista)
        cargarDatosVista();
    }

    /**
     * Método que obtiene el siguiente número de cuenta secuencial
     *
     * @return contadorCuentas
     */
    private int getContadorCuentas() {
        return ++this.contadorCuentas;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCuenta;
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pCuentas;
    private javax.swing.JPanel pDatos;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
