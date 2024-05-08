
import DAO.ContratoDao;
import DAO.IContratoDao;
import DAO.Mock.ContratoDaoMock;
import Service.ContratoService;
import Service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author guiol
 */
public class ContratoServiceTest {

    @Test
    public void salvarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String buscar = service.buscar();
        Assert.assertEquals("Sucesso", buscar);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String buscar = service.buscar();
        Assert.assertEquals("Sucesso", buscar);
    }

    @Test
    public void excluirTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String excluir = service.excluir();
        Assert.assertEquals("Sucesso", excluir);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String excluir = service.excluir();
        Assert.assertEquals("Sucesso", excluir);
    }

    @Test
    public void atualizarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String atualizar = service.atualizar();
        Assert.assertEquals("Sucesso", atualizar);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String atualizar = service.atualizar();
        Assert.assertEquals("Sucesso", atualizar);
    }
}
