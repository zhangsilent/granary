
var topReportOptions = function(data, strokeColor) {
    return {
        series: [{
            data: data
        }],
        chart: {
            height: 40,
            type: 'line',
            zoom: {
                enabled: false
            },
            toolbar: {
                show: false
            },
            parentHeightOffset: 0
        },
        dataLabels: {
            enabled: false
        },
        stroke: {
            curve: 'smooth',
            width: 3,
            colors: strokeColor
        },
        grid: {
            padding: {
                left: -7,
                right: 0,
                bottom: -12,
                top: -25
            }
        },
        tooltip: {
            enabled: false
        },
        xaxis: {
            labels: {
                show: false
            },
            tooltip: {
                enabled: false,
            },
            axisBorder: {
                show: false
            },
            axisTicks: {
                show: false
            },
        },
        yaxis: {
            min: 0,
            max: 20,
            tickAmount: 2,
            labels: {
                show: false
            },
        },
    }
};

var topReportChart1 = new ApexCharts(document.querySelector(".top-report-chart-1"), topReportOptions([0, 20, 5, 20, 5, 10], '#372EED'));
topReportChart1.render();
var topReportChart2 = new ApexCharts(document.querySelector(".top-report-chart-2"), topReportOptions([0, 2, 15, 3, 20], '#FEB5CE'));
topReportChart2.render();
var topReportChart3 = new ApexCharts(document.querySelector(".top-report-chart-3"), topReportOptions([0, 15, 5, 20], '#3B50E1'));
topReportChart3.render();
var topReportChart4 = new ApexCharts(document.querySelector(".top-report-chart-4"), topReportOptions([10, 0, 20, 10], '#C693FE'));
topReportChart4.render();

/*==
    Weekly Statistics Chart
============================================*/
var weeklyStatisticsOptions = function(data, colors, labels) {
    return {
        series: data,
        chart: {
            type: 'bar',
            height: 270,
            toolbar: {
                show: false
            },
            parentHeightOffset: 0
        },
        colors: colors,
        dataLabels: {
            enabled: false
        },
        plotOptions: {
            bar: {
                horizontal: false,
                columnWidth: 8,
                startingShape: 'rounded',
                endingShape: 'rounded',
                colors: {
                    backgroundBarColors: ['#EEEEFE'],
                },
            },
        },
        grid: {
            xaxis: {
                lines: {
                    show: false
                }
            },
            yaxis: {
                lines: {
                    show: false
                }
            }
        },
        tooltip: {
            x: {
                formatter: function(val) {
                    return val + ' Week'
                }
            },
            y: {
                formatter: function(val) {
                    return  val
                }
            }
        },
        xaxis: {
            categories: labels,
            axisBorder: {
                show: false
            },
            axisTicks: {
                show: false
            },
            labels: {
                style: {
                    colors: ['#202442'],
                    fontSize: '14px',
                    fontFamily: 'Titillium Web',
                    cssClass: 'apexcharts-yaxis-label',
                }
            },
            crosshairs: {
                show: false
            },
        },
        yaxis: {
            max: 10000,
            tickAmount: 4,
            labels: {
                align: 'left',
                style: {
                    colors: ['#202442'],
                    fontSize: '14px',
                    fontFamily: 'Titillium Web',
                    cssClass: 'apexcharts-yaxis-label',
                },
                formatter: (val) => {
                    return  val
                },
            }
        }
    }
};

var weeklyStatisticsDataSet1 = {
        data: [{
            name: 'week',
            data: [7500, 5500, 9500, 2500, 9500, 5500]
        }],
        colors: ['#45EEDD'],
        labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
    },
    {
        data,
        colors,
        labels
    } = weeklyStatisticsDataSet1,
    weeklyStatisticsChart1 = new ApexCharts(document.querySelector(".weekly-statistics-chart"), weeklyStatisticsOptions(data, colors, labels));
weeklyStatisticsChart1.render();






