import Footer from "components/Footer";
import Navbar from "components/Navbar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <Navbar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DSVendas</h1>
                    <p className="lead">Analise o desempenho das suas vendas por diferentes perpectivas</p>
                    <hr/>
                    <p>Esta aplicação consiste em exibir um dashbaoard a partir de dados fornecidos por um back end contruído com Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Veja o Dashboard
                    </Link>
                </div>    
            </div>
            <Footer />
        </>
    );
}

export default Home;