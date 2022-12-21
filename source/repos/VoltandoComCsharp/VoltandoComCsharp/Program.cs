using System;
using System.Globalization;


namespace SimpleActivity
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Funcionarios funcionarios = new Funcionarios();


            Console.Write("Informe o seu Nome: ");
            funcionarios.nomeDoFuncionario = Console.ReadLine();
            Console.WriteLine();
            Console.Write("Informe suas horas trabalhadas hoje: ");
            funcionarios.horasTrabalhadas = double.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.Write(funcionarios.nomeDoFuncionario + ", informe quanto você ganha por hora trabalhada: ");
            funcionarios.moneyPerHour = double.Parse(Console.ReadLine());
            Console.WriteLine("Ok, so um momento estamos calculando...");
            Console.WriteLine();
            funcionarios.salarioTotal = funcionarios.horasTrabalhadas * funcionarios.moneyPerHour;
            Console.WriteLine();
            Console.WriteLine(funcionarios.ToString());


        }


        public class Funcionarios
        {
            public string nomeDoFuncionario;
            public double moneyPerHour, horasTrabalhadas, salarioTotal;

            public override string ToString()
            {
                return nomeDoFuncionario + ", calculamos aqui e você ganha exatos: R$ " + salarioTotal.ToString("F2", CultureInfo.InvariantCulture);
            }
        }
    }

}
