import axios from 'axios';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    series: number[];
    labels: string[];
}

const DonutChart = () => {
    //FORMA ERRADA - SUBSTITUIR
    let chartData : ChartData = { labels: [], series: [] };
    //FORMA ERRADA - SUBSTITUIR
    axios.get(`${BASE_URL}/sales/amount-by-seller`)
        .then((response) => {
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.sellerName);
            const mySeries = data.map(x => x.sum);
            chartData = { labels: myLabels, series: mySeries };
            console.log(chartData)
        });

    const options = {
        legend: {
            show: true
        }
    }
    
    return (
        <Chart
            options={{ ...options, labels: chartData.labels}}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;